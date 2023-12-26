/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toothcare;

import java.util.Date;

/**
 *
 * @author Acer
 */
public class patientOb {
    private static int lastPatientId = 0;
    private int patientId;
    private String name;
    private Date dob;
    private Date addedDate;
    private String email;
    private String contactNumber;
    private String Gender;
    private String address;
    private String allergies;

    public patientOb(String name, Date dob, Date addedDate, String email, String contactNumber, String Gender, String address, String allergies) {
        this.patientId = ++lastPatientId;;
        this.name = name;
        this.dob = dob;
        this.addedDate = addedDate;
        this.email = email;
        this.contactNumber = contactNumber;
        this.Gender = Gender;
        this.address = address;
        this.allergies = allergies;
    }

    public patientOb(int patientId, String name, Date dob, Date addedDate, String email, String contactNumber, String Gender, String address, String allergies) {
        this.patientId = patientId;
        this.name = name;
        this.dob = dob;
        this.addedDate = addedDate;
        this.email = email;
        this.contactNumber = contactNumber;
        this.Gender = Gender;
        this.address = address;
        this.allergies = allergies;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getGender() {
        return Gender;
    }

    public String getAddress() {
        return address;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
    
    
    
}
