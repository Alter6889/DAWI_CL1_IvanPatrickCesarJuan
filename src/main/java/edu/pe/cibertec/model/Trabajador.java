package edu.pe.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table (name = "trabajadores")
public class Trabajador {
    @Id
    @Getter
    @Setter
    private String trabajadorid;
    @Getter
    @Setter
    private String nomtrabajador;
    @Getter
    @Setter
    private int  tiempotrabajador;
    @Getter
    @Setter
    private int salariotrabajador;

}
