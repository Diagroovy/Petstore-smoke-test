package stepdefs;

import endpoints.PetEndPoint;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Attachment;

public class PetStepDefs {
	
    private Sample test = new Sample();
    private PetEndPoint petEndpoint = new PetEndPoint();

    
    @When("Add a new pet to the store")
    public void i_add_a_Pet_to_the_system() {
        petEndpoint.addPet(test);
    }

    
    @Then("the pet request response has a {int} response code")
    public void the_pet_request_response_has_a_response_code(int code) {
        petEndpoint.verifyResponseStatusValue(test.getResponse(), code);
    }
    
    
    @When("Update an existing pet")
    public void iUpdateAPet() {
        petEndpoint.updatePet(test.getRequest());
    }    

    
     @Given("Finds Pets by Status")
    public void aPetExists() {
        petEndpoint.addPet(test);
        petEndpoint.getPetByStatus(test.getRequest());
    }
    
    
    @Given("Finds Pets by ID")
    public void aPetExists() {
        petEndpoint.addPet(test);
        petEndpoint.getPetById(test.getRequest());
    }

    
    @When("Deletes a pet")
    public void iDeleteAPet() {
        petEndpoint.deletePet(test.getRequest());
    }

    
    @And("getting same pet request response has a {int} response code")
    public void gettingSamePetRequestResponseHasAResponseCode(int arg0) {
        petEndpoint.getPetById(test.getRequest());
    }

    
    @Attachment()
    private byte[] createAttachment(String att) {
        String content = att;
        return content.getBytes();
    }
	

}
