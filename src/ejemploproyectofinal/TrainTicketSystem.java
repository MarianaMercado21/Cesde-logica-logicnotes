package ejemploproyectofinal;

import java.util.Scanner;

public class TrainTicketSystem {
    // Crear las variables para las entidades
    /* Ferrocarriles de Antioquia requiere un sistema que permita asignar
     * un ticket en un tren a un usuario a través de una venta.
     * Del Usuario requiere: id, nombre , apellido, origen , destino.
     * Del cajero requiere conocer los mismos datos (id, nombre, apellido) y adicional
     * el rol y la contraseña.
     * Del tren requiere conocer: # de máquina , módelo, capacidad.
     * Del Ticket requiere conocer: Id del ticket , usuario, tren , asiento , origen , destino, precio.
     * De la venta requiere conocer: id de la venta , id del ticket, precio, cantidad , total
     * El sistema debe permitir registrar, actualizar , consultar por id , consultar todos y eliminar, para cada
     * entidad del sistema (Usuarios, trenes, tickets , ventas)
     * El sistema debe permitir navegar las opciones a través de menús
     * El sistema debe permitir registrar un cajero e iniciar sesión
     * El sistema debe permitir al cajero contar con un dashboard con los menus a las diferentes opciones.
     * después de iniciar sesión.
     * La compañia cuenta con tres trenes cada uno con capacidad de 4 pasajeros.
     * Cada tren hace un viaje de ida y vuelta, en un día , a tres destinos: Santa Fe , Cisneros y Puerto Berrio  */

    //Scanner para capturar los datos

    static Scanner sc = new Scanner(System.in);


    //Usuario tren
    static int id;
    static String nombre;
    static String apellido;
    static String origen;
    static String destino;

    //Usuario cajero
    static String rol;
    static String password;

    //Tren
    static int trenId;
    static String modelo;
    static int capacidad;

    //Ticket
    static int ticketId;
    static int usuario;
    static String origenRuta;
    static String destinoRuta;
    static String silla;
    static int tren;
    static String fecha;
    static String hora;
    static double precio;

    //Venta
    static int ventaId;
    static int ticketIdVenta;
    static int cantidad;
    static double precioVentaUnitario;
    static double totalVenta;




    public static void main(String[] args) {

        iniciarApp();
    }
    /* Array y Matrices */

    static String[][] usuarios = new String[2][5];
    static String[][] trenes = new String[3][3];
    static String[][] cajero = new String[2][5];
    static String[][] ticket = new String[2][9];
    static String[][] venta = new String[2][5];

    //Métodos del Usuario

    static String [] encabezados = {"Id"  ,  "Nombre"  ,  "Apellido"  ,  "Origen"  ,  "Destino"};

    public static void  crearUsuario(){

        for (int j = 0; j < encabezados.length; j++){
            System.out.println(encabezados[j]);
        }

        for (int i = 0; i<usuarios.length; i++){  // recorre las FILAS
            for (int j = 0; j < usuarios[i].length; j++){ // recorre las COLUMNAS
                System.out.println("Ingrese " + encabezados[j] + " del usuario " + (i + 1) + ": ");
                usuarios[i][j] = sc.nextLine();
            }
        }
    }

