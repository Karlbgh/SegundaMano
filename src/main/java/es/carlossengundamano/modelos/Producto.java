package es.carlossengundamano.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private Float precio;
    private String imagen;

    @ManyToOne
    private Usuario propietario;

    @ManyToOne
    private Compra compra;

    public Producto(String nombre, Float precio, String imagen, Usuario propietario) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
        this.propietario = propietario;
    }
}
