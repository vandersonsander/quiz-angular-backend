package br.com.angular.quiz.entities;

import java.util.List;

import javax.persistence.Entity;
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
@Table(name = "chapter")
public class Chapter extends BaseEntity {
	
	private String title;
	
	@OneToMany(mappedBy = "chapter")
	@JsonIgnoreProperties("chapter")
	private List<Ask> asks;

}
