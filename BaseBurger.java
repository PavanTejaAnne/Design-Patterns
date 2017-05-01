import java.lang.String;

public class BaseBurger implements Burger
{  
    private String Meat;
    private String Weight;
    private String BunOrBowl;    

    
    public BaseBurger(){  //default constructor for test
        Meat="Beef";
        Weight="1/3lb";
        BunOrBowl="On A Bun";    

    }
    
    public BaseBurger (String meat, String weight, String bunOrBowl){
        Meat=meat;
        Weight=weight;
        BunOrBowl=bunOrBowl;

    }
    
    public double calPrice(){
        double price;
        String tempweight=this.Weight;
        switch (tempweight) {
            case "1/3lb" : price=OrderManager.PriceForOneThirdLb; break;
            case "2/3lb" : price=OrderManager.PriceForTwoThirdLb; break;
            case "1lb"   : price=OrderManager.PriceForOneLb; break;
            default : price=0; break;
        }
        
        if (BunOrBowl!="On A Bun") price +=OrderManager.PriceForBowl;
        
        return price;
        
    }
   
    public String orderDescription(){
        String result = Meat + ", " + Weight + ", " + BunOrBowl;
        return result;
    }
    
}
