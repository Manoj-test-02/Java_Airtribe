package Assignement2_DesignPattern.Patron;

public enum Subscription {
    THREEMONTHS(150),
    SIXMONTH(250),
    YEARLY(600);

    private final double subscriptionCost;
    Subscription(double cost){
        this.subscriptionCost = cost;
    }

    public double getPrice(){
        return subscriptionCost;
    }
}
