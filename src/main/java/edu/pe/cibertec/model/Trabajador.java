package edu.pe.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table (name = "trabajadores")
public class Trabajador {
    @Id
    private String trabajadorid;
    private String nomtrabajador;
    private int  tiempotrabajador;
    private int salariotrabajador;
}
