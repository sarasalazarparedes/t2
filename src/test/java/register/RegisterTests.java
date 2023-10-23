package register;

import base.BaseTest;
import com.example.register.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RegisterTests extends BaseTest {

    private RegisterPage employeePage;


    @Test
    public void testAddEmployee(){
        employeePage.addEmployee("Juan","125463");
        employeePage.clickON();
        Assert.assertTrue(employeePage.isSuccessAlertVisible());
    }

    @Test
    public void testAddEmployeeEmptyFields(){
        employeePage.addEmployee("","");
        Assert.assertTrue(employeePage.isErrorAlertVisible());
    }
}
