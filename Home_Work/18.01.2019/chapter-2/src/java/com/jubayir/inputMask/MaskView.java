
package com.jubayir.inputMask;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MaskView {
     
    private String date;
    private String phone;
    private String phoneExt;
    private String taxId;
    private String ssn;
    private String productKey;
 
    public String getDate() {
        return date;
    }
 
    public void setDate(String date) {
        this.date = date;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
 
    public String getPhoneExt() {
        return phoneExt;
    }
 
    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }
 
    public String getTaxId() {
        return taxId;
    }
 
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }
 
    public String getSsn() {
        return ssn;
    }
 
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
 
    public String getProductKey() {
        return productKey;
    }
 
    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }
}
