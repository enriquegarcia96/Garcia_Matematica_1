package com.GARCIA;

import java.util.Scanner;

public class Matematicas {


    public static double elevarNumero(double numero) {
        double elevar = 1;
        for (int i = 1; i <= 3; i++) {
            elevar = elevar * numero;
        }
        return elevar;
    }

    public static double raizCuadrada(double numero) {
        double raiz = 0;
        raiz = Math.sqrt(numero);
        return raiz;
    }

    public static double primo(double numero) {
        double primo = 0;
        for (double i = 1; i <= numero; i++) {
            if ((numero % i) == 0)
                primo++;
        }
        if(primo == 2){
            System.out.println("el numero es primo");
        }else{
            System.out.println("el numero no es primo");
        }
        return numero;
    }
}