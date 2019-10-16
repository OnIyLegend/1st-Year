
package javacourseworkup877496;


public class Test {
    
        public static void main(String[] args) {
           
             Order order =new Order();  
             System.out.println("\n======== ADDING 4 PIZZAS ========");
             
                     order.addPizza(size.Medium,crust.Thin,sauce.Pesto,Topping.EXTRA_CHEESE,Topping.CHILLI);
                     order.addPizza(size.Medium,crust.Stuffed,sauce.Pesto,Topping.OLIVE,Topping.ONION);
                     order.addPizza(size.Small,crust.Thin,sauce.Pesto,Topping.CHILLI,Topping.PEPPERONI);
                     order.addPizza(size.Small,crust.Thin,sauce.Pesto,Topping.OLIVE,Topping.OLIVE);
                     
                     System.out.print(order.display());
      
      System.out.println("\n=====================");
      

      System.out.println("\n===== ORDER COST =====");
      System.out.print(order.FinalCost());
      
      System.out.println("\n===== NUMBER OF PIZZAS =====");
      System.out.print(order.numPizza());
      
      
      System.out.println("\n--------------------------------------------");

       
System.out.println("\n======== UPDATING PIZZA 3 ========");
System.out.print( "Size Medium, \n"+ "Topping EXTRA CHEESE, \n");

order.updatePizza(1,size.Medium,crust.Thin,sauce.Pesto,Topping.ONION,Topping.EXTRA_CHEESE);
System.out.println("\n======== PIZZA 3 HAS BEEN UPDATED ========");

System.out.println("\n======== REMOVING PIZZA 1 ========");
System.out.print("PIZZA 1:\n"+
                "Size Medium, \n"+
                "Crust Thin, \n"+
                "Sauce Pesto, \n"+
                "Topping EXTRA CHEESE, \n"+
                "Topping CHILLI, \n");

    order.deletePizza(3,size.Medium,crust.Thin,sauce.Pesto,Topping.CHILLI,Topping.EXTRA_CHEESE); 
     System.out.println("\n======== PIZZA 1 HAS BEEN REMOVED ========");

     System.out.print(order.display());
     
     System.out.println("\n======== ORDER COST ========");
     System.out.print(order.FinalCost());
     
      System.out.println("\n======== NUMBER OF PIZZAS =========");
      System.out.print(order.numPizza());
      
      
      System.out.println("\n--------------------------------------------");

     
        }
}
   