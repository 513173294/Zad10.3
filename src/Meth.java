public class Meth {
static Product findMostExpensiveProduct(Product[] products) {
    double max = 0;
    int maxIndex =0;
    for (int i = 0; i < products.length; i++) {
        if (products[i].getCena() > max){
            max = products[i].getCena();
            maxIndex =i;
        }


    }


    return products[maxIndex];

}

    public static double zliczCeny(Product[] products) {
        double suma=0;
        for (int i = 0; i <products.length ; i++) {
            suma+=products[i].getCena();

        }

        return  suma;
    }
}
