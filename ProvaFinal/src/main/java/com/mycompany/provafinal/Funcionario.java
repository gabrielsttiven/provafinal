
package com.mycompany.provafinal;

import java.time.LocalDate;
import java.time.Period;

public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Endereco endereco;
    protected Setor setor;
    protected double salario;
    protected Genero genero;
    protected EstadoCivil estadoCivil;
    protected LocalDate dataNascimento;

    public Funcionario(String nome, String cpf, String rg, Endereco endereco, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.setor = setor;
        this.salario = salario;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
    public int getIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "---FUNCIONÁRIO---" +
                super.toString() +
                "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nRG: " + rg +
                "\nEndereço: " + endereco +
                "\nSetor: " + setor +
                "\nSalário: " + salario + // nem aqui :(
                "\nGênero: " + genero +
                "\nEstado Civil: " + estadoCivil +
                "\nData de Nascimento: " + dataNascimento +  //meu Util não funciona, tentei o Util.formatarData e não pega :( 
                "\nIdade: " + getIdade();
    }

    
    
}
