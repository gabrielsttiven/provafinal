/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provafinal;

import java.time.LocalDate;

public class Motoboy extends Funcionario {
    private String carteiraHabilitacao;

    public Motoboy(String carteiraHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, salario, genero, estadoCivil, dataNascimento);
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    public String getCarteiraHabilitacao() {
        return carteiraHabilitacao;
    }

    public void setCarteiraHabilitacao(String carteiraHabilitacao) {
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return salario;
    }

    @Override
    public String toString() {
        return "---MOTOBOY---" +
                super.toString() +
                "\nCarteira de Habilitacao=" + carteiraHabilitacao + '}';
    }
    
    
}
