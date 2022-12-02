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
public class Compra {

    @Id
    @GeneratedValue
    private Long id;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate fechaCompra;

    @ManyToOne
    private Usuario propietario;

}
