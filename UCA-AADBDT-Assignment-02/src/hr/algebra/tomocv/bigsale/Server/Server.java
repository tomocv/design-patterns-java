package hr.algebra.tomocv.bigsale.Server;

import hr.algebra.tomocv.bigsale.Factories.ProductsFactory;
import hr.algebra.tomocv.bigsale.Products.Product;
import hr.algebra.tomocv.bigsale.Products.ProductInfo;
import org.reflections.Reflections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Server implements ServerContract {
    private static final String FILE_PATH = "src/hr/algebra/tomocv/bigsale/Files/products.txt";
    private Map<String, ProductsFactory> factories = new HashMap<>();

    public Server() throws Exception {
        Set<Class<? extends ProductsFactory>> types =
                new Reflections("hr.algebra.tomocv.bigsale.Factories")
                        .getSubTypesOf(ProductsFactory.class);
        for (Class<? extends ProductsFactory> type : types) {
            factories.put(type.getSimpleName().replace("Factory", "").toLowerCase(),
                    type.getDeclaredConstructor().newInstance());
        }
    }

    @Override
    public ProductInfo putProductOnSale() throws IOException {
        String content = getData();
        Product product = Product.createProduct(content);

        if (factories.containsKey(product.getName())) {
            return factories.get(product.getName()).createProductOnSale().putOnSale(product);
        } else {
            return new ProductInfo(null);
        }
    }

    private String getData() throws IOException {
        String data = new String(Files.readAllBytes(Paths.get(FILE_PATH)));
        return data;
    }
}
