package views.person;

import models.person.roles.Tenant;
import utils.DateHandler;

import java.util.List;

public class TenantView {
    public void displayTenantDetails(Tenant tenant) {
        System.out.println("Tenant ID: " + tenant.getId());
        System.out.println("Full Name: " + tenant.getFullName());
        System.out.println("Contact Information: " + tenant.getContactInfo());
        System.out.println("Date of birth: " + DateHandler.formatDate(tenant.getDateOfBirth()));
        // Add more details as necessary
    }

    public void displayAllTenants(List<Tenant> tenants) {
        for (Tenant tenant : tenants) {
            displayTenantDetails(tenant);
            System.out.println("---------------");
        }
    }
}
