package br.com.angular.quiz.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.angular.quiz.entities.Ask;
import br.com.angular.quiz.repositories.AskRepository;
import br.com.angular.quiz.resource.BaseController;
import br.com.angular.quiz.services.AskService;

@CrossOrigin
@RestController
@RequestMapping("ask")
public class AskController extends BaseController<Ask, AskRepository, AskService> {

}
