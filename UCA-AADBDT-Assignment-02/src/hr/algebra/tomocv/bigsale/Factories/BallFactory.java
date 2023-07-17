package hr.algebra.tomocv.bigsale.Factories;

import hr.algebra.tomocv.bigsale.Products.Ball;
import hr.algebra.tomocv.bigsale.Products.ProductOnSale;

public class BallFactory implements ProductsFactory {
    @Override
    public ProductOnSale createProductOnSale() {
        return new Ball();
    }
}
