package repositories.person.tenant;

import models.person.roles.Tenant;

import java.util.List;

public interface TenantRepository {
    List<Tenant> findAll();
    Tenant findById(String id);
    void save(Tenant tenant);
    void deleteById(String id);
}
