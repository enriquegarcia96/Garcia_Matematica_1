package com.GARCIA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LectorDeError {


    public static double solicitarNumero(String mensaje){
        Scanner lector = new Scanner(System.in);
        System.out.print(mensaje);
        try {
            double numero = lector.nextDouble();
            return numero;
        }catch (InputMismatchException e){
            System.out.println("El dato es invalido");
            return solicitarNumero(mensaje);

        }
    }


}
