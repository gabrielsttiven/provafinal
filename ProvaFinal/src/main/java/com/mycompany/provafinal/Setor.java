
package com.mycompany.provafinal;
public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Jurídico"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");
    
    private final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }
    
    
}
