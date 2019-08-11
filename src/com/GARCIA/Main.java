package com.GARCIA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("\t*************************");
        System.out.println("\tOperaciones  matematicas");
        System.out.println("\t*************************");

        double Entrada = LectorDeError.solicitarNumero("Ingrese un numero:  ");

        System.out.println("el numero elevado al Cubo es: "+Matematicas.elevarNumero(Entrada));
        System.out.println("La Raiz cuadra de "+Entrada+" es: "+Matematicas.raizCuadrada(Entrada));
        System.out.print(+Matematicas.primo(Entrada));


    }

}
