/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarProfile;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author agarw
 */
public class CarProfile implements Serializable{
    String brandNam;
    String carModel;
    String colorOfCar;
    int purchaseYear;
    int seatsNumber;
    String engineNumber;
    String licensePlate;
    String ownerName;
    String ownerEmailAddress;
    String ownerTelephoneNumber;
    String drivingLicense;
    String ownersSsn;
    String address;
    int warrantyYear;
    String photoOfOwner;
    String typeOfService;
    String dateOfService;
    double chargedPrice; 
    private ArrayList<CarProfile> serviceRecords;

    public ArrayList<CarProfile> getServiceRecords() {
        return serviceRecords;
    }

    public void setServiceRecords(ArrayList<CarProfile> serviceRecords) {
        this.serviceRecords = serviceRecords;
    }

    public CarProfile(String typrOfService, String dateOfService, double chargedPrice) {
        this.typeOfService = typrOfService;
        this.dateOfService = dateOfService;
        this.chargedPrice = chargedPrice;
    }
    
    

    public CarProfile(String brandNam, String carModel, String colorOfCar, int purchaseYear, int seatsNumber, String engineNumber, String licensePlate, String ownerName, String ownerEmailAddress, String ownerTelephoneNumber, String drivingLicense, String ownersSsn, String address, int warrantyYear, String photo) {
        this.brandNam = brandNam;
        this.carModel = carModel;
        this.colorOfCar = colorOfCar;
        this.purchaseYear = purchaseYear;
        this.seatsNumber = seatsNumber;
        this.engineNumber = engineNumber;
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.ownerEmailAddress = ownerEmailAddress;
        this.ownerTelephoneNumber = ownerTelephoneNumber;
        this.drivingLicense = drivingLicense;
        this.ownersSsn = ownersSsn;
        this.address = address;
        this.warrantyYear = warrantyYear;
        this.photoOfOwner = photo;
    }

    CarProfile() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getBrandNam() {
        return brandNam;
    }

    public void setBrandNam(String brandNam) {
        this.brandNam = brandNam;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getColorOfCar() {
        return colorOfCar;
    }

    public void setColorOfCar(String colorOfCar) {
        this.colorOfCar = colorOfCar;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    public void setPurchaseYear(int purchaseYear) {
        this.purchaseYear = purchaseYear;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerEmailAddress() {
        return ownerEmailAddress;
    }

    public void setOwnerEmailAddress(String ownerEmailAddress) {
        this.ownerEmailAddress = ownerEmailAddress;
    }

    public String getOwnerTelephoneNumber() {
        return ownerTelephoneNumber;
    }

    public void setOwnerTelephoneNumber(String ownerTelephoneNumber) {
        this.ownerTelephoneNumber = ownerTelephoneNumber;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public String getOwnersSsn() {
        return ownersSsn;
    }

    public void setOwnersSsn(String ownersSsn) {
        this.ownersSsn = ownersSsn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(int warrantyYear) {
        this.warrantyYear = warrantyYear;
    }

    public String getPhoto() {
        return photoOfOwner;
    }

    public void setPhoto(String photo) {
        this.photoOfOwner = photo;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTyprOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public String getDateOfService() {
        return dateOfService;
    }

    public void setDateOfService(String dateOfService) {
        this.dateOfService = dateOfService;
    }

    public double getChargedPrice() {
        return chargedPrice;
    }

    public void setChargedPrice(double chargedPrice) {
        this.chargedPrice = chargedPrice;
    }
    
    
    
    
    
    
    public static void main(String[] args){
        
        
        
    }

    
    
}
