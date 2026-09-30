package logicnotes.ejercicios;

import logicnotes.ValidadorDeTipos;

public class MenuCajero {
    public static void main(String[] args){

        boolean seguir = true;
        while (seguir) {

            System.out.println("Seleccione  1. Consultar Saldo\n" +
                    "2. Retirar Dinero\n" +
                    "3. Depositar Dinero\n" +
                    "4. Transferir a otra cuenta\n" +
                    "5. Imprimir/mostrar Comprobante\n" +
                    "6. Salir\n");

            int option = ValidadorDeTipos.ValidarEnteros();
            System.out.println(option);

            switch (option) {
                case 1:
                    System.out.println("Consultar Saldo");
                    break;
                case 2:
                    System.out.println("Retirar Dinero");
                    break;
                case 3:
                    System.out.println("Depositar Dinero");
                    break;
                case 4:
                    System.out.println("Transferir a otra cuenta");
                    break;
                case 5:
                    System.out.println("Imprimir/mostrar Comprobante");
                    break;
                case 6:
                    System.out.println("Salir");
                    seguir = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
