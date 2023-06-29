
package com.mycompany.provafinal;
public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
    
    
    private final String nome;
    private final String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
   
    
}
