/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provafinal;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca implements Contratacao {
    private final double PREMIO = 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, salario, genero, estadoCivil, dataNascimento);
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
    salario += salario*(0.25);
    salario = salario*PREMIO;
    return salario;
        
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Você está admitido!!");
    }

    @Override
    public void demitir(Funcionario funcionario) {
       System.out.println("Você está demitido!!");
    }

    @Override
    public String toString() {
        return "---DIRETOR---" +
                super.toString() +
                "\nPrêmio: " + PREMIO*salario;
    }
    
    
}
