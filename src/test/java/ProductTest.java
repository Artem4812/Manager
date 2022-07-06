import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {
    Product product = new Product(1, "Книга", 1000);


    @Test
    public void shouldGetId() {
        int expected = 1;
        int actual = product.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetId() {
        product.setId(4);
        int expected = 4;
        int actual = product.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetName() {
        String expected = "Книга";
        String actual = product.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetName() {
        product.setName("Телефон");
        String expected = "Телефон";
        String actual = product.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPrice() {
        int expected = 1000;
        int actual = product.getPrice();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrice() {
        product.setPrice(180);
        int expected = 180;
        int actual = product.getPrice();
        Assertions.assertEquals(expected, actual);
    }


}
