public class Book extends Product {
    private String name;
    private String author;

    public Book(int id, String name, String author, int price) {
        super(id, name, price);
        this.author = author;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
