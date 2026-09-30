package logicnotes;

public class IfCompuesto {
    public static void main(String[] args){
        String name = "Mar";
        String username = "Mar";

        int contrasena = 123;
        int password = 12;

        if (username.equals(name)&&contrasena==(password))
        {
            System.out.println("Bienvenido@ " + name);
        }else { System.out.println("Vuelva a intentar");
        }
    }
}
