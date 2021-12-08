package br.com.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	private String descricao;
	
	
	private boolean medicamentos;
	
	
	private boolean higiene;
	
	
	private boolean cosmeticos;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(boolean medicamentos) {
		this.medicamentos = medicamentos;
	}

	public boolean isHigiene() {
		return higiene;
	}

	public void setHigiene(boolean higiene) {
		this.higiene = higiene;
	}

	public boolean isCosmeticos() {
		return cosmeticos;
	}

	public void setCosmeticos(boolean cosmeticos) {
		this.cosmeticos = cosmeticos;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
}
