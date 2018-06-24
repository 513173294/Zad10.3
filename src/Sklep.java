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
            suma += Meth.zliczCeny(prod);
            i++;
        }
        Product mostExpensiveProduct = Meth.findMostExpensiveProduct(tablicaProduktow);

        System.out.println(mostExpensiveProduct);


        System.out.println(suma);

//        System.out.println("najdroższy produkt kosztuje : " + max + " i jest to: "
//                + tablicaProduktow[].toString());
//        Double najdrozszy = null;
//        for (int j = 0; j < tablicaProduktow.length; j++) {
//            if (tablicaProduktow[j].getCena() > najdrozszy) {
//                najdrozszy = tablicaProduktow[j].getCena();
//
//            }
//
//            System.out.println(najdrozszy);
    }
    }
