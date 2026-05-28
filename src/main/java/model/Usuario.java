package model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

/**
 * Usuario
 */
@Entity
@Table(name = "Usuario")
public class Usuario {
	// seria bom se a senha fosse criptografada...
	// https://docs.spring.io/spring-security/reference/features/authentication/password-storage.html
	// TODO: VALIDAÇÃO
	// TODO: CRIAR CLASSE MODO DE PAGAMENTO

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "telefone")
	private long telefone;

	@Column(name = "email")
	private String email;

	@Column(name = "senha")
	private String senha;

	@Column(name = "endereco")
	private String endereco;

	@Column(name = "complemento_endereco")
	private String complemento_endereco;

	@Column(name = "bairro")
	private String bairro;

	@Column(name = "cidade")
	private String cidade;

	@Column(name = "cep")
	private String cep;

	@Column(name = "estado")
	private String estado;

	@Column(name = "cpf")
	private String cpf;

	public Usuario() {
	}

	public Usuario(String nome, long telefone, String email, String senha, String endereco,
			String complemento_endereco, String bairro, String cidade, String cep, String estado, String cpf) {
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
		this.cpf = cpf;
	}

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
