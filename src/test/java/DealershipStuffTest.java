import DealershipStuff.Customer;
import DealershipStuff.SalesAssistant;
import DealershipStuff.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipStuffTest {
    Customer customer;
    SalesAssistant salesAssistant;
    Till till;

    @Before
    public void before() {
        customer = new Customer("Anthony", 5000);
        salesAssistant = new SalesAssistant("Aaron", 20000);
        till = new Till(800);
    }

    @Test
    public void canGetName() {
        assertEquals("Anthony", customer.getName());
        assertEquals("Aaron", salesAssistant.getName());
    }

}
