package model;
public class GeoLiteCity {
    int locationID;
    int metroCode;
    int areaCode;
    String country;
    String  region;
    String  city;
    String  postalCode;
    float longitude;
    float latitude;
    
    public GeoLiteCity(){}
    public GeoLiteCity(int locationID,String country,String  region,String  city,String  postalCode,float latitude,float longitude,int metroCode,int areaCode){
    	this.locationID= locationID;
    	this.metroCode= metroCode;
    	this.areaCode= areaCode;
    	this.country= country;
    	this.region= region;
    	this.city= city;
    	this.postalCode= postalCode;
    	this.longitude= longitude;
    	this.latitude= latitude;
    }
    
    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public int getMetroCode() {
        return metroCode;
    }

    public void setMetroCode(int metroCode) {
        this.metroCode = metroCode;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
}
