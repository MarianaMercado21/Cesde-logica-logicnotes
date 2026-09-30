package logicnotes.ejercicios;

import java.util.Scanner;

public class RecorrerUnArrayUsandoNombres {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] names = new String[7];

        int i = 0;

        while (i < 7){
            System.out.println("Ingrese la nombre " + (i+1));
            names[i]= sc.next();
            i++;
        }
        int j = 0;

        while (j < 7) {
            System.out.println("nombres " + (j + 1) + ": " + names[j]);
            j++;
        }
    }
}
