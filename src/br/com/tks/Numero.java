package br.com.tks;

import java.io.PrintStream;
import java.util.Arrays;

public class Numero {
    public int[] numeros;
    public int comprimento;

    public Numero(int[] numeros, int comprimento) {
        this.numeros = numeros;
        this.comprimento = comprimento;
    }

    public void ordenarNumeros(PrintStream ps) {
        // ordena os números em ordem crescente
        Arrays.sort(this.numeros);
        for (int j = 0; j < this.numeros.length; j++) {
            if (j >= this.numeros.length - 1) {
                ps.printf("%d", this.numeros[this.comprimento - j - 1]);
            } else {
                ps.printf("%d-", this.numeros[comprimento - j - 1]);
            }
        }
    }
}

