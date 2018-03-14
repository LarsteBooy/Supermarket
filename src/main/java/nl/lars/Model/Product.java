package nl.lars.Model;

public class Product {

    private double price = 0.0f;
    private String productName = "name";
    private int quantity = 0;


    public Product(String productName, double price, int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(float price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    //UNIT TEST
    public boolean isEetbaar(boolean voedsel){
        if(voedsel){
            return true;
        }
        return false;
    }


}
