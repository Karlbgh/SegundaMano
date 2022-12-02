package es.carlossengundamano.repositorios;

import es.carlossengundamano.modelos.Compra;
import es.carlossengundamano.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompraRepositorio extends JpaRepository<Compra, Long> {

    List<Compra> findPropietario(Usuario propietario);
}
