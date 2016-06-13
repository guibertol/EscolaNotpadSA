package br.escolanotpad.sc.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Pergunta {
	@Id
	@GeneratedValue
	private Long id;
	private String tituloPergunta;
	@Column(columnDefinition = "TEXT")
	private String descricao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTituloPergunta() {
		return tituloPergunta;
	}
	public void setTituloPergunta(String tituloPergunta) {
		this.tituloPergunta = tituloPergunta;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
