package com.example.ada.gonomadapplication;

public class Model {

    private String destinationName;
    private String description;
    private String popularity;
    private String imageUrl;

    public Model(){

    }

    public Model(String destinationName, String description, String popularity, String imageUrl){
        this.destinationName=destinationName;
        this.description=description;
        this.popularity=popularity;
        this.imageUrl=imageUrl;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getText() {
        return destinationName;
    }


}
