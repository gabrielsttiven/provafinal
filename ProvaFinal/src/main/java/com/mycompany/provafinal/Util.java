
package com.mycompany.provafinal;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {
   public static void formatarData (LocalDate data){
    DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    formatar.format(data);
   }
   
   public static void fomatarMonetacao (double valor){
       NumberFormat formatar = NumberFormat.getCurrencyInstance();
       formatar.format(valor);
   }}
