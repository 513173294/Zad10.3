import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sklep {

    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("Products.csv");
        Scanner scanner = new Scanner(plik);

        while (scanner.hasNextLine()) {

            System.out.println(scanner.nextLine());
        }


        }
    }