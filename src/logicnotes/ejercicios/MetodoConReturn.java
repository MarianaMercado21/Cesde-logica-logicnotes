package logicnotes.ejercicios;

public class MetodoConReturn {
    public static void main(String[] args){
        float resultado = sacarPromedio(4f , 4f, 4f);
        System.out.println("resultado = " + resultado);

    }
    public static float sacarPromedio(float num1, float num2, float num3){
        float resultado = (num1 + num2 + num3/ 3);
        return resultado;
    }
}
