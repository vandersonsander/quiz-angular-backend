package br.com.angular.quiz.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	
	@ManyToOne
	@JoinColumn(name = "fk_id_ask")
	@JsonIgnoreProperties("answers")
	private Ask ask;
}
