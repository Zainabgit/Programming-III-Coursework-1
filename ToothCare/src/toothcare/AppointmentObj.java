/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toothcare;

import com.github.lgooddatepicker.components.TimePicker;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class AppointmentObj {
    private static int lastAppoitmentId = 0;
    private String appointmentId;
    private String patientName;
    private Date appDate;
    private LocalTime appTime;
    private boolean cleaning;
    private boolean  whitening;
    private boolean filling;
    private boolean  nerveFilling;
    private boolean rootCanelTherapy;
    private boolean registration;
    private boolean paid;

    public AppointmentObj(String appointmentId, String patientName, Date appDate, LocalTime appTime, boolean cleaning, boolean whitening, boolean filling, boolean nerveFilling, boolean rootCanelTherapy, boolean registration, boolean paid) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.appDate = appDate;
        this.appTime = appTime;
        this.cleaning = cleaning;
        this.whitening = whitening;
        this.filling = filling;
        this.nerveFilling = nerveFilling;
        this.rootCanelTherapy = rootCanelTherapy;
        this.registration = registration;
        this.paid = paid;
    }

    public AppointmentObj(String patientName, Date appDate, LocalTime appTime, boolean cleaning, boolean whitening, boolean filling, boolean nerveFilling, boolean rootCanelTherapy, boolean registration, boolean paid) {
        this.appointmentId = String.format("APP%06d", ++lastAppoitmentId);
        this.patientName = patientName;
        this.appDate = appDate;
        this.appTime = appTime;
        this.cleaning = cleaning;
        this.whitening = whitening;
        this.filling = filling;
        this.nerveFilling = nerveFilling;
        this.rootCanelTherapy = rootCanelTherapy;
        this.registration = registration;
        this.paid = paid;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Date getAppDate() {
        return appDate;
    }

    public void setAppDate(Date appDate) {
        this.appDate = appDate;
    }

    public LocalTime getAppTime() {
        return appTime;
    }

    public void setAppTime(LocalTime appTime) {
        this.appTime = appTime;
    }

    public boolean isCleaning() {
        return cleaning;
    }

    public void setCleaning(boolean cleaning) {
        this.cleaning = cleaning;
    }

    public boolean isWhitening() {
        return whitening;
    }

    public void setWhitening(boolean whitening) {
        this.whitening = whitening;
    }

    public boolean isFilling() {
        return filling;
    }

    public void setFilling(boolean filling) {
        this.filling = filling;
    }

    public boolean isNerveFilling() {
        return nerveFilling;
    }

    public void setNerveFilling(boolean nerveFilling) {
        this.nerveFilling = nerveFilling;
    }

    public boolean isRootCanelTherapy() {
        return rootCanelTherapy;
    }

    public void setRootCanelTherapy(boolean rootCanelTherapy) {
        this.rootCanelTherapy = rootCanelTherapy;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
    
    
}
