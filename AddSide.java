import java.util.ArrayList;

public class AddSide extends DecoratorBurger {
    
    private String oldDescription;  
    private double oldPrice;
  
    private ArrayList<String> side;
    
    public AddSide (Burger yourOldBurger){ //default constructor for test
        super (yourOldBurger);
        ArrayList<String> templist= new ArrayList<String>();
        templist.add("Crispy Onion Strings ");
        side=templist;
    }
    
    public AddSide (Burger yourOldBurger, ArrayList<String> yourside){
        super (yourOldBurger);
        side= yourside;
    }
    
    public String orderDescription(){
      oldDescription=super.orderDescription();
      String result= oldDescription + "\nSides: ";
      for(String sides: side){  
        result=result + sides + ", " ;
      }
      return result;
    }    
  
    public double calPrice(){
        oldPrice=super.calPrice();
        double result=oldPrice;
        if(side.size()>0){
            result += OrderManager.PriceforSide * (side.size()); 
        }
        return result;
    }
    
}
