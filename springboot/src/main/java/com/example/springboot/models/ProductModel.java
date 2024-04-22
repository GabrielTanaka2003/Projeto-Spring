package com.example.springboot.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity //Anotação marcando que ela é uma entidade
@Table(name = "TB_PRODUCTS") //Anotação criando a tabela e definindo um nome a ela
public class ProductModel implements Serializable {
//implements de interface sem metodo, para serialização
    private static final long serialVersionUID = 1L;

    @Id //Anotação definindo o Id da tabela
    @GeneratedValue(strategy= GenerationType.AUTO) //Anotação para geração de valores para ID
    private UUID idProduct; //UUID = identificadores distribuidos
    private String name; //Variavel para guardar valores de nome
    private BigDecimal value; //Variavel para guardar valores

    //Geração de get's e set's para manipulação de valores
    public UUID getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
