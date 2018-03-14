package nl.lars;



import nl.lars.Model.Product;

import java.util.ArrayList;

public class Stock {

    ArrayList<Product> stock = new ArrayList<Product>();

    public void addToStock() {


        Product frikandelbroodje = new Product("Frikandelbroodje", 1.00, 10);
        Product pampers = new Product("Pampers", 9.99, 25);
        Product kipfilet = new Product("Kip filet", 2.40, 18);
        Product ijsthee = new Product("Ijsthee", 0.99, 30);

        stock.add(frikandelbroodje);
        stock.add(pampers);
        stock.add(kipfilet);
        stock.add(ijsthee);

        for( Product p: stock ){
            System.out.println(p.getProductName());
        }

    }



}
