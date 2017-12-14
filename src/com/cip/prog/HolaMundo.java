package com.cip.prog;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Hola Mundo! :) \nEsto está debajo");
        
		/* Inicialización de variables */
        int n = 1, veces = 5;
        int a = 30, b = 30;

        /* while loops execution */
        while (n <= veces) {
            System.out.println("Vez número: " + n);
            n++;
        }

        //Cual es mayor
        if (b > a) {
            System.out.println("b is mayor");
        }
        else if(a > b){
            System.out.println("a is mayor");
        }       
        else {
            System.out.println("Ambas son iguales");
        }

	}

}
