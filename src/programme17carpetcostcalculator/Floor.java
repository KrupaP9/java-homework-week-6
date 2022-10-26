package programme17carpetcostcalculator;

public class Floor {
    double width,length;
    public Floor(double width, double length){
        this.width=width;
        this.length=length;
        if (width<0 && length<0){
            this.width=0;
            this.length=0;
        }else{
            this.width=width;
            this.length=length;
        }
    }
    public double getArea(){
        return ((this.width)*(this.length));
    }
}
