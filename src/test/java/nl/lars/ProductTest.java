package nl.lars;

import junit.framework.Assert;
import junit.framework.TestCase;
import nl.lars.Model.Product;

public class ProductTest extends TestCase {

    public void testIsEetbaar() {
        //Arrange
        boolean input = true;
        boolean expected = true;
        Product product = new Product("asdf", 34, 45);

        //Act
        boolean result = product.isEetbaar(input);


        //Assert
        Assert.assertEquals(expected, result);
    }
}