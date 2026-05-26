package dao;

import model.Usuario;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

/**
 * UsuarioRepository
 *
 */
/*TODO: Trocar essa coisinha toda por isso:
 *
 * public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
 *  }
 *  nos controllers: usuario.findbyid().orelse
*/
@Repository
public class UsuarioRepository {
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void criar(Usuario usuario) {
		// Essa string ta cheia de + pra nn ficar uma linha grande. Prefiro
		// quando o arquivo é formatado para no máximo 80 caracteres
		String sql = "INSERT INTO usuarios (nome, telefone, email, senha," +
				"endereco, complemento_endereco, bairro, cidade, cep, estado," +
				"cpf) VALUES (:nome, :telefone, :email, :senha, :endereco, " +
				":complemento_endereco, :bairro, :cidade, :cep, :estado, :cpf)";

		Query query = em.createNativeQuery(sql);
		query.setParameter("nome", usuario.getNome());
		query.setParameter("telefone", usuario.getTelefone());
		query.setParameter("email", usuario.getEmail());
		query.setParameter("senha", usuario.getSenha());
		query.setParameter("endereco", usuario.getEndereco());
		query.setParameter("complemento_endereco", usuario.getComplemento_endereco());
		query.setParameter("bairro", usuario.getBairro());
		query.setParameter("cidade", usuario.getCidade());
		query.setParameter("cep", usuario.getCep());
		query.setParameter("estado", usuario.getEstado());
		query.setParameter("cpf", usuario.getCpf());
		query.executeUpdate();
	}

	@Transactional
	public List<Usuario> encontrarTodos() {
		String sql = "SELECT * FROM usuarios";
		Query query = em.createNativeQuery(sql, Usuario.class);
		@SuppressWarnings("unchecked")
		List<Usuario> listaUsuario = query.getResultList();
		return listaUsuario;
	}

	@Transactional
	public Usuario encontrarPorID(long id) {
		String sql = "SELECT * FROM usuarios WHERE id = :id";
		Query query = em.createNativeQuery(sql, Usuario.class);
		query.setParameter("id", id);
		Usuario usuario = (Usuario) query.getSingleResult();
		return usuario;
	}

	@Transactional
	public void autalizar(Usuario usuario) {
		String sql = "UPDATE usuarios SET nome = :nome, telefone = :telefone," +
				"email = :email, senha = :senha, endereco = :endereco, " +
				"complemento_endereco = :complemento_endereco, bairro = :bairro," +
				"cidade = :cidade, cep = :cep, estado = :estado, cpf = :cpf";
		Query query = em.createNativeQuery(sql);
		query.setParameter("nome", usuario.getNome());
		query.setParameter("telefone", usuario.getTelefone());
		query.setParameter("email", usuario.getEmail());
		query.setParameter("senha", usuario.getSenha());
		query.setParameter("endereco", usuario.getEndereco());
		query.setParameter("complemento_endereco", usuario.getComplemento_endereco());
		query.setParameter("bairro", usuario.getBairro());
		query.setParameter("cidade", usuario.getCidade());
		query.setParameter("cep", usuario.getCep());
		query.setParameter("estado", usuario.getEstado());
		query.setParameter("cpf", usuario.getCpf());
		query.executeUpdate();
	}

	@Transactional
	public void delete(long id) {
		String sql = "DELETE FROM usuarios WHERE id = :id";
		Query query = em.createNativeQuery(sql);
		query.setParameter("id", id);
		query.executeUpdate();
	}
}
