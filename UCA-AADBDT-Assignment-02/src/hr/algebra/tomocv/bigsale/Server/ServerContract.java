package hr.algebra.tomocv.bigsale.Server;


import hr.algebra.tomocv.bigsale.Products.ProductInfo;

import java.io.IOException;

public interface ServerContract {
    ProductInfo putProductOnSale() throws IOException;
}
