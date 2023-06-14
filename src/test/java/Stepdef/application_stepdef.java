package Stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class application_stepdef {

    @Given("i am looking on homepage searching for job")
    public void iAmLookingOnHomepageSearchingForJob() {
        baseclass.driverinit();

    }

    @When("i click on apply")
    public void i_click_on_apply() {
        baseclass.Applijobpageobj.clickapply();
    }

    @Then("fill all mandatory field")
    public void fill_all_mandatory_field(io.cucumber.datatable.DataTable dataTable) {
          List<List<String>> data = dataTable.cells();
          baseclass.Applijobpageobj.enterfirstname(data.get(1).get(1));
          baseclass.Applijobpageobj.entersurname(data.get(1).get(2));
          baseclass.Applijobpageobj.enteremail(data.get(1).get(3));
          baseclass.Applijobpageobj.entermobile(data.get(1).get(4));
          baseclass.Applijobpageobj.uploaadfiles(data.get(1).get(5));

    }
    @Then("fill all mandatory field Firstname {string} Surname {string} Email {string} MobileNumber {string} and Uploadfile {string}")
    public void fill_all_mandatory_field_firstname_surname_email_mobile_number_and_uploadfile (String firstName, String surname, String email, String mobileNumber, String uploadFile){
        baseclass.Applijobpageobj.enterfirstname(firstName);
        baseclass.Applijobpageobj.entersurname(surname);
        baseclass.Applijobpageobj.enteremail(email);
        baseclass.Applijobpageobj.entermobile(mobileNumber);
        baseclass.Applijobpageobj.uploaadfiles(uploadFile);


    }


}