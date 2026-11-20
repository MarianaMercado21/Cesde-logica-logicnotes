package logicnotes;
        import java.util.Scanner;
public class ExLoguin {


        public static void main(String[] args) {
            // Credenciales válidas predefinidas
            final String USUARIO_CORRECTO = "mar";
            final String CONTRASENA_CORRECTA = "12345";

            Scanner scanner = new Scanner(System.in);

            System.out.println("=== INICIO DE SESIÓN ===");

            System.out.print("Usuario: ");
            String usuarioIngresado = scanner.nextLine();

            System.out.print("Contraseña: ");
            String contrasenaIngresada = scanner.nextLine();

            // Validación usando .equals() para comparar cadenas de texto
            if (usuarioIngresado.equals(USUARIO_CORRECTO) && contrasenaIngresada.equals(CONTRASENA_CORRECTA)) {
                System.out.println("\n¡Acceso concedido! Bienvenido, " + usuarioIngresado + ".");
            } else {
                System.out.println("\nError: Usuario o contraseña incorrectos.");
            }

            scanner.close();
        }
    }


