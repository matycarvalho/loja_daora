package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="cafe")
public class Cafe extends Produto{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    //id
    @Column(name="id")
    private Long id;
    
    public Long getId(){
        return id;
    }

    
    //Resto das variaveis
    @Column(name="peso")
    private double peso;
    @Column(name="ingredientes")
    private String ingredientes;


    public Cafe(Long id, double peso, String ingredientes) {
        this.id = id;
        this.peso = peso;
        this.ingredientes = ingredientes;
    }
    public Cafe(String nome, double preco, int quantidade, String descricao, Long id, double peso,
            String ingredientes) {
        super(nome, preco, quantidade, descricao);
        this.id = id;
        this.peso = peso;
        this.ingredientes = ingredientes;
    }
    //get's e set's
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }


    //construtores
    //teste
}