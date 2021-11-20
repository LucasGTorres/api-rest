package com.produtos.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="TB_PRODUTO")
public class Produto implements Serializable{

	//private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //Cria automaticamente o ID no banco de dados
	private long id;
	
	private String nome;
	
	private BigDecimal quantidade;
	
	private BigDecimal valor;

}
