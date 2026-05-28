package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.UsuarioRepository;
import model.Usuario;

/**
 * UsuarioController
 */

@Controller
public class UsuarioController {
	// TODO: REDIRECTS MELHORES!!!!!!!!
	// TODO: TODO O HTML PUTA QUE PARIU!!

	@Autowired
	private UsuarioRepository usuarioRepository;

	// CREATE
	@GetMapping("cadastrarUsuario")
	public String cadastroUsuario() {
		return "/cadastrarUsuario";
	}

	@PostMapping("salvarUsuario")
	public String salvarUsuario(@RequestParam String nome, @RequestParam long telefone, @RequestParam String email,
			@RequestParam String senha, @RequestParam String endereco,
			@RequestParam String complemento_endereco, @RequestParam String bairro, @RequestParam String cidade,
			@RequestParam String cep, @RequestParam String estado, @RequestParam String cpf) {

		Usuario usuario = new Usuario(nome, telefone, email, senha, endereco, complemento_endereco, bairro, cidade, cep,
				estado, cpf);

		usuarioRepository.criar(usuario);

		return "redirect:/cadastrarUsuario"; // voltar pra tela inical eu acho?? brisola qq ce acha?
	}
	// FIM DO CREATE

	// UPDATE
	@GetMapping("editarUsuario")
	public String editarUsuario(@RequestParam long id, Model model) {
		Usuario usuario = usuarioRepository.encontrarPorID(id);
		model.addAttribute("usuario", usuario);
		return "editarUsuario";
	}

	@PostMapping("atualizarUsuario")
	public String atualizarUsuario(@RequestParam long id, @RequestParam String nome, @RequestParam long telefone,
			@RequestParam String email, @RequestParam String senha, @RequestParam String endereco,
			@RequestParam String complemento_endereco, @RequestParam String bairro, @RequestParam String cidade,
			@RequestParam String cep, @RequestParam String estado, @RequestParam String cpf) {

		Usuario u = usuarioRepository.encontrarPorID(id);
		u.setNome(nome);
		u.setTelefone(telefone);
		u.setEmail(email);
		u.setSenha(senha);
		u.setEndereco(endereco);
		u.setComplemento_endereco(complemento_endereco);
		u.setBairro(bairro);
		u.setCidade(cidade);
		u.setCep(cep);
		u.setEstado(estado);
		u.setCpf(cpf);

		usuarioRepository.autalizar(u);
		return "redirect:/cadastrarUsuario"; //preciso URGENTEMENTE melhorar os redirects
	}
	// FIM DO UPDATE

	// DELETE
	@GetMapping("excluirUsuario")
	public String excluirUsuario(@RequestParam long id) {
		usuarioRepository.delete(id);
		return "redirect:/cadastrarUsuario"; // pagina inicial de novo????????
	}
	// FIM DO DELETE

}
