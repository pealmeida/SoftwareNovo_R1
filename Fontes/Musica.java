package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_MUSICA")
@SequenceGenerator(name="musica",sequenceName="SQ_T_MUSICA",allocationSize=1)
public class Musica {

	@Id
	@Column(name="cd_musica")
	@GeneratedValue(generator="musica",strategy=GenerationType.SEQUENCE)
	private int codigoxx;
	
	@Column(name="nm_musica", nullable=false, length=100)
	private String nome;
	
	@Column(name="vl_duracao")
	private float duracao;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_genero")
	private Genero tipo;
	
	public Musica(String nome, float duracao, Genero tipo) {
		super();
		this.nome = nome;
		this.duracao = duracao;
		this.tipo = tipo;
	}

	public Musica() {
		super();
	}

	public Musica(int codigo, String nome, float duracao, Genero tipo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.duracao = duracao;
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}

	public Genero getTipo() {
		return tipo;
	}

	public void setTipo(Genero tipo) {
		this.tipo = tipo;
	}
	
}