package com.example.projetojunin.ui.pacote;

import java.io.Serializable;
import java.math.BigDecimal;

public class Pacote implements Serializable {

    private final int imagem;
    private final String name;
    private final BigDecimal price;
    private final String descriptionOne;
    private final String descripitonTwo;
    private final String descriptionThree;


    public Pacote(int imagem, String name, BigDecimal price, String descriptionOne, String descripitonTwo, String descriptionThree) {
        this.imagem = imagem;
        this.name = name;
        this.price = price;
        this.descriptionOne = descriptionOne;
        this.descripitonTwo = descripitonTwo;
        this.descriptionThree = descriptionThree;
    }

    public int getImagem(){ return imagem;}
    public String getName(){return name;}
    public BigDecimal getPrice(){return  price;}
    public String getDescriptionOne(){return descriptionOne;}
    public String getDescripitonTwo(){return descripitonTwo;}
    public String getDescriptionThree(){return descriptionThree;}
}
