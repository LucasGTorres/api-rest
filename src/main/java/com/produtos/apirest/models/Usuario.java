package com.produtos.apirest.models;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import lombok.Data;

@Data
@Entity
@Table(name="TB_USUARIOS")
public class Usuario {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO) //Cria automaticamente o ID no banco de dados
		private long id;

		@NotBlank
		private String nome;
		
		@NotBlank
		private String sobrenome;

		@CPF
		private String cpf;

		@NotBlank
		@Email
		private String email;

		@NotBlank
		private String password;
		
		private String telefone;
}
