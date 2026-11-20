package logicnotes.ejercicios;

import java.util.Scanner;

public class DatosAMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] usuarios = new String[4][6];

        String [] encabezados = {"id", "name", "lastName", "email", "phone", "password"};

        for (int i = 0; i < usuarios.length; i++) {
            for (int j = 0; j < usuarios[i].length; j++) {
                System.out.println(encabezados[j]);
                usuarios[i][j] = sc.nextLine();
                j++;
            }
        }
    }
}
