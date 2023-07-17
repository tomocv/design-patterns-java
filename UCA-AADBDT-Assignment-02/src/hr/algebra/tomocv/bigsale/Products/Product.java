package hr.algebra.tomocv.bigsale.Products;

public class Product {
    private String name;
    private double price, discount, discountPrice;

    private Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.discountPrice = price - price * discount ;
    }

    public static Product createProduct(String content) {
        var data = content.split(";");
        return new Product(
                data[0],
                Double.parseDouble(data[1]),
                Double.parseDouble(data[2]) / 100d);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }
}
