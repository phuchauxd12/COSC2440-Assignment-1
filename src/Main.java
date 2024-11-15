import controllers.person.tenant.TenantController;
import repositories.person.tenant.FileBasedTenantRepository;
import repositories.person.tenant.TenantRepository;
import views.person.TenantView;

public class Main {
    public static void main(String[] args) {
        TenantRepository tenantRepository = new FileBasedTenantRepository();
        TenantView view = new TenantView();
        // Adding sample tenants
//        tenantRepository.add(new Tenant(IdGenerator.randomId(), "John Doe", new Date(631152000000L), "123-456-7890"));
//        tenantRepository.add(new Tenant(IdGenerator.randomId(), "Jane Smith", new Date(700047600000L), "987-654-3210"));

        // Display all tenants
        TenantController tenantController = new TenantController(tenantRepository,view);
        tenantController.add();
        tenantController.getAll();
        tenantController.delete();
        tenantController.getAll();
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