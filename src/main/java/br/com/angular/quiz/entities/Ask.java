package br.com.angular.quiz.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.angular.quiz.resource.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "ask")
public class Ask extends BaseEntity {
	private String value;
	private String type;
	private String answer;
	
	@OneToMany(mappedBy="ask")
	@JsonIgnoreProperties("ask")
	private List<Answer> answers;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_chapter")
	@JsonIgnoreProperties("asks")
	private Chapter chapter;
}
