public class Smartphone extends Product {
    private String name;
    private String manufacturer;

    public Smartphone(int id, String name, String manufacturer, int price) {
        super(id, name, price);
        this.manufacturer = manufacturer;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
