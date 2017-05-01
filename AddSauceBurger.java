import java.util.ArrayList;

public class AddSauceBurger extends DecoratorBurger{
    private String oldDescription;  
    private double oldPrice;
  
    private ArrayList<String> sauceList;
    
    public AddSauceBurger (Burger yourOldBurger){ //default constructor for test
        super (yourOldBurger);
        ArrayList<String> templist= new ArrayList<String>();
        templist.add("Apricot Sauce");
        sauceList=templist;
    }
    
    public AddSauceBurger (Burger yourOldBurger, ArrayList<String> yourSauceList){
        super (yourOldBurger);
        sauceList= yourSauceList;
    }
    
    public String orderDescription(){
      oldDescription=super.orderDescription();
      String result= oldDescription + "\nSauce: ";
      for(String sauce: sauceList){  
        result += sauce + ", " ;
      }
      return result;
    }    
  
    public double calPrice(){
        oldPrice=super.calPrice();
        double result=oldPrice;
        if(sauceList.size()>1){
            result += OrderManager.PriceForExtraSauce * (sauceList.size()-1); 
        }
        return result;
    }

}
