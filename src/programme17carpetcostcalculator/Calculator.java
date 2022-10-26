package programme17carpetcostcalculator;

public class Calculator {
    Floor floor;
    Carpet carpet;
    public Calculator(Floor floor, Carpet carpet){
        this.floor=floor;
        this.carpet=carpet;
    }
    public double getTotalCost(){
        double price = floor.getArea() * carpet.getCost();
        return price;
    }
}
