package br.com.wakandaacademy.Cliente.cliente.domain;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO
	@Column(columnDefinition = "UUID" , name = "idCliente", unique = true,nullable = false,updatable = false)
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank	
	@Email
	private String email;
	@NotBlank
	private String celular;
	private String telefone;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	@CPF
	@NotBlank
	private String cpf;
	@NotNull
	private LocalDate dataNascimento;
	private Boolean aceitaTermos = true;
	
	private LocalDateTime dataHoradoCadastro; 
	private LocalDateTime dataHoradaUltimaAlteracao;
	
		
	}
	
	
}
