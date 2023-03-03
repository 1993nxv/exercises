package com.exercises4.service;
/**
4 – Crie uma lista de Alunos, onde para cada Aluno você deverá armazenar as notas N1, N2 e N3, 
depois você deve calcular a média da nota de cada aluno e imprimir o nome, as notas e a média.
*/

import java.util.ArrayList;

import com.exercises4.domain.Aluno;

public class AlunoService {
    
    ArrayList<Aluno> alunos = new ArrayList<>();
  
    public void novoAluno(String nome, String notasString){
        alunos.add(new Aluno(nome, trataNotas(notasString)));
    }
    
    public ArrayList<Double> trataNotas(String notasString){
        ArrayList<Double> notas = new ArrayList<>();
        for(String n : notasString.split(",")){
            notas.add(Double.parseDouble(n));
        }
        return notas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void calculaMedia(){
        for(Aluno aluno : alunos){
            Double media = 0D;
            for(Double n : aluno.getNotas()){
                media += n;
            }
            aluno.setMedia(media / aluno.getNotas().size());
        }
    }

    public void imprimirBoletim(){
       for(Aluno aluno : alunos){
            System.out.println("Aluno:" + aluno.getNome());
            System.out.println("Notas: " + aluno.getNotas().toString().replace("[", "").replace("]", ""));
            System.out.printf("Media: %.2f\n", aluno.getMedia());
       }
    }

}
