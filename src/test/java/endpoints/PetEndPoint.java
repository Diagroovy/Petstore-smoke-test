package endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.Pet;
import stepdefs.Sample;

public class PetEndPoint extends BaseEndPoints{
	
    private final String PET_ENDPOINT_PATH = "pet/";
    private Pet defaultPet;

    public PetEndPoint() {
        defaultPet = new Pet();
    }

    public String getPath() {
        return this.PET_ENDPOINT_PATH;
    }

    public Pet getDefaultPet() {
        this.defaultPet = new Pet();
        return this.defaultPet;
    }

    public Response addPetWithBody(RequestSpecification request, String body) {
        String url = getBaseUrl() + this.getPath();
        request.body(body);
        return sendRequest(request, BaseEndPoints.POST_REQUEST, url, null);
    }

    public void addPet(Sample test) {
        test.setRequest(getRequestWithJSONHeaders());
        test.setResponse(addPet(test.getRequest()));
    }
    public void addPet(Sample test, Pet pet) {
        test.setPet(pet);
        test.setRequest(getRequestWithJSONHeaders());
        test.setResponse(addPet(test.getRequest(), pet));
    }
    
    
    public Response addPet(RequestSpecification request) {
        return addPet(request, getDefaultPet());
    }
    public Response addPet(RequestSpecification request, Pet pet) {
        String url = getBaseUrl() + this.getPath();
        return sendRequest(request, BaseEndPoints.POST_REQUEST, url, pet);
    }
    
    
    public Response updatePet(RequestSpecification request) {
    	return updatePet(request, getDefaultPet());
    }
    private Response updatePet(RequestSpecification request, Pet pet) {
        String url = getBaseUrl() + this.getPath() + pet.getId();
        return sendRequest(request, BaseEndPoints.PUT_REQUEST, url, pet);
	}    

    
    public Response deletePet(RequestSpecification request) {
        return deletePet(request, getDefaultPet());
    }
    public Response deletePet(RequestSpecification request, Pet pet) {
        String url = getBaseUrl() + this.getPath() + pet.getId();
        return sendRequest(request, BaseEndPoints.DELETE_REQUEST, url, pet);
    }

    public Response getPetByStatus(RequestSpecification request) {
        return getPetByStatus(request, getDefaultPet());
    }
    public Response getPetByStatus(RequestSpecification request, Pet pet) {
        String url = getBaseUrl() + getPath() + pet.getStatus();
        return sendRequest(request, BaseEndPoints.GET_REQUEST, url, pet);
    }
    
    public Response getPetById(RequestSpecification request) {
        return getPetById(request, getDefaultPet());
    }
    public Response getPetById(RequestSpecification request, Pet pet) {
        String url = getBaseUrl() + getPath() + pet.getId();
        return sendRequest(request, BaseEndPoints.GET_REQUEST, url, pet);
    }	

}
