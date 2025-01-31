package stepdefs;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.Pet;

public class Sample {
	
    private Response response;
    private RequestSpecification request;
    private Pet pet;

    public void setResponse(Response response) {
        this.response = response;
    }

    
    public Response getResponse() {
        return this.response;
    }

    
    public void setRequest(RequestSpecification request) {
        this.request = request;
    }

    
    public RequestSpecification getRequest() {
        return this.request;
    }

    
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    
    public Pet getPet() {
        return this.pet;
    }	

}
