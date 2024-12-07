package app;

public class Address {
    private String city;
    private String street;
    private String postalCode;
    private String buildingNum;
    private String aptNum;

    public Address(String city, String street, String postalCode, String buildingNum, String aptNum) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
        this.buildingNum = buildingNum;
        this.aptNum = aptNum;
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

    public String getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(String buildingNum) {
        this.buildingNum = buildingNum;
    }

    public String getAptNum() {
        return aptNum;
    }

    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
            "City=" + city +
            ", Street=" + street +
            ", Postal Code=" + postalCode +
            ", BuildingNum=" + buildingNum +
            ", AptNum=" + aptNum + "}";
    }

}
