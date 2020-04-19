// fichero Coche.java

package edu.cc.examples.api.coche;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name="coches")
@Data
public class Coche implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
	private String marca;
	private String nmatricula;
    
}
