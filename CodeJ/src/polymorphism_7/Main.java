package polymorphism_7;

public class Main {

    public static void main(String[] args) {

        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        //juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
        juice.printAnalysis();

    }
}

//        Product: Juice
//        History: [1000.0, 988.7, 989.7]
//        Largest amount of product: 1000.0
//        Smallest amount of product: 988.7
//        Average: 992.8
