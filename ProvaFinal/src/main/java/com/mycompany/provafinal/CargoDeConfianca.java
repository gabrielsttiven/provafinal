/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provafinal;

import java.time.LocalDate;

public abstract class CargoDeConfianca extends Funcionario{
    protected Bonificacao bonificacao;

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, salario, genero, estadoCivil, dataNascimento);
        this.bonificacao = bonificacao;
    }
}
