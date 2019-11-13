package payroll;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NotFoundTest {

    @Test
    public void TestBasic() {
    	Employee alex = new Employee("alex", "test");
    	assertEquals(alex.getRole(), "test");
    }
}