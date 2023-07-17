package hr.algebra.tomocv.bigsale.Factories;

import hr.algebra.tomocv.bigsale.Products.ProductOnSale;
import hr.algebra.tomocv.bigsale.Products.Shoe;

public class ShoeFactory implements ProductsFactory {
    @Override
    public ProductOnSale createProductOnSale() {
        return new Shoe();
    }
}
