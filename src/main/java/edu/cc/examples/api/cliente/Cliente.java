package edu.cc.examples.api.cliente;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name="clientes")
@Data
public class Cliente implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
	private String nombre;
	private int edad;
    
}
