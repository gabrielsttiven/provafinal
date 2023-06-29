
package com.mycompany.provafinal;
public enum Genero {
    MASCULINO('M', "Masculino"),
    FEMININO('F', "Feminino");
    
    private final char caractere;
    private final String texto;

    private Genero(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }
    
    
    
}
