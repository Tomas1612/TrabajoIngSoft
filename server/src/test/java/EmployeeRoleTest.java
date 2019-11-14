package payroll;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeRoleTest {

    @Test
    public void TestBasic() {
    	Employee alex = new Employee("alex", "test");
    	assertEquals(alex.getRole(), "stest");
    }
}