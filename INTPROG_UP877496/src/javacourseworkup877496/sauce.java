
package javacourseworkup877496;

public enum sauce {
    Tomato(0),
    Pesto(0.50);
    
    
     private double cost;
    
    sauce (double cost){this.cost=cost;}
    
    public double getCost(){return cost;}
}
