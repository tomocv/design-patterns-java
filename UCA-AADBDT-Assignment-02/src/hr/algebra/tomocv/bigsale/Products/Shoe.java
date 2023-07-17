package hr.algebra.tomocv.bigsale.Products;

public class Shoe implements ProductOnSale {

    @Override
    public ProductInfo putOnSale(Product product) {
        return new ProductInfo(product);
    }
}
