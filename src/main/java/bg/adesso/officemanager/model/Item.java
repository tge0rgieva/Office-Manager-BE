package bg.adesso.officemanager.model;


import javax.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String category;
    private String description;
    private String pictureUrl;
    private Boolean isRequested;

    public Item() {

    }

    public Item(String id, String name, String category, String description, String pictureUrl, Boolean isRequested) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.pictureUrl = pictureUrl;
        this.isRequested = isRequested;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Boolean getIsRequested() {
        return isRequested;
    }

    public void setIsRequested(Boolean requested) {
        isRequested = requested;
    }
}
