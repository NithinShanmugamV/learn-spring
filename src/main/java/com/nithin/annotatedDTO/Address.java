package com.nithin.annotatedDTO;

public class Address {
    protected String firstline;
    protected String city;

    public Address(String firstline, String city) {
        this.firstline = firstline;
        this.city = city;
    }

    public String getFirstline() {
        return this.firstline;
    }

    public void setFirstline(String firstline) {
        this.firstline = firstline;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "{" +
            " firstline='" + getFirstline() + "'" +
            ", city='" + getCity() + "'" +
            "}";
    }

    

}
