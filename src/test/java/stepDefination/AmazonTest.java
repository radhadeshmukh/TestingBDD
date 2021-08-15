package stepDefination;
import framework.CommonMethods;
import framework.Reusablefunction;
import framework.TextBoxHelper;
import io.cucumber.java.en.Given;
import pages.Amazonpage;
public class AmazonTest {

 
      
       
       
       @Given("^I navigate to the login page$")
       public void i_navigate_to_the_login_page() throws Throwable {
    	   Reusablefunction.login("examples@gmail.com", "password");
       }

       @Given("^User search for Lenovo Laptop$")
       public void user_search_for_lenovo_laptop() throws Throwable {
    	TextBoxHelper.settext(Amazonpage.search, "Lenovo");
       }

       @Given("^click on All option$")
       public void click_on_all_option() throws Throwable {
        CommonMethods.clickOnElementUsingActions(Amazonpage.openmenu);
       }
    }

