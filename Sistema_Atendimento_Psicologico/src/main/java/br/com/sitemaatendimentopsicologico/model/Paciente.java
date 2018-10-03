package br.com.sitemaatendimentopsicologico.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Paciente {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private LocalDate dataDeNascimento;
	private String telefone;
	private String celular;
	private String email;
	private List<Queixa> listQueixa;
	private Consulta consulta;
	private Doenca doenca;

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

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	@OneToMany
	@JoinColumn(name = "id_queixa")
	public List<Queixa> getListQueixa() {
		return listQueixa;
	}
	
	public void setListQueixa(List<Queixa> listQueixa) {
		this.listQueixa = listQueixa;
	}
	
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public Doenca getDoenca() {
		return doenca;
	}

	public void setDoenca(Doenca doenca) {
		this.doenca = doenca;
	}

}
