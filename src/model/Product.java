/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author deshna
 */
public class Product {
    
    private String name;
    private String SSN;
    private String websiteUrl;
    private String emailId;
    private String bloodGrp;
    private String contactNum;
    private String occupation;
    private String  age;
    private String gender;
    private String diseaseName;
    
//    Address
    private String gpsLocation;
    private String city;
    private String state;
    private String country;
    private String pinCode;
    
//    Driver 
    private String license;
    
    
//    Vehical
    private String model;
    private String color;
    private String brand;
    private String serialNum;
    
//    patient
    private String patientId;
    private String dateOfLastVisit;
    private String NextAppointment;
    private String allergies;
    private String onMedicine;
    private String primarydoc;
    
//    insurance
    
    private String insuranceId;
    private String premium;
    private String deductable;
    private String textStatement;
       
//    Doctor
    
    private String docName;
    private String branch;
    private String docId;
    private String speciality;
    private String docAddress;
    private String availaibility;
    private String officeContact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getGpsLocation() {
        return gpsLocation;
    }

    public void setGpsLocation(String gpsLocation) {
        this.gpsLocation = gpsLocation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getPinCode() {
        return pinCode;
    }
     
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
     
    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPrimarydoc() {
        return primarydoc;
    }

    public void setPrimarydoc(String primarydoc) {
        this.primarydoc = primarydoc;
    }

    public String getDateOfLastVisit() {
        return dateOfLastVisit;
    }

    public void setDateOfLastVisit(String dateOfLastVisit) {
        this.dateOfLastVisit = dateOfLastVisit;
    }

    public String getNextAppointment() {
        return NextAppointment;
    }

    public void setNextAppointment(String NextAppointment) {
        this.NextAppointment = NextAppointment;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getOnMedicine() {
        return onMedicine;
    }

    public void setOnMedicine(String onMedicine) {
        this.onMedicine = onMedicine;
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getDeductable() {
        return deductable;
    }

    public void setDeductable(String deductable) {
        this.deductable = deductable;
    }

    public String getTextStatement() {
        return textStatement;
    }

    public void setTextStatement(String textStatement) {
        this.textStatement = textStatement;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getSpecility() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDocAddress() {
        return docAddress;
    }

    public void setDocAddress(String docAddress) {
        this.docAddress = docAddress;
    }

    public String getAvailaibility() {
        return availaibility;
    }

    public void setAvailaibility(String availaibility) {
        this.availaibility = availaibility;
    }

    public String getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(String officeContact) {
        this.officeContact = officeContact;
    }

    public void setPatientd(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
            
        
        
    
    
    
    
    
    
}
