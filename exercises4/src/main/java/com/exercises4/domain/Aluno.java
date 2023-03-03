package com.exercises4.domain;

import java.util.ArrayList;

public class Aluno {
    
    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();
    private Double media;
    
    public Aluno(String nome, ArrayList<Double> notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void addNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    
    public void setMedia(Double media){
        this.media = media;
    }

    public Double getMedia() {
        return media;
    }

}
