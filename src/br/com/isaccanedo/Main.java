package br.com.isaccanedo;

import java.util.Scanner;

/**
 * @author Isac Canedo
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Programa para converter Decimal em Binário");
        System.out.println("====================================================\n");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Decimal Number:");
        int number = s.nextInt();
        int n = number;
        StringBuilder output = new StringBuilder();
        if (n == 0) {
            output.append("0");
        } else {
            while (n > 0) {
                output.append(String.valueOf(n % 2));
                n = n / 2;
            }
        }

        System.out.println("\n+***********************************************************************************");
        System.out.print("| Equivalente binário para o número decimal fornecido - " + number + " : " + output.reverse());
        System.out.println("\n+***********************************************************************************\n");

        System.out.println("Converte o decimal dado em binário com a ajuda da função embutida");
        System.out.println("+***********************************************************************************");
        System.out.println("| Equivalente binário para o número decimal fornecido - " + number + " : " + Integer.toBinaryString(number));
        System.out.println("+***********************************************************************************");
        //System.out.println(Integer.to);
    }


}

