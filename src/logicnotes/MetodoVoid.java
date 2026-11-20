package logicnotes;

public class MetodoVoid {
    public static void main(String[] args) {
        saludarPorElNombre("Juan"); // Esto llama a la funcion
        sumarDosNumeros(100 , 400);


    }
    public static void saludarPorElNombre(String nombre) {
        System.out.println("Hola "+ nombre);
    }
    public static void sumarDosNumeros(int num1, int suma2) {
        int resultado = num1 + suma2;
        System.out.println("resultado = " + resultado);
    }
}
