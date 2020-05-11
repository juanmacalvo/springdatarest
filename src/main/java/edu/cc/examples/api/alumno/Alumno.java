package edu.cc.examples.api.alumno;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;


@Entity
@Table(name="alumnos")
@Data
public class Alumno implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
	private String nombre;
	private String apellido;
	private String email;
	
}
