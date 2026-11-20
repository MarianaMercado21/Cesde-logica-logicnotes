package logicnotes.ejercicios;

import java.util.Scanner;

public class ComprasSystem {
    // Como podemos registrar un usuario, que pueda iniciar sesion y si lo hace
    static Scanner sc = new Scanner(System.in);
    static String[] productos = new String[5];
    static double[] precios = new double[5];

    public static void main(String[] args) {
        menuCompras();
    }
    public static void agregarProductos() {
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Agregue el producto " + (i + 1));
            productos[i] = sc.next();
        }

    }
    public static void agregarPrecios() {
        for (int i = 0; i < precios.length; i++){
            System.out.println("Agregue el precio " + (i + 1));
            precios[i] = sc.nextDouble();
        }
    }

    public static void mostrarProductos() {
        for (int i = 0; i < productos.length; i++) {
            System.out.println(" Producto " + (i + 1) + ": " + productos[i]);
        }
    }

    public static void mostrarPrecios() {
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: $" + precios[i]);
        }
    }
    public static void calcularTotal(){
        double total = 0;
        for (int i = 0; i < productos.length; i++) {
            total = total + precios[i];
        }
        System.out.println("El total es: $" + total);
    }
    public static void actualizarProductos(){
        for (int i = 0; i < productos.length;) {

        }
    }
    public static void actualizarPrecios(){

    }
    public static void mostrarTablaProductoPrecio(){

    }

    public static void menuCompras() {
        System.out.println("Inicia la aplicacion presionando 1");
        int init = sc.nextInt();
        sc.nextLine();

        while (init != 0) {

            System.out.println("""  
                             
                    1. Agregar producto            
                    2. Agregar precios            
                    3. Mostrar productos            
                    4. Mostrar precios            
                    5. Calcular total            
                    6. Salir   
                    """);

            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Agregar producto");
                    agregarProductos();
                    break;

                case 2:
                    System.out.println("Agregar precios");
                    agregarPrecios();
                    break;

                case 3:
                    System.out.println("Mostrar productos");
                    mostrarProductos();
                    break;

                case 4:
                    System.out.println("Mostrar precios");
                    mostrarPrecios();
                    break;

                case 5:
                    System.out.println("Calcular total");
                    calcularTotal();
                    break;

                case 6:
                    System.out.println("Salir");
                    init = 0;
                    break;

                default:
                    System.out.println("Seleccione una opcion valida");
            }
        }
    }



}