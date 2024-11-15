package models.property;

import models.person.roles.Host;
import models.person.roles.Owner;
import models.storage.StorageItem;

import java.util.ArrayList;
import java.util.List;

public class Property implements StorageItem {
 protected String id;
 protected String address;
 protected double pricing;
 protected Status status;
 protected Owner owner;
 protected List<Host> hostList;

    public Property() {
        this.id = "Default";
        this.address = "Default";
        this.pricing = 0;
        this.status = null;
        this.owner = null;
        this.hostList = new ArrayList<>();
    }

    public Property(String id, String address, double pricing, Status status, Owner owner, List<Host> hostList) {
        this.id = id;
        this.address = address;
        this.pricing = pricing;
        this.status = status;
        this.owner = owner;
        this.hostList = hostList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPricing() {
        return pricing;
    }

    public void setPricing(double pricing) {
        this.pricing = pricing;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Host> getHostList() {
        return hostList;
    }

    public void setHostList(List<Host> hostList) {
        this.hostList = hostList;
    }
}
