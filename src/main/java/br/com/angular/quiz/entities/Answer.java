package br.com.angular.quiz.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.angular.quiz.resource.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "answer")
public class Answer extends BaseEntity {
	private String value;
	private Boolean checked;
}
