package hr.algebra.tomocv.bigsale.Factories;

import hr.algebra.tomocv.bigsale.Products.ProductOnSale;
import hr.algebra.tomocv.bigsale.Products.Racket;

public class RacketFactory implements ProductsFactory {
    @Override
    public ProductOnSale createProductOnSale() {
        return new Racket();
    }
}
