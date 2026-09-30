package logicnotes;

public class OperadorComparacion {
    static void main(String[] args){
        // Operadores de comparacion
        int num3 = 500;
        int num4 = 380;
        int num5 = 500;
        String num6= "dos";
        String num7= "dos";

        boolean resultado = num3 <= num4;

        System.out.println("Resultado: " + resultado);

        boolean esIgual = num3 == num5;
        System.out.println("Resultado: " + esIgual);

        boolean esIgualvalor = num6 == num7;
        System.out.println("Resultado: " + esIgualvalor);

        boolean esEqual = num6.equals(num7);
        System.out.println("Resultado: " + esEqual);
    }
}

