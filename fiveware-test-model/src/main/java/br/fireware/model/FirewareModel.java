package br.fireware.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe responsável por representar a entidade da aplicação.
 * @author Danillo
 *
 */
@Entity
@Table(name = "Usuario")
public class FirewareModel implements Serializable{

	 /**
	 * atributo serial
	 */
	private static final long serialVersionUID = 1L;

	 @Id
	 @GeneratedValue
	 private Long id;
	
	 @Column(name = "nome")
	 private String nome;
	 
	 @Column(name = "sobrenome")
	 private String sobreNome;
	 
	 @Column(name = "estado_civil")
	 private String estadoCivil;
	 
	 @Column(name = "sexo")
	 private String sexo;
	 
	 @Column(name = "estado")
	 private String estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	 
	 
	
}
