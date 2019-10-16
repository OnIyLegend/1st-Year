
package javacourseworkup877496;

public enum size {
    Small(9.45),
    Medium(11.87),
    Large(15.90);
    
    
     private double cost;
    
    size (double cost){this.cost=cost;}
    
    public double getCost(){return cost;}
    
}
