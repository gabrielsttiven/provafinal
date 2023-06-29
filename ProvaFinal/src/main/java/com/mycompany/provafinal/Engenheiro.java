/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provafinal;

import java.time.LocalDate;

public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro(String crea, String nome, String cpf, String rg, Endereco endereco, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, salario, genero, estadoCivil, dataNascimento);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public double getSalarioFinal() {
        return salario;
    }

    @Override
    public String toString() {
        return "---ENGENHEIRO" +
                super.toString() +
                "\nCREA: " + crea;
    }
    
 
}
