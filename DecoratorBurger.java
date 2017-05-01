
public class DecoratorBurger implements Burger{
  private Burger YourBurger=null;
    
  public DecoratorBurger (Burger yourburger){
      YourBurger =yourburger;
  }
    
  public String orderDescription(){
      return YourBurger.orderDescription();
  }    
  
  public double calPrice(){
     return YourBurger.calPrice();
  }
}
