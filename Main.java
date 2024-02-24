package aleatorios;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {
        	"Ana", "Luis", "Andres", "Julia", "Alma",
        	"Esperanza", "Antonio", "Emilio", "Alberto", "Elena",
            "Javier", "Lucía", "Miguel", "Isabel", "Pablo"
        };
        Random miRand = new Random();
        for (int i = nombres.length - 1; i > 0; i--) {
            int index = miRand.nextInt(i + 1);
            String temp = nombres[index];
            nombres[index] = nombres[i];
            nombres[i] = temp; 
           
        }
        System.out.println("Orden de nombres de forma aleatoria:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}

