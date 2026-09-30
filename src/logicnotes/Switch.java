package logicnotes;

public class Switch {

    public static void main(String[] args) {

        System.out.println("Selecciones 1. Cuenta de ahorro\n"+
             "2. Credito\n" +
             "3. Inversion\n" +
             "4. Mis datos");

        int option= ValidadorDeTipos.ValidarEnteros();
        System.out.println(option);

        switch (option) {
            case 1:
                System.out.println("Cuenta de Ahorro");
                break;
            case 2:
                System.out.println("Credito");
                break;
            case 3:
                System.out.println("Inversion");
                break;
            case 4:
                System.out.println("Mis datos");
                break;
            default :
                System.out.println("No valido");
        }
    }
}
