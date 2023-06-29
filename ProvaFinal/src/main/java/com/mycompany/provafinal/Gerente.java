/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provafinal;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, salario, genero, estadoCivil, dataNascimento);
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public double getSalarioFinal() {
    salario = salario + salario*0.15;
    return salario;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                super.toString();
    }
    
}
