package nl.lars.Model;

public class Product {

    private float price = 0.0f;
    String productName = "name";


    public Product(double price, String productName){
        this.productName;
        this.price;
    }

    public float getPrice() {
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


    //UNIT TEST
    public boolean isEetbaar(boolean voedsel){
        if(voedsel){
            return true;
        }
        return false;
    }
}
