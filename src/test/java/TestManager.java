import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestManager {
    Repository repository = new Repository();
    ProductManager manager = new ProductManager(repository);

    Book book1 = new Book(1, "Первая", "Миша", 2500);
    Book book2 = new Book(2, "Вторая", "Саша", 2000);
    Book book3 = new Book(3, "Третья", "Таня", 1000);
    Smartphone smartphone1 = new Smartphone(4, "3310", "Nokia", 3500);
    Smartphone smartphone2 = new Smartphone(5, "Galaxy S48", "Samsung", 90_000);
    Smartphone smartphone3 = new Smartphone(6, "Iphone 100500", "Apple", 1_000_000);
    Smartphone smartphone4 = new Smartphone(7, "HelloMoto", "Motorola", 10_000);


    @BeforeEach
    public void setup() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
    }

    @Test
    public void addProductsManager() {
        manager.add(smartphone4);
        Product[] expected = {book1, book2, book3, smartphone1, smartphone2, smartphone3, smartphone4};
        Product[] actual = repository.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldSearchBook() {
        Product[] expected = {book1};
        Product[] actual = manager.searchBy("Первая");
        ;
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldSearchSmartphone() {
        Product[] expected = {smartphone2};
        Product[] actual = manager.searchBy("Galaxy S48");
        ;
        Assertions.assertArrayEquals(expected, actual);
    }

}
