package com.plauralsight;

public class CellPhone {
    //Attribute
    private double serialNumber;
    private String model;
    private String carrier;

    //constructors
    public CellPhone(double serialNumber,String model, String carrier){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier=carrier;

    }
    //Getters
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

    public void setSerialNumber(double serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setModel(String model){
        this.serialNumber=serialNumber;
    }
    public void getCarrier(String carrier){
        this.carrier = carrier;
    }
}




