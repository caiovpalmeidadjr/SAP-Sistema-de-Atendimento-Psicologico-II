package br.com.sitemaatendimentopsicologico.model;

import java.time.LocalDate;

public class Consulta {

	private Long id;
	private String nome;
	private LocalDate data;
	private double valor;
	private LocalDate dataPagamento;
	private Abordagem abordagem;
	private TipoAbordagem tipoAbordagem;
	private Psicologo psicologo;
	private Paciente paciente;
	private Doenca doença;

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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Abordagem getAbordagem() {
		return abordagem;
	}

	public void setAbordagem(Abordagem abordagem) {
		this.abordagem = abordagem;
	}

	public TipoAbordagem getTipoAbordagem() {
		return tipoAbordagem;
	}

	public void setTipoAbordagem(TipoAbordagem tipoAbordagem) {
		this.tipoAbordagem = tipoAbordagem;
	}

	public Psicologo getPsicologo() {
		return psicologo;
	}

	public void setPsicologo(Psicologo psicologo) {
		this.psicologo = psicologo;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Doenca getDoença() {
		return doença;
	}

	public void setDoença(Doenca doença) {
		this.doença = doença;
	}

}
