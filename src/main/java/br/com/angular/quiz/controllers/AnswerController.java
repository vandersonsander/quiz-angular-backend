package br.com.angular.quiz.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.angular.quiz.entities.Answer;
import br.com.angular.quiz.repositories.AnswerRepository;
import br.com.angular.quiz.resource.BaseController;
import br.com.angular.quiz.services.AnswerService;

@CrossOrigin
@RestController
@RequestMapping("answer")
public class AnswerController extends BaseController<Answer, AnswerRepository, AnswerService>{

}
