/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jFramesCode;

import java.util.ArrayList;

/**
 *
 * @author agarw
 */
public class carProfile {
    String carName;
    String modelNumber;
    String manufacturedYear;
    int seatsNumber;
    String serialNum;
    String mainCertificateValidity;
    String city;
    String createDate;
    String modifiedDate;
    boolean availability;
    String manufacturedBy;
    private ArrayList<carProfile> totrecords;

    public carProfile(String carName, String modelNumber, String manufacturedYear, int seatsNumber, String serialNum, String mainCertificateValidity, String city, String createDate,  boolean availability, String manufacturedby) {
        this.carName = carName;
        this.modelNumber = modelNumber;
        this.manufacturedYear = manufacturedYear;
        this.seatsNumber = seatsNumber;
        this.serialNum = serialNum;
        this.mainCertificateValidity = mainCertificateValidity;
        this.city = city;
        this.createDate = createDate;
        this.availability = availability;
        this.manufacturedBy = manufacturedby;
    }

    public carProfile() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getManufacturedBy() {
        return manufacturedBy;
    }

    public void setManufacturedBy(String manufacturedBy) {
        this.manufacturedBy = manufacturedBy;
    }

    public String getBrandNam() {
        return carName;
    }

    public void setBrandNam(String carName) {
        this.carName = carName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(String manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getMainCertificateAvailable() {
        return mainCertificateValidity;
    }

    public void setMainCertificateAvailable(String mainCertificateAvailable) {
        this.mainCertificateValidity = mainCertificateAvailable;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public ArrayList<carProfile> getTotrecords() {
        return totrecords;
    }

    public void setTotrecords(ArrayList<carProfile> totrecords) {
        this.totrecords = totrecords;
    }
    
    
}
