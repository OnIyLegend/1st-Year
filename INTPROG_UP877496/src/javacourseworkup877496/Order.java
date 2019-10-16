
package javacourseworkup877496;
import java.util.*;

public class Order {
    
        private ArrayList<Pizza> PizzaObj ;
        
         public Order(){
        PizzaObj= new ArrayList<Pizza>();
   
    }
         // ADDING PIZZAS TO THE ORDER
                 public void addPizza(size size ,crust crust,sauce sauce, Topping topping1,  Topping topping2){
             Pizza myPizza = new Pizza( size , crust, sauce,  topping1,  topping2);
        PizzaObj.add(myPizza);
        
         }
             // DELETING PIZZAS BY HAVING INPUTING THE SAME INFO FOR THE PIZZA WE WANT TO DELETE (-1 on index because index starts from 0)   
         public String  deletePizza(int index,size size ,crust crust,sauce sauce, Topping topping1,  Topping topping2){
             Pizza newPizza = new Pizza( size , crust, sauce,  topping1,   topping2);
             PizzaObj.set(index-1, newPizza);
             for(Pizza p: PizzaObj){
             if ( p.getSize().equals(size)
              &&   p.getSauce().equals(sauce)
              &&   p.getTopping1().equals(topping1)
              &&   p.getTopping2().equals(topping2));{
      PizzaObj.remove(p);
      return "";
             }
         }  
         return "";
}
         
      // DISPLAYING THE PIZZAS GETTING THE INFO FROM PIZZA CLASS
        public String display(){
            String PizzaInfo="";
            for (Pizza p: PizzaObj)
            {
             PizzaInfo += "\n=====================\n" + p.getPizzainfo();          
            }
            return PizzaInfo;                   
            }
        
       // CALCULATES THE FINAL COST OF THE ORDER AND DISPLAYS IT
        public String FinalCost(){
            double cost =0;
            for (Pizza p: PizzaObj){
                cost += p.setCost();
            }        
            
        return"" + String.format("£%.2f ", cost);
}
       // COUNTING THE NUMBER OF PIZZAS IN THE ORDER
         public int numPizza(){
             return this.PizzaObj.size();
         }
       // UPDATING PIZZA INFO BASED ON THE INDEX NUMBER WHICH SHOW WHAT PIZZA TO UPDATE
         public void updatePizza(int index, size size ,crust crust,sauce sauce, Topping topping1,  Topping topping2){
             Pizza newPizza = new Pizza( size , crust, sauce,  topping1,   topping2);
             PizzaObj.set(index-1, newPizza);
         }               
    }
         
    


