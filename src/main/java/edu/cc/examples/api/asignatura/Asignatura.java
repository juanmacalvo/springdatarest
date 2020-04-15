// fichero Asignatura.java

package edu.cc.examples.api.asignatura;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name="asignaturas")
@Data
public class Asignatura implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
	private String nombre;
	private int creditos;
    
}
