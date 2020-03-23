package pojo;

public class Pet {
	
    private Integer id;
    private Category category;
    private String name;
    private String[] photoUrls;
    private Tag[] tags;
    private String status;

    public Pet() {
        setId(0);
        setCategory(new Category(0, "Dogs"));
        setName("doggie");
        setPhotoUrls(new String[]{"https://imageUrl"});
        setTags(new Tag[]{new Tag(0, "string")});
        setStatus("available");
    }

    public Pet(Integer id, Category category, String name, String[] photoUrls, Tag[] tags, String status) {
        setId(id);
        setCategory(category);
        setName(name);
        setPhotoUrls(photoUrls);
        setTags(tags);
        setStatus(status);
    }

    
// Get&Set The Id--    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
// Get&Set The Category--
    public Category getCategory() {
        return category;
    } 
    
    public void setCategory(Category category) {
        this.category = category;
    }


// Get&Set The name--    
    public String getName() {
        return name;
    } 
    
    public void setName(String name) {
        this.name = name;
    }
 
    
// Get&Set The PhotoUrls--
    public String[] getPhotoUrls() {
        return photoUrls;
    }
     
    public void setPhotoUrls(String[] photoUrls) {
        this.photoUrls = photoUrls;
    }
 
    
// Get&Set Tags--
    public Tag[] getTags() {
        return tags;
    }
     
    public void setTags(Tag[] tags) {
        this.tags = tags;
    }
 
    
// Get&Set The Status--
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
	
}
