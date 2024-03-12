import java.io.*;
import java.util.*;

public class HT6 {

    public static void main(String args[]) {
        // LECTOR TXT _____________________
        ArrayList<String> lista = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
            String linea;

            while ((linea = reader.readLine()) != null) {
                // System.out.println(linea);
                // lista.add(linea);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // LECTOR CSV _____________________
        // import com.opencsv.CSVReader;
        try {
            CSVReader reader = new CSVReader(new FileReader("archivo.csv"));
            List<String[]> datos = reader.readAll();

            for (String[] fila : datos) {
                for (String elemento : fila) {
                    // System.out.print(elemento + "\t");
                }
                System.out.println();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        MapFactoryC mapFactory = new MapFactoryC();
        Map<String, String> map = mapFactory.getMap(0);

        Scanner sc = new Scanner(System.in);
        boolean go = true;
        int opcion = 0;

        while (go) {
            Menu();
            opcion = sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println();
                    break;

                case 2:

                    break;

                default:
                    System.out.println("\u001B[31mOpción incorrecta");
                    break;
            }

        }
    }
}

public static void Menu() {

    System.out.println("\n");
    System.out.println("MENÚ");
    System.out.println("Ingrese la opción seleccionada: ");
    System.out.println("\n");
}