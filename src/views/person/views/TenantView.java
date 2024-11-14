package views.person.views;

import models.person.roles.Tenant;

import java.util.List;

public class TenantView {
    public void displayTenantDetails(Tenant tenant) {
        System.out.println("Tenant ID: " + tenant.getId());
        System.out.println("Full Name: " + tenant.getFullName());
        System.out.println("Contact Information: " + tenant.getContactInfo());
        // Add more details as necessary
    }

    public void displayAllTenants(List<Tenant> tenants) {
        for (Tenant tenant : tenants) {
            displayTenantDetails(tenant);
            System.out.println("---------------");
        }
    }
}
