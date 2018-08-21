package br.com.sitemaatendimentopsicologico.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Psicologo {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private int crp;
	private Abordagem Abordagem;
	private Consulta consulta;
	private String email;
	private LocalDate dataDeNascimento;

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

	public int getCrp() {
		return crp;
	}

	public void setCrp(int crp) {
		this.crp = crp;
	}

	public Abordagem getAbordagem() {
		return Abordagem;
	}

	public void setAbordagem(Abordagem abordagem) {
		Abordagem = abordagem;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

}
