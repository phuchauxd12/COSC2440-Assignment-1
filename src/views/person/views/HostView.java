package views.person.views;

import models.person.roles.Host;

import java.util.List;

public class HostView {
    public void displayHostDetails(Host host) {
        System.out.println("Host ID: " + host.getId());
        System.out.println("Full Name: " + host.getFullName());
        System.out.println("Contact Information: " + host.getContactInfo());
        // Add more details as necessary
    }

    public void displayAllHosts(List<Host> hosts) {
        for (Host tenant : hosts) {
            displayHostDetails(tenant);
            System.out.println("---------------");
        }
    }
}
