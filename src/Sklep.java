import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sklep {

    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("Products.csv");
        Scanner scanner = new Scanner(plik);


        int i = 0;

        Product[] tablicaProduktow = new Product[5];
        double suma = 0;
        while (scanner.hasNextLine()) {

            String linia = scanner.nextLine();
            String[] tablicaStringow = linia.split(";");
            Double cena = Double.valueOf(tablicaStringow[2]);
            Product prod = new Product(tablicaStringow[0], tablicaStringow[1], cena);
            tablicaProduktow[i] = prod;
            i++;
        }
        Product mostExpensiveProduct = Meth.findMostExpensiveProduct(tablicaProduktow);
        double zliczCeny = Meth.zliczCeny(tablicaProduktow);
        System.out.println(mostExpensiveProduct);
        System.out.println(zliczCeny);

    }
    }
