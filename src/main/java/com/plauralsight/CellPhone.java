package com.plauralsight;

public class CellPhone {
    //Attribute
    private double serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    //constructors

    public CellPhone() {
            serialNumber = 0;
            model = "";
            carrier = "";
            phoneNumber = "";
            owner = "";
        }

    //Getters


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getSerialNumber(){
        return this.serialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCarrier() {
        return carrier;
    }
    //Setters


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setSerialNumber(double serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setModel(String model){
        this.model =model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
}




