package orozco.anuar.management.panel.models;

import jakarta.persistence.*;
import lombok.*;

// We use Lombok to simplify the code and generate getters, setters, the method ToString and the constructors (with args and with no args)
// We can actually replace all of this with @Data
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

}
