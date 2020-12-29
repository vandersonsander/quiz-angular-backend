package br.com.angular.quiz.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.angular.quiz.entities.Chapter;
import br.com.angular.quiz.repositories.ChapterRepository;
import br.com.angular.quiz.resource.BaseController;
import br.com.angular.quiz.services.ChapterService;

@CrossOrigin
@RestController
@RequestMapping("chapter")
public class ChapterController extends BaseController<Chapter, ChapterRepository, ChapterService> {

}
