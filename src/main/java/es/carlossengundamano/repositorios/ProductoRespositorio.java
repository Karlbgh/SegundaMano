package es.carlossengundamano.repositorios;

import es.carlossengundamano.modelos.Compra;
import es.carlossengundamano.modelos.Producto;
import es.carlossengundamano.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRespositorio extends JpaRepository<Producto, Long> {

    List<Producto> findByPropietario(Usuario propietario);
    List<Producto> findByCompra(Compra compra);
    List<Producto> findByCompraIsNull();
    List<Producto> findByNombreContainingIgnoreCaseAAndCompraIsNull(String nombre);
    List<Producto> findByNombreContainingIgnoreCaseAndPropietario(String nombre, Usuario propietario);

}
