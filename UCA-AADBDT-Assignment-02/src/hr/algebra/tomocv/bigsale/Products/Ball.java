package hr.algebra.tomocv.bigsale.Products;

public class Ball implements ProductOnSale {
    public Ball() {
    }

    @Override
    public ProductInfo putOnSale(Product product) {
        return new ProductInfo(product);
    }
}
