package br.com.angular.quiz.services;

import org.springframework.stereotype.Service;

import br.com.angular.quiz.entities.Chapter;
import br.com.angular.quiz.repositories.ChapterRepository;
import br.com.angular.quiz.resource.BaseService;

@Service
public class ChapterService extends BaseService<Chapter, ChapterRepository> {

}
