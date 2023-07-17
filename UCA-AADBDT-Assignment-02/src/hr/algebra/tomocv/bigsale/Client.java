package hr.algebra.tomocv.bigsale;


import hr.algebra.tomocv.bigsale.Logger.Logger;
import hr.algebra.tomocv.bigsale.Server.Server;

public class Client {
    private static final int NUMBER_OF_REPETITIONS = 5;
    private static final long SLEEP_MILLIS = 5000;

    public static void main(String[] args) throws Exception {

        var server = new Server();
        for (int i = 0; i < NUMBER_OF_REPETITIONS; i++) {
            var productInfo = server.putProductOnSale();
            System.out.println(productInfo.toString());
            Logger logger = new Logger();
            logger.log(productInfo.toFile());
            Thread.sleep(SLEEP_MILLIS);
        }
    }
}
