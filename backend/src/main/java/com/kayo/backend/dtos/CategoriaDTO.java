package com.kayo.backend.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.kayo.backend.domain.Categoria;

public class CategoriaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message = "Campo NOME é requerido")
	@Length(min = 2, max = 100, message = "O campo Nome deve ter entre 3 e 100 caracteres")
	private String name;
	
	@NotEmpty(message = "Campo DESCRIÇÃO é requerido")
	@Length(min = 3, max = 200, message = "O campo DESCRIÇÃO deve ter entre 3 e 200 caracteres")
	private String descricao;
	
	
	public CategoriaDTO() {
		super();
	}


	public CategoriaDTO(Categoria obj) {
		super();
		this.id = obj.getId();
		this.name = obj.getName();
		this.descricao = obj.getDescricao();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
