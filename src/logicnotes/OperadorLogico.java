package logicnotes;

public class OperadorLogico {
    public static void main(String[] args){
        // Operadores Logicos &&(conjución)y , ||(disyunción)0 , !

        int key = 3030;
        int keyUser = 3030;
        boolean validateKey = keyUser == key;

        String user = "Juan";
        String userUser = "Juan";

        boolean validateUser = userUser.equals(user);

        boolean validateCredencials = validateKey && validateUser;

        System.out.println("Inicia sesión: " + validateCredencials);
    }

}
