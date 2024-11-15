package models.rentalAgreement;

import models.person.roles.Tenant;
import models.storage.StorageItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentalAgreement implements StorageItem {
 private String id;
 private String mainTenantId;
 private List<String> subTenantIdList;
 private String propertyId;
 private String ownerId;
 private List<String> hostIdList;
private  Period period;
private Date contractDate;
private double rentingFree;
private  AgreementStatus status;

    public RentalAgreement() {
        this.id = "Default";
        this.mainTenantId = "Default";
        this.subTenantIdList = new ArrayList<>();
        this.propertyId = "Default";
        this.ownerId = "Default";
        this.hostIdList = new ArrayList<>();
        this.period = null;
        this.contractDate = new Date();
        this.rentingFree = 0;
        this.status = null;
    }

    public RentalAgreement(String id,String mainTenantId, List<String> subTenantIdList, String propertyId, String ownerId, List<String> hostIdList, Period period, Date contractDate, double rentingFree, AgreementStatus status) {
        this.id = id;
        this.mainTenantId = mainTenantId;
        this.subTenantIdList = subTenantIdList;
        this.propertyId = propertyId;
        this.ownerId = ownerId;
        this.hostIdList = hostIdList;
        this.period = period;
        this.contractDate = contractDate;
        this.rentingFree = rentingFree;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getMainTenantId() {
        return mainTenantId;
    }

    public void setMainTenantId(String mainTenantId) {
        this.mainTenantId = mainTenantId;
    }

    public List<String> getSubTenantIdList() {
        return subTenantIdList;
    }

    public void setSubTenantIdList(List<String> subTenantIdList) {
        this.subTenantIdList = subTenantIdList;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public double getRentingFree() {
        return rentingFree;
    }

    public void setRentingFree(double rentingFree) {
        this.rentingFree = rentingFree;
    }

    public AgreementStatus getStatus() {
        return status;
    }

    public void setStatus(AgreementStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RentalAgreement{" +
                "id='" + id + '\'' +
                ", mainTenantId='" + mainTenantId + '\'' +
                ", subTenantIdList=" + subTenantIdList +
                ", propertyId='" + propertyId + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", hostIdList=" + hostIdList +
                ", period=" + period +
                ", contractDate=" + contractDate +
                ", rentingFree=" + rentingFree +
                ", status=" + status +
                '}';
    }
}
