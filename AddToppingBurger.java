import java.util.ArrayList;

public class AddToppingBurger extends DecoratorBurger{
    private String oldDescription;  
    private double oldPrice;
  
    private ArrayList<String> toppingList;
    private ArrayList<String> premiumToppingList;
    
    public AddToppingBurger (Burger youroldburger){ //default constructor for test
        super (youroldburger);
        ArrayList<String> templist= new ArrayList<String>();
        templist.add("Bermuda Red Onion");
        templist.add("Black Olives");
        templist.add("Carrot String");
        templist.add("Coleslaw");
        toppingList=templist;
        ArrayList<String> templist2= new ArrayList<String>();
        templist2.add("Applewood Smoked Bacon");
        premiumToppingList=templist2;
    }
    
    public AddToppingBurger (Burger yourOldBurger, 
                             ArrayList<String> yourToppingList,
                             ArrayList<String> yourPremiumToppingList){
        super (yourOldBurger);
        toppingList=yourToppingList;
        premiumToppingList=yourPremiumToppingList;
    }
    
    public String orderDescription(){
      oldDescription=super.orderDescription();
      String result= oldDescription + "\nTopping: ";
      
      for(String topping: toppingList){  
        result += topping + ", " ;
      }
      
      result += "\nPremium Topping: ";
      
      for(String premiumTopping: premiumToppingList){  
        result += premiumTopping + ", " ;
      }
      
      return result;
    }    
  
    public double calPrice(){
        oldPrice=super.calPrice();
        double result=oldPrice;
        
        if(toppingList.size()>4){
            result += OrderManager.PriceForExtraCheese * (toppingList.size()-4); 
        }
        
        result += OrderManager.PriceForPremiumTopping * premiumToppingList.size();
        
        return result;
    }
    
   
}
