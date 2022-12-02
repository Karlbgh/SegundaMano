package es.carlossengundamano.repositorios;

import es.carlossengundamano.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    Usuario findFirstByEmail(String email);
}
