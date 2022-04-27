package br.com.tks;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void verificaMaior(int[] numeros, int comprimento,PrintStream ps, Scanner sc) {
        ps.println("Digite " + comprimento + " números.");
        numeros = new int[comprimento];
        for (int i = 0; i < comprimento; i++) {
            ps.println((i + 1) +"º Número" +":");
            numeros[i] = sc.nextInt();
        }
        Numero num = new Numero(numeros, comprimento);
        num.ordenarNumeros(ps);
    }

    public static void main(String[] args) {
        //declarando scanner e printStream
        Scanner sc = new Scanner(System.in);
        PrintStream ps;
        ps = System.out;

        //declarando variaveis
        int comprimento; // comprimento do array
        ps.print("Quantos números vc quer ordenar? ");
        comprimento = sc.nextInt();
        int[] numeros = new int[comprimento];
        verificaMaior(numeros,comprimento,ps,sc);

        //fechar scanner
        sc.close();
    }
}
