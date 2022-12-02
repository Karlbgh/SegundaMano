package es.carlossengundamano.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre ;
    private String apellido;
    private String avatar;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate fechaAlta;

    private String email;
    private String password;

    public Usuario(String nombre, String apellido, String avatar, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.avatar = avatar;
        this.email = email;
        this.password = password;
    }
}
