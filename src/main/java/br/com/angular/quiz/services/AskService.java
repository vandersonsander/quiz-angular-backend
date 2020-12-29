package br.com.angular.quiz.services;

import org.springframework.stereotype.Service;

import br.com.angular.quiz.entities.Ask;
import br.com.angular.quiz.repositories.AskRepository;
import br.com.angular.quiz.resource.BaseService;

@Service
public class AskService extends BaseService<Ask, AskRepository> {

}
