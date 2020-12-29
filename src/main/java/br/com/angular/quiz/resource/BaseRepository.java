package br.com.angular.quiz.resource;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract interface BaseRepository<Entity extends BaseEntity> extends JpaRepository<Entity, Integer> {

}
