// fichero Pais.java

package edu.cc.examples.api.pais;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name="paises")
@Data
public class Pais implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
	private String nombre;
	private int habitantes;
    
}
