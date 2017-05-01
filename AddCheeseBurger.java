import java.util.ArrayList;

public class AddCheeseBurger extends DecoratorBurger {
    
    private String oldDescription;  
    private double oldPrice;
  
    private ArrayList<String> cheeseList;
    
    public AddCheeseBurger (Burger yourOldBurger){ //default constructor for test
        super (yourOldBurger);
        ArrayList<String> templist= new ArrayList<String>();
        templist.add("Danish Blue Cheese");
        templist.add("Horseradish Cheddar");
        cheeseList=templist;
    }
    
    public AddCheeseBurger (Burger yourOldBurger, ArrayList<String> yourCheeseList){
        super (yourOldBurger);
        cheeseList= yourCheeseList;
    }
    
    public String orderDescription(){
      oldDescription=super.orderDescription();
      String result= oldDescription + "\nCheese: ";
      for(String cheese: cheeseList){  
        result=result + cheese + ", " ;
      }
      return result;
    }    
  
    public double calPrice(){
        oldPrice=super.calPrice();
        double result=oldPrice;
        if(cheeseList.size()>1){
            result += OrderManager.PriceForExtraCheese * (cheeseList.size()-1); 
        }
        return result;
    }
    
}
