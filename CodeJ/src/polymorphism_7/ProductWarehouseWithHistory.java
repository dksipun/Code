package polymorphism_7;

public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName,capacity);
        changeHistory=new ChangeHistory();
        super.addToWarehouse(initialBalance);
        changeHistory.add(initialBalance);
    }

    public String history(){
        return this.changeHistory+"";
    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        changeHistory.add(getBalance());
    }
    public double takeFromWarehouse(double amount){
        double x=super.takeFromWarehouse(amount);
        changeHistory.add(getBalance());
        return x;
    }
    public void printAnalysis(){
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+this.history());
        System.out.println("Largest amount of product: "+changeHistory.maxValue());
        System.out.println("Smallest amount of product: "+changeHistory.minValue());
        System.out.println("Average: "+changeHistory.average());
    }
}
