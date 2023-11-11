package app;

public class Main {
    static int productNumber;
    static String productName;
    static double salesDay;
    static int days;
    static double totalPrice;
    private final static String CURRENCY = "EUR";

    public static void main(String[] args){

        productNumber = 1;
        productName = "smartphone";
        days = 5;
        totalPrice = 12153.41;
        salesDay = totalPrice / days;
        var round = Math.round(salesDay * 100.0) / 100.0;
        System.out.println("Product No" + productNumber + ": " +
                           productName + "," + "\ntotal sales for " +
                           days + " days" + " is " + CURRENCY + " " +
                           totalPrice + "," + "\nsales by day is " +
                           CURRENCY + " " + round + ".");
        productNumber = 2;
        productName = "laptop";
        days = 7;
        totalPrice = 10486.85;
        salesDay = totalPrice / days;
        var round1 = Math.round(salesDay * 100.0) / 100.0;
        System.out.println("\nProduct No" + productNumber + ": " +
                           productName + "," + "\ntotal sales for " +
                           days + " days" + " is " + CURRENCY + " " +
                           totalPrice + "," + "\nsales by day is " +
                           CURRENCY + " " + round1 + ".");
    }
}
