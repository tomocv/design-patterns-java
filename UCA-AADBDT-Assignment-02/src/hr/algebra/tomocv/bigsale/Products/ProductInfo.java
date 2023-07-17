package hr.algebra.tomocv.bigsale.Products;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProductInfo {
    private Product product;
    private String ls = System.lineSeparator();
    private String stringContent, fileContent;

    public ProductInfo(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        if (product == null) {
            stringContent = "Product not found!" + ls +
                    "----------------------------------------" + ls;
        } else {
            stringContent = "Name: " + product.getName() + ls +
                    "Price: " + product.getPrice() + ls +
                    "Discount: " + product.getDiscount() * 100 + "%" + ls +
                    "Discount price: " + product.getDiscountPrice() + ls +
                    "----------------------------------------" + ls;
        }
        return stringContent;
    }

    public String toFile() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        String formattedString = localDateTime.format(formatter);
        if (product == null) {
            fileContent = formattedString + " Product not found!" + ls;
        } else {
            fileContent = formattedString + ";" + product.getName() + ";" + product.getDiscount() * 100 + "%" + ls;
        }
        return fileContent;
    }
}
