package lib.request;


public class FindRequest {

    private String latitude;
    private String longitude;
    private String radius;
    private String city;
    private String district;
    private String searchText;


    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null && !city.isEmpty()) {
            this.city = city;

        } else {
            this.city = "null";
        }

    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {

        if (district != null && !district.isEmpty()) {
            this.district = district;

        } else {
            this.district = "null";
        }
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        if (searchText != null && !searchText.isEmpty()) {
            this.searchText = searchText;

        } else {
            this.searchText = "null";
        }
    }
}
