/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decodificador;

import java.util.Scanner;

/**
 *
 * @author potz
 */
public class Decodificador {

    static StringBuffer resultado = new StringBuffer();
    static Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        int contador2 = 0;
        String resultadoFinal = "";
        System.out.println("Bienvenido, ingrese la primer cadena de caracteres:");
        String PrimerCadena;
        PrimerCadena = teclado.nextLine();
        System.out.println("Ingrese la segunda cadena de caracteres:");
        String SegundaCadena;
        SegundaCadena = teclado.nextLine();
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
        System.out.println(resultadoFinal);
    }
}
