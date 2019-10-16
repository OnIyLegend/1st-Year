package javacourseworkup877496;

public class Pizza {
    
    private Topping topping1;
    private Topping topping2;
    private crust   crust;
    private size    size;
    private sauce   sauce;
    
     public Pizza( size size ,crust crust,sauce sauce, Topping topping1,  Topping topping2  ){
      this.size = size;
      this.crust = crust;
      this.sauce = sauce;
      this.topping1 = topping1;
      this.topping2 = topping2;        
        }

    public size getSize() { return size; }
    public crust getcrust() { return crust;} 
    public sauce getSauce() { return sauce;}
    public Topping getTopping1(){ return topping1;}    
    public Topping getTopping2(){ return topping2;}    

    
    
    
    
  public String getPizzainfo(){
      
      //TOTAL COST CALCULATION AND BASE CALCULATION      
      double  Tcost=baseCalc()+topping1.getCost()*5+topping2.getCost()*4+sauce.getCost();
      double base=size.getCost() + crust.getCost();
      double toppingcost1=  topping1.getCost()*5;
      double toppingcost2=  topping2.getCost()*4;
      
       // THE COSTS OF THE PIZZA IN A STRING FORMAT 
        String PizzaInfo =
        "TOTAL COST:  £"+String.format("%.2f",Tcost)
           + "\n"+this.size + " Size:  £"+String.format("%.2f ",size.getCost())
           + "\n"+this.crust + " Crust:  £"+String.format("%.2f ",crust.getCost())
           + "\n"+"BASE COST:  £"+String.format("%.2f " ,base)
           + "\n"+this.topping1 + " Topping: "+String.format(" 5* £%.2f  = £%.2f",topping1.getCost(), toppingcost1)
           + "\n"+this.topping2 + " Topping: "+String.format(" 4* £%.2f  = £%.2f",topping2.getCost(), toppingcost2)
           + "\n"+this.sauce + " Sauce: £"+String.format("%.2f",sauce.getCost());
      return PizzaInfo;
     
  }
  
  // METHOD FOR THE BASE CALCULATION
    public double baseCalc (){       
        double base;      
      base=size.getCost() + crust.getCost();      
      return base;
    }
    
    // METHOD FOR TOTAL CALCULATION
     public double setCost (){
             double Tcost;
                Tcost=baseCalc()+topping1.getCost()*5+topping2.getCost()*4+sauce.getCost();
             return Tcost;     
}   
    }

  
  