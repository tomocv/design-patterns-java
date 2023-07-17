package hr.algebra.tomocv.bigsale.Products;

public class Racket implements ProductOnSale{
    public Racket() {
    }

    @Override
    public ProductInfo putOnSale(Product product) {
        return new ProductInfo(product);
    }
}
