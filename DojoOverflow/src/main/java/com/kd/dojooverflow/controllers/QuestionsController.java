package com.kd.dojooverflow.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kd.dojooverflow.models.Answers;
import com.kd.dojooverflow.models.Questions;
import com.kd.dojooverflow.models.TagQuestions;
import com.kd.dojooverflow.models.Tags;
import com.kd.dojooverflow.services.AnswersServices;
import com.kd.dojooverflow.services.QuestionsServices;
import com.kd.dojooverflow.services.TagsQuestionsServices;
import com.kd.dojooverflow.services.TagsServices;

@Controller
public class QuestionsController {
	private final QuestionsServices qS;
	private final TagsServices tS;
	private final TagsQuestionsServices tQS;
	private final AnswersServices aS;
	
	public QuestionsController(QuestionsServices qS, TagsServices tS, TagsQuestionsServices tQS, AnswersServices aS) {
		this.qS = qS;
		this.tS = tS;
		this.tQS = tQS;
		this.aS = aS;
	}
	@RequestMapping("/questions")
	public String dash(Model model) {
		List<Questions> q = qS.findAllQuestions();
		model.addAttribute("allquestions", q);
		return "dashboard.jsp";
	}
	@RequestMapping("/questions/{questionId}")
	public String display(@PathVariable("questionId") Long questionId, Model model) {
		Questions q = qS.findById(questionId);
		List<Answers> a = aS.findByQuestionId(questionId);
		model.addAttribute("question", q);
		model.addAttribute("ans",a);
		return "show.jsp";
	}
	@RequestMapping("/questions/new")
	public String newQuestion() {
		return "new.jsp";
	}
	
	@PostMapping("/questions")
	public String front(@RequestParam("question") String q, @RequestParam("tag") String t, RedirectAttributes redirectAttributes) {
		
		String[] tags = t.split(",");
		Questions que = new Questions();
		if(tags.length >3) {
			redirectAttributes.addFlashAttribute("error", "Please input 3 tags only");
			return "redirect:/questions/new";
		}
		else {
			que.setQuestion(q);
			qS.createQuestions(que);		
			for(String tag : tags) {
				Tags newTag =tS.findTagsBySubject(tag.trim());		
				TagQuestions tQ = new TagQuestions();
				tQ.setQuestion(que);
				tQ.setTag(newTag);
				tQS.createTagQuestion(tQ);
			}
			return "redirect:/questions";
		
		}
	}
	
	
	@PostMapping("/questions/{questionId}")
	public String ans(@RequestParam("answer") String a, @PathVariable("questionId") Long questionId) {
		Answers an= new Answers();
		Questions q= qS.findById(questionId);
		an.setAnswer(a);
		an.setQuestion(q);
		aS.createAnswer(an);
		return "redirect:/questions/"+questionId;		
	}
}
