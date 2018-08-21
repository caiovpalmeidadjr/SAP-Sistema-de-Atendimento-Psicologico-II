package br.com.sitemaatendimentopsicologico.model;

public class TipoAbordagem {

	private long id;
	private String nome;
	private Psicologo psicologo;
	private Abordagem abordagem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Psicologo getPsicologo() {
		return psicologo;
	}

	public void setPsicologo(Psicologo psicologo) {
		this.psicologo = psicologo;
	}

	public Abordagem getAbordagem() {
		return abordagem;
	}

	public void setAbordagem(Abordagem abordagem) {
		this.abordagem = abordagem;
	}

}
