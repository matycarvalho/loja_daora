package com.ifsp.loja;

/**
 * Usuario
 */
public class Usuario {
	// seria bom se a senha fosse criptografada...
	// TODO: VALIDAÇÃO 
	private String nome;
	private long telefone;
	private String email;
	private String senha;
	private String endereco;
	private String complemento_endereco;
	private String bairro;
	private String cidade;
	private String cep;
	private String estado;
	private long numero_cartao;
	private String cpf;

	public Usuario() {
	};

	public Usuario(String nome, long telefone, String email, String senha, String endereco, String complemento,
			String complemento_endereco, String bairro, String cidade, String cep, String estado, long numero_cartao,
			String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
		this.complemento_endereco = complemento_endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.estado = estado;
		this.numero_cartao = numero_cartao;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getComplemento_endereco() {
		return complemento_endereco;
	}

	public void setComplemento_endereco(String complemento_endereco) {
		this.complemento_endereco = complemento_endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public long getNumero_cartao() {
		return numero_cartao;
	}

	public void setNumero_cartao(long numero_cartao) {
		this.numero_cartao = numero_cartao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
