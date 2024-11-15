package controllers.person.tenant;

import controllers.IController;
import models.person.roles.Tenant;
import utils.DateHandler;
import utils.IdGenerator;
import views.person.TenantView;
import repositories.person.tenant.TenantRepository;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TenantController implements IController {
    private Scanner scanner = new Scanner(System.in);
    private TenantRepository tenantRepository;
    private TenantView tenantView;

    public TenantController(TenantRepository tenantRepository, TenantView tenantView) {
        this.tenantRepository = tenantRepository;
        this.tenantView = tenantView;
    }

    public void getAll() {
        List<Tenant> tenants = tenantRepository.findAll();
        tenantView.displayAllTenants(tenants);
    }

    public void add() {
        System.out.print("Enter Full Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Contact Info: ");
        String contact = scanner.nextLine();
        System.out.print("Enter Date Of Birth: ");
        String date= scanner.nextLine();
        Date dateOfBirth = DateHandler.parseDate(date);
        if(dateOfBirth != null){
            Tenant tenant = new Tenant(IdGenerator.randomId(), name, dateOfBirth, contact);
            tenantRepository.add(tenant);
        }
        else {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void get() {
        System.out.print("Enter Tenant ID to delete: ");
        String id = scanner.nextLine();
        Tenant tenant = tenantRepository.findById(id);
        if(tenant != null){
            tenantView.displayTenantDetails(tenant);
        }
        else {
            System.out.println("Tenant not found!");
        }
    }

    public void delete() {
        System.out.print("Enter Tenant ID to delete: ");
        String id = scanner.nextLine();
        tenantRepository.deleteById(id);
        System.out.println("Tenant deleted successfully.");
    }
}
