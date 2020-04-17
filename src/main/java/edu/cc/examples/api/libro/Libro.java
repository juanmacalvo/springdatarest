// fichero Libro.java

package edu.cc.examples.api.libro;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name="libros")
@Data
public class Libro implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
	private String nombre;
	private int cantidad;
    
}
