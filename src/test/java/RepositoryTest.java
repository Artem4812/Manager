import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RepositoryTest {
    Repository repository = new Repository();

    Book book1 = new Book(1, "Первая", "Миша", 2500);
    Book book2 = new Book(2, "Вторая", "Саша", 2000);
    Book book3 = new Book(3, "Третья", "Таня", 1000);
    Smartphone smartphone1 = new Smartphone(4, "3310", "Nokia", 3500);
    Smartphone smartphone2 = new Smartphone(5, "Galaxy S48", "Samsung", 90_000);
    Smartphone smartphone3 = new Smartphone(6, "Iphone 100500", "Apple", 1_000_000);
    Smartphone smartphone4 = new Smartphone(7, "HelloMoto", "Motorola", 10_000);

    @BeforeEach
    public void setup() {
        repository.save(book1);
        repository.save(book2);
        repository.save(book3);
        repository.save(smartphone1);
        repository.save(smartphone2);
        repository.save(smartphone3);
    }

    @Test
    public void addProductsToRepository() {
        repository.save(smartphone4);
        Product[] expected = {book1, book2, book3, smartphone1, smartphone2, smartphone3, smartphone4};
        Product[] actual = repository.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        repository.removeById(3);
        Product[] expected = {book1, book2, smartphone1, smartphone2, smartphone3};
        Product[] actual = repository.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        Product[] expected = {book1, book2, book3, smartphone1, smartphone2, smartphone3};
        Product[] actual = repository.findAll();
    }

    @Test
    public void shouldSetNameBook() {
        book1.setName("Геннадий");
        String expected = "Геннадий";
        String actual = book1.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAuthor() {
        String expected = "Миша";
        String actual = book1.getAuthor();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAuthor1() {
        book1.setAuthor("Маша");
        String expected = "Маша";
        String actual = book1.getAuthor();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNameSmartphone() {
        smartphone1.setName("SuperDuper");
        String expected = "SuperDuper";
        String actual = smartphone1.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetManufacturer() {
        String expected = "Nokia";
        String actual = smartphone1.getManufacturer();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAuthor() {
        smartphone1.setManufacturer("Huawei");
        String expected = "Huawei";
        String actual = smartphone1.getManufacturer();
        Assertions.assertEquals(expected, actual);
    }
}
