
package javacourseworkup877496;

public enum crust {
    Thin(1.08),
    Deep(1.10),
    Stuffed(2.14);
    
    
     private double cost;
    
    crust (double cost){this.cost=cost;}
    
    public double getCost(){return cost;}

}
