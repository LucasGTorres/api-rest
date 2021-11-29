package com.produtos.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Data;



@Data
@Entity
@Table(name="TB_PRODUTOS")
public class Produto {

	//private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //Cria automaticamente o ID no banco de dados
	private long id;

	@NotBlank
	private String nome;

	@Min(0)
	private BigDecimal quantidade;

	@Min(0)
	private BigDecimal valor;

}
