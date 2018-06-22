import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sklep {

    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("Products.csv");
        Scanner scanner = new Scanner(plik);
        Product[] tablicaProduktow = new Product[5];

        int i = 0;
        double suma = 0;
        while (scanner.hasNextLine()) {
            String linia = scanner.nextLine();
            String[] tablicaStringow = linia.split(";");
            Double cena = Double.valueOf(tablicaStringow[2]);
            Product prods = new Product(tablicaStringow[0], tablicaStringow[1], cena);
            tablicaProduktow[i] = prods;
            suma+=prods.zliczCeny(prods);
            i++;
        }
        System.out.println(suma);

    }
}