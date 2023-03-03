package com.exercises4.controller;


import com.exercises4.service.AlunoService;

/**
4 – Crie uma lista de Alunos, onde para cada Aluno você deverá armazenar as notas N1, N2 e N3, 
depois você deve calcular a média da nota de cada aluno e imprimir o nome, as notas e a média.
*/
public class AlunoController {
    public static void main( String[] args ){
        
        AlunoService alunos = new AlunoService();

        alunos.novoAluno("Joao", "5.5,6.6,7.6");
        alunos.novoAluno("Pedro", "9.6,7.5,6.5");
        alunos.novoAluno("Marcos", "7.3,3.4,5.0");

        alunos.calculaMedia();

        alunos.imprimirBoletim();
          
    }
}
