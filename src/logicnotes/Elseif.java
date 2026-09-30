package logicnotes;

import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su peso");
        float peso = sc.nextFloat();

        System.out.println("Ingrese su altura");
        float altura = sc.nextFloat();

        float imc = peso/(altura*altura);
        System.out.println("Su imc es: " + imc);

        if (imc <= 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
    }
    }

