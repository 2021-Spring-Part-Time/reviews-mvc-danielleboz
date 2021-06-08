package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String location;
    private String imageUrl;
    private String continent;
    private String yearTraveled;
    private String reviewContent;

    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getContinent() {
        return continent;
    }

    public String getYearTraveled() {
        return yearTraveled;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public Review(long id, String location, String imageUrl, String continent, String yearTraveled, String reviewContent) {
        this.id = id;
        this.location = location;
        this.imageUrl = imageUrl;
        this.continent = continent;
        this.yearTraveled = yearTraveled;
        this.reviewContent = reviewContent;
    }

}
