package ru.test.freebie_coffee.models;

public class Product extends AbstractBaseEntity {
    private Integer price;

    private String title;

    private String description;

    public Product() {
    }

    public Product(Integer id, String name, Integer price, String title, String description) {
        super(id, name);
        this.price = price;
        this.title = title;
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
