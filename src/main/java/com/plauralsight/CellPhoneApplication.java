package com.plauralsight;

import java.util.Scanner;


public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        Scanner scanner = new Scanner(System.in);

        System.out.println("whats your serial Number?: ");
        double serialNumber = scanner.nextDouble();
        scanner.nextLine();
        cellPhone.setSerialNumber(serialNumber);

        System.out.println("whats the model of your phone?:");
        String model = scanner.nextLine();
        cellPhone.setModel(model);

        System.out.println("who's the carrier of your phone?:");
        String carrier = scanner.nextLine();
        cellPhone.setCarrier(carrier);

        System.out.println("whats the phone number?:");
        String phoneNumber = scanner.nextLine();
        cellPhone.setPhoneNumber(phoneNumber);

        System.out.println("who's the owner of the phone?:");
        String owner = scanner.nextLine();
        cellPhone.setOwner(owner);

        scanner.close();

        System.out.println("\nphone details");
        System.out.println("the serial number is: "+ cellPhone.getSerialNumber());
        System.out.println("the model is: "+ cellPhone.getModel());
        System.out.println("the carrier is: "+ cellPhone.getCarrier());
        System.out.println("the phone Number is: "+ cellPhone.getPhoneNumber());
        System.out.println("the owner is: "+ cellPhone.getOwner());


    }
}
