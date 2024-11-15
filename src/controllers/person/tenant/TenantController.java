package controllers.person.tenant;

import models.person.roles.Tenant;
import views.person.views.TenantView;
import repositories.person.tenant.TenantRepository;

import java.util.List;

public class TenantController {
    private TenantRepository tenantRepository;
    private TenantView tenantView;

    public TenantController(TenantRepository tenantRepository, TenantView tenantView) {
        this.tenantRepository = tenantRepository;
        this.tenantView = tenantView;
    }

    public void loadAndDisplayAllTenants() {
        List<Tenant> tenants = tenantRepository.findAll();
        tenantView.displayAllTenants(tenants);
    }

    public void addTenant(Tenant tenant) {
        tenantRepository.add(tenant);
    }

    public void deleteTenant(String tenantId) {
        tenantRepository.deleteById(tenantId);
    }
}