    public static void consultarUsuario() {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null) {
                for (int j = 0; j < usuarios[i].length; j++) {
                    System.out.println(encabezados[j] + ": " + usuarios[i][j]);
                }
                System.out.println("----------------------");
            }
        }
    }



    public static void consultarUsuarioPorId(){
        System.out.println("Indique el id del usuario a consultar");
        id = sc.nextInt();

        int i = id -1;

        if( i >= 0 && i < usuarios.length && usuarios[i][0] != null){
            System.out.println("Datos usuario" + id + ": ");
            for(int j = 0 ; j < usuarios[i].length; j++){
                System.out.println(encabezados[j] + ": " +usuarios[i][j]);
            }
        }
    }

    public static void actualizarDatos(){

        System.out.println("Ingrese el id del usuario a actualizar");

        id = sc.nextInt();

        int i = id -1;

        System.out.println("Seleccione el dato a actualizar 1. Nombre 2. Apellido 3. Origen 4. Destino");

        int opcion= sc.nextInt();
        sc.nextLine();

        switch (opcion){
            case 1:
                System.out.println("Actualizar nombre");
                usuarios[i][1] = sc.nextLine();
                break;
            case 2:
                System.out.println("Actualizar apellido");
                usuarios[i][2] = sc.nextLine();
                break;
            case 3:
                System.out.println("Actualizar origen");
                usuarios[i][3] = sc.nextLine();
                break;
            case 4:
                System.out.println("Actualizar destino");
                usuarios[i][4] = sc.nextLine();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

        public static void eliminarUsuarioPorId () {
            System.out.println("Ingrese el id del usuario a eliminar");

            id = sc.nextInt();

            int i = id - 1;

            for (int j = 0; j < usuarios[i].length; j++) {
                usuarios[i][j] = null;
            }
            System.out.println("Usuario " + id + " eliminado");
        }

        // menu de Usuario

        public static void menuUsuario() {

            int opcion = -1;

            while (opcion != 0) {

            System.out.println("1. Crear usuario");
            System.out.println("2. Consultar todos");
            System.out.println("3. Consultar por id");
            System.out.println("4. Actualizar");
            System.out.println("5. Eliminar");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...");
                    System.out.println("Dele enter para continuar");
                    sc.nextLine();
                    break;

                case 1:
                    crearUsuario();
                    break;

                case 2:
                    consultarUsuario();
                    break;

                case 3:
                    consultarUsuarioPorId();
                    break;

                case 4:
                    actualizarDatos();
                    break;

                case 5:
                    eliminarUsuarioPorId();
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
    }


    // Métodos del Tren

    static String[] encabezadosTren = {"Id tren", "Modelo", "Capacidad"};

    public static void crearTren(){
        for (int j = 0; j < encabezadosTren.length; j++) {
            System.out.println(encabezadosTren[j]);
        }

        for (int i = 0 ; i< trenes.length; i++) {
            for (int j = 0; j < trenes[i].length; j++) {
                System.out.println("Ingrese " + encabezadosTren[j] + " del tren " + (i + 1) + ": ");
                trenes[i][j] = sc.nextLine();
            }
        }
    }

    public static void consultarTren(){
       for (int i = 0; i < trenes.length; i++) {
           if (trenes[i][0] != null) {
               for (int j = 0; j < trenes[i].length; j++) {
                   System.out.println(encabezadosTren[j] + ": " + trenes[i][j]);
               }
               System.out.println("----------------------");
           }
       }
    }

    public static void consultarTrenPorId(){
        System.out.println("Ingrese el id del tren a consultar");
        trenId = sc.nextInt();

        int i = trenId - 1;

        if (i >= 0 && i < trenes.length &&  trenes[i][0] != null) {
            System.out.println("Datos tren " + trenId + ": ");
            for (int j = 0; j < trenes[i].length; j++) {
                System.out.println(encabezadosTren[j] + ": " + trenes[i][j]);
            }
        }
    }

    public static void actualizarTren(){
        System.out.println("Ingrese el id del tren a actualizar");

        trenId = sc.nextInt();

        int i = trenId - 1;

        System.out.println("Seleccione el dato del tren a actualizar 1. Modelo 2. Capacidad");

        int opcion= sc.nextInt();
        sc.nextLine();

        switch (opcion){
            case 1:
                System.out.println("Actualizar modelo");
                trenes[i][1] = sc.nextLine();
                break;

            case 2:
                System.out.println("Actualizar capacidad");
                trenes[i][2] = sc.nextLine();
                break;

                default:
                    System.out.println("Opcion no valida");
        }
    }

    public static void eliminarTrenPorId(){
        System.out.println("Ingrese el id del tren a eliminar");

        trenId = sc.nextInt();

        int i = trenId - 1;

        for (int j = 0; j < trenes[i].length; j++) {
            trenes[i][j] = null;
        }
        System.out.println("Datos del tren " + trenId + " eliminado");
    }

    // menu de Tren
    public static void menuTren() {

        int opcion = -1;

        while (opcion != 0) {

            System.out.println("1. Crear tren");
            System.out.println("2. Consultar todos");
            System.out.println("3. Consultar tren por id");
            System.out.println("4. Actualizar");
            System.out.println("5. Eliminar");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...");
                    System.out.println("Dele enter para continuar");
                    sc.nextLine();
                    break;

                case 1:
                    crearTren();
                    break;

                case 2:
                    consultarTren();
                    break;

                case 3:
                    consultarTrenPorId();
                    break;

                case 4:
                    actualizarTren();
                    break;

                case 5:
                    eliminarTrenPorId();
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    //Metodos registro Cajero

    static String [] encabezadoCajero = {"Id", "Nombre", "Apellido", "Rol", "Contraseña"};

    public static void registrarCajero(){
        for (int j = 0; j < encabezadoCajero.length; j++){
            System.out.println(encabezadoCajero[j]);
        }

        for (int i = 0; i<cajero.length; i++){  // recorre las FILAS
            for (int j = 0; j < cajero[i].length; j++){ // recorre las COLUMNAS
                System.out.println("Cajero " + (i + 1) + " - ingrese " + encabezadoCajero[j] + ": ");
                cajero[i][j] = sc.nextLine();
            }
        }
    }

    // login
    static String nombreCajero;

    public static boolean login(){
        System.out.println("Ingrese su id: ");
        String id = sc.nextLine();

        System.out.println("Ingrese su rol: ");
        String rol = sc.nextLine();

        System.out.println("Ingrese su contraseña: ");
        String password = sc.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < cajero.length; i++) {
            if (cajero[i][0] != null && cajero[i][0].equals(id) && cajero[i][3].equals(rol) && cajero[i][4].equals(password)) {
                encontrado = true;
                nombreCajero = cajero[i][1];
            }
        }
        if (encontrado == true) {
            System.out.println("Iniciando sesion...");
            System.out.println("¡Bienvenido(a)! " + nombreCajero);
        } else {
            System.out.println("Datos incorrectos");
        }
        return encontrado;
    }



    // Metodo de Creación del ticket

    static String[] encabezadosTicket = {"Id ticket", "Usuario", "Origen de ruta", "Destino de ruta", "Silla", "Tren", "Fecha", "Hora", "Precio"};

    public static void crearTicket(){
        for (int j = 0; j < encabezadosTicket.length; j++){
            System.out.println(encabezadosTicket[j]);
        }

        for (int i = 0; i<ticket.length; i++){
            for (int j = 0; j < ticket[i].length; j++){
                System.out.println("Ingrese " + encabezadosTicket[j] + " del ticket " + (i + 1) + ": ");
                ticket[i][j] = sc.nextLine();
            }
        }
    }

    public static void consultarTicket(){
        for (int i = 0; i < ticket.length; i++){
            if (ticket[i][0] != null) {
                for (int j = 0; j < ticket[i].length; j++){
                    System.out.println(encabezadosTicket[j] + ": " + ticket[i][j]);
                }
                System.out.println("----------------------");
            }
        }
    }

    public static void consultarTicketPorId() {
        System.out.println("Ingrese el id del ticket a consultar");
        ticketId = sc.nextInt();

        int i = ticketId - 1;

        if (i >= 0 && i < ticket.length && ticket[i][0] != null) {
            System.out.println("Datos del ticket " + ticketId + ": ");
            for (int j = 0; j < ticket[i].length; j++){
                System.out.println(encabezadosTicket[j] + ": " + ticket[i][j]);
            }
        }
    }

    public static void actualizarTicket(){
        System.out.println("Ingrese el id del ticket a actualizar");

        ticketId = sc.nextInt();

        int i = ticketId - 1;

        System.out.println("Seleccione el dato del ticket a actualizar 1. Usuario 2. Origen de ruta 3. Destino de ruta 4. Silla 5. Tren 6. Fecha 7. Hora 8. Precio");

        int opcion= sc.nextInt();
        sc.nextLine();

        switch (opcion){
            case 1:
                System.out.println("Actualizar usuario");
                ticket[i][1] = sc.nextLine();
                break;

            case 2:
                System.out.println("Actualizar origen de ruta");
                ticket[i][2] = sc.nextLine();
                break;

            case 3:
                System.out.println("Actualizar destino de ruta");
                ticket[i][3] = sc.nextLine();
                break;

            case 4:
                System.out.println("Actualizar silla");
                ticket[i][4] = sc.nextLine();
                break;

            case 5:
                System.out.println("Actualizar tren");
                ticket[i][5] = sc.nextLine();
                break;

            case 6:
                System.out.println("Actualizar fecha");
                ticket[i][6] = sc.nextLine();
                break;

            case 7:
                System.out.println("Actualizar hora");
                ticket[i][7] = sc.nextLine();
                break;

            case 8:
                System.out.println("Actualizar precio");
                ticket[i][8] = sc.nextLine();
                break;

            default:
                System.out.println("Opcion no valida");
        }
    }

    public static void eliminarTicketPorId(){
       System.out.println("Ingrese el id del ticket a eliminar");

       ticketId = sc.nextInt();

       int i = ticketId - 1;

       for (int j = 0; j < ticket[i].length; j++){
           ticket[i][j] = null;
       }
       System.out.println("Datos del ticket " + ticketId + " eliminado ");
    }

    // menu tickets

    public static void menuTicket(){

    int opcion = -1;

        while (opcion != 0) {

        System.out.println("1. Crear ticket");
        System.out.println("2. Consultar todos");
        System.out.println("3. Consultar ticket por id");
        System.out.println("4. Actualizar");
        System.out.println("5. Eliminar");
        System.out.println("0. Salir");

        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 0:
                System.out.println("Saliendo...");
                System.out.println("Dele enter para continuar");
                sc.nextLine();
                break;

            case 1:
                crearTicket();
                break;

            case 2:
                consultarTicket();
                break;

            case 3:
                consultarTicketPorId();
                break;

            case 4:
                actualizarTicket();
                break;

            case 5:
                eliminarTicketPorId();
                break;

            default:
                System.out.println("Opcion no valida");
        }
    }
}
    // Registro de la venta

    static String[] encabezadosVenta = {"Id venta", "Id ticket", "Precio", "Cantidad", "Total"};

    public static void crearVenta(){
        for (int j = 0; j < encabezadosVenta.length; j++){
            System.out.println(encabezadosVenta[j]);
        }

        for (int i = 0; i < venta.length; i++){

            for (int j = 0; j < 4; j++){
                System.out.println("Ingrese " + encabezadosVenta[j] + " de la venta " + (i + 1) + ": ");
                venta[i][j] = sc.nextLine();
            }

            // Texto a número
            double precioNumero = Double.parseDouble(venta[i][2]);
            int cantidadNumero = Integer.parseInt(venta[i][3]);

            // Se calcula
            double total = precioNumero * cantidadNumero;

            // Número a texto, y se guarda en la columna 4
            venta[i][4] = String.valueOf(total);
        }
    }

    public  static void consultarVenta(){
        for (int i = 0; i < venta.length; i++){
            if (venta[i][0] != null) {
                for (int j = 0; j < venta[i].length; j++){
                    System.out.println(encabezadosVenta[j] + ": " + venta[i][j]);
                }
                System.out.println("----------------------");
            }
        }
    }

    public static void consultarVentaPorId(){
        System.out.println("Ingrese el id del venta a consultar");
        ventaId = sc.nextInt();

        int i = ventaId - 1;

        if (i >= 0 && i < venta.length && venta[i][0] != null) {
            System.out.println("Datos de venta " + venta[i][0] + ": ");
            for (int j = 0; j < venta[i].length; j++){
                System.out.println(encabezadosVenta[j] + ": " + venta[i][j]);
            }
        }
    }

    public static void actualizarVenta(){
        System.out.println("Ingrese el id de venta a actualizar");

        ventaId = sc.nextInt();

        int i = ventaId - 1;

        System.out.println("Seleccione el dato de venta a actualizar 1. Id ticket 2. Precio 3. Cantidad");

        int opcion= sc.nextInt();
        sc.nextLine();

        switch (opcion){
            case 1:
                System.out.println("Actualizar id ticket");
                venta[i][1] = sc.nextLine();
                break;

            case 2:
                System.out.println("Actualizar precio");
                venta[i][2] = sc.nextLine();
                break;

            case 3:
                System.out.println("Actualizar cantidad");
                venta[i][3] = sc.nextLine();
                break;

                default:
                    System.out.println("Opcion no valida");
        }
        if (opcion == 2 || opcion == 3) {
            double precioNumero = Double.parseDouble(venta[i][2]);
            int cantidadNumero = Integer.parseInt(venta[i][3]);
            venta[i][4] = String.valueOf(precioNumero * cantidadNumero);
        }
    }

    public static void eliminarVentaPorId(){
        System.out.println("Ingrese el id de venta a eliminar");

        ventaId = sc.nextInt();

        int i = ventaId - 1;

        for (int j = 0; j < venta[i].length; j++){
            venta[i][j] = null;
        }
        System.out.println("Datos de venta " + ventaId + " eliminado ");
    }

    // menu venta

    public static void menuVenta() {
        int opcion = -1;

        while (opcion != 0) {

            System.out.println("1. Crear venta");
            System.out.println("2. Consultar todos");
            System.out.println("3. Consultar venta por id");
            System.out.println("4. Actualizar");
            System.out.println("5. Eliminar");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...");
                    System.out.println("Dele enter para continuar");
                    sc.nextLine();
                    break;

                case 1:
                    crearVenta();
                    break;

                case 2:
                    consultarVenta();
                    break;

                case 3:
                    consultarVentaPorId();
                    break;

                case 4:
                    actualizarVenta();
                    break;

                case 5:
                    eliminarVentaPorId();
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    // Metodo de la App

    public static void iniciarApp() {

        System.out.println("=================================");
        System.out.println("Ferrocarriles de Antioquia");
        System.out.println("=================================");
        System.out.println("Presione enter para continuar");
        sc.nextLine();

        registrarCajero();
        boolean entro = login();

        if (entro) {
            menuApp();
        } else {
            System.out.println("No puede entrar");
        }
    }

    // Menu de app

    public static void menuApp() {

        int opcion = -1;

        while (opcion != 0) {

            System.out.println("1. Usuarios");
            System.out.println("2. Trenes");
            System.out.println("3. Tickets");
            System.out.println("4. Ventas");
            System.out.println("0. Cerrar sesión");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 0:
                    System.out.println("Cerrando sesión...");
                    System.out.println("Sesión cerrada");
                    System.out.println("¡Vuelva Pronto!");
                    break;

                case 1:
                    menuUsuario();
                    break;

                case 2:
                    menuTren();
                    break;

                case 3:
                    menuTicket();
                    break;

                case 4:
                    menuVenta();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }






}




