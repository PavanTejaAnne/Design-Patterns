import java.util.ArrayList;

public class AddPurist extends DecoratorBurger {
    
    private String oldDescription;  
    private double oldPrice;
  
    private ArrayList<String> puristList;
    
    public AddPurist (Burger yourOldBurger){ //default constructor for test
        super (yourOldBurger);
        ArrayList<String> templist= new ArrayList<String>();
        templist.add("The Purist");
        puristList=templist;
    }
    
    public AddPurist (Burger yourOldBurger, ArrayList<String> yourpuristList){
        super (yourOldBurger);
        puristList= yourpuristList;
    }
    
    public String orderDescription(){
      oldDescription=super.orderDescription();
      String result= oldDescription + "\nThePurist: ";
      for(String purist: puristList){  
        result=result + purist + ", " ;
      }
      return result;
    }    
  
    public double calPrice(){
        oldPrice=super.calPrice();
        double result=oldPrice;
        if(puristList.size()>0){
            result += OrderManager.ThePurist * (puristList.size()); 
        }
        return result;
    }
    
}
