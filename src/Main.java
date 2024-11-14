import models.person.roles.Tenant;
import repositories.person.tenant.FileBasedTenantRepository;
import repositories.person.tenant.TenantRepository;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TenantRepository tenantRepository = new FileBasedTenantRepository();

        // Adding sample tenants
        tenantRepository.save(new Tenant("1", "John Doe", new Date(631152000000L), "123-456-7890"));
        tenantRepository.save(new Tenant("2", "Jane Smith", new Date(700047600000L), "987-654-3210"));

        // Display all tenants
        System.out.println("All Tenants:");
        tenantRepository.findAll().forEach(System.out::println);

        // Find a tenant by ID
//        Tenant tenant = tenantRepository.findById("1");
//        System.out.println("\nFound Tenant with ID 1:");
//        System.out.println(tenant);
//
//        // Delete a tenant
//        tenantRepository.deleteById("1");
//        System.out.println("\nAll Tenants after deleting ID 1:");
//        tenantRepository.findAll().forEach(System.out::println);
    }

}