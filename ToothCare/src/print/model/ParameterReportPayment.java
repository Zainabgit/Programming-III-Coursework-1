/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package print.model;

import java.util.Date;
import java.util.List;

public class ParameterReportPayment {
     Date date;
     String customer;
     double total;
     List <FieldReportPayment> fields;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<FieldReportPayment> getFields() {
        return fields;
    }

    public void setFields(List<FieldReportPayment> fields) {
        this.fields = fields;
    }

    public ParameterReportPayment(Date date, String customer, double total, List<FieldReportPayment> fields) {
        this.date = date;
        this.customer = customer;
        this.total = total;
        this.fields = fields;
    }
     
     
}
