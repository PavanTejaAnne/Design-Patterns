

import static org.junit.Assert.*;
import org.junit.Test;

public class OrderTest
{

    public OrderTest()
    {
    }

    @Test
    public void baseTest()
    {
        OrderManager.printOrderAndPrice();
    }

    @Test
    public void customBuildOrder()
    {
        OrderManager om=new OrderManager();
        om.customizeOrder();
    }
}


