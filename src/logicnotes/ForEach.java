package logicnotes;

public class ForEach {

    public static void main(String[] args) {

        String [] cities = {"Medellín", "Sabaneta", "Bello", "Barbosa", "Copacabana", "Girardota", "La estrella", "Envigado", "Caldas"};

                int i = 0;
                for (String city : cities) {
                    System.out.println(city);
                    i++;
                }
    }
}
