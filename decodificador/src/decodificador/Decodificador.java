/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decodificador;

import Interfaz.Interfaz;


/**
 *
 * @author potz
 */
public class Decodificador {
    public static String resultadoFinal="";
    static StringBuffer resultado = new StringBuffer();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interfaz interfaz= new Interfaz();
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);
    }
    
    public static void DescifrarPalabras(){
        int contador = 0;
        int contador2 = 0;
        String PrimerCadena;
        PrimerCadena = Interfaz.palabra1;
        String SegundaCadena;
        SegundaCadena = Interfaz.palabra2;
        char[] Cadena1 = PrimerCadena.toCharArray();
        char[] Cadena2 = SegundaCadena.toCharArray();
        while (contador2 < Cadena1.length) {
            contador = 0;
            resultado.delete(0, resultado.length());
            for (int i = contador2; i < Cadena1.length; i++) {
                for (int j = contador; j < Cadena2.length; j++) {
                    if (Cadena1[i] == Cadena2[j]) {
                        contador = j + 1;
                        resultado = resultado.append(Cadena1[i]);
                        break;
                    } else {
                        if (resultado.length() > resultadoFinal.length()) {
                            resultadoFinal = resultado.toString();
                        }
                        resultado.delete(0, resultado.length());
                        contador = 0;
                    }
                }
            }
            contador2++;
            if (resultado.length() > resultadoFinal.length()) {
                resultadoFinal = resultado.toString();
            }
        }
    }
}
