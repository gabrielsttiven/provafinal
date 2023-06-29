/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provafinal;

import java.time.LocalDate;
import java.time.Month;

public class Main2 {
    
    public static void main(String[] args){ 
    Engenheiro engenheiro = new Engenheiro("14522", "Cleide", "89545645", "256662", new Endereco("Rua", "35G", "Casa", "14444", "Salvador", UnidadeFederativa.BAHIA), Setor.ENGENHARIA, 1.520, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(1985, Month.JANUARY, 14));
    Motoboy motoboy = new Motoboy("567889", "Jonathas", "1454244", "7788984", new Endereco("Praça", "25L", "Apartamento", "1456332", "Barbalho", UnidadeFederativa.SAO_PAULO), Setor.OPERACOES, 3.250, Genero.MASCULINO, EstadoCivil.SOLTEIRO, LocalDate.of(1974, Month.OCTOBER, 21));
    Gerente gerente = new Gerente(Bonificacao.GERENTE, "Selena", "4141622", "352648", new Endereco("Rua", "458", "Casa", "2515666", "Copacabana", UnidadeFederativa.RIO_DE_JANEIRO), Setor.RECURSOS_HUMANOS, 2.650, Genero.FEMININO, EstadoCivil.DIVORCIADO, LocalDate.of(1999, Month.JUNE, 30));
    Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Tomas", "255541", "364478", new Endereco("Avenida", "69", "Condominio", "3654898", "São Paulo", UnidadeFederativa.SAO_PAULO), Setor.RECURSOS_HUMANOS, 4.410, Genero.MASCULINO, EstadoCivil.CASADO, LocalDate.of(1968, Month.SEPTEMBER, 02)); 
    
        diretor.admitir(engenheiro);
        System.out.println(engenheiro.toString());
        System.out.println("");
        System.out.println(motoboy.toString());
        System.out.println("");
        diretor.demitir(motoboy);
        System.out.println("");
        System.out.println(gerente.toString());
        System.out.println("");
        System.out.println(diretor.toString());
        System.out.println("");
        
        
        
       

    }
    
}    



    
