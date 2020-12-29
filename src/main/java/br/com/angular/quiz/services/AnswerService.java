package br.com.angular.quiz.services;

import org.springframework.stereotype.Service;

import br.com.angular.quiz.entities.Answer;
import br.com.angular.quiz.repositories.AnswerRepository;
import br.com.angular.quiz.resource.BaseService;

@Service
public class AnswerService extends BaseService<Answer, AnswerRepository> {

}
