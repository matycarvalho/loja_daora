package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="filtro")
public class Filtro extends Produto{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    //id
    @Column(name="id")
    private Long id;

    public Long getId(){
        return id;
    }

    //Resto das variáveis
    @Column(name="material")
    private String material;

    @Column(name="tamanho")
    private double tamanho;

    @Column(name="")
    private 

}
