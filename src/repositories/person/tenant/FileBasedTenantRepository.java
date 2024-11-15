package repositories.person.tenant;

import models.person.roles.Tenant;
import utils.FileManager;

import java.util.ArrayList;
import java.util.List;

public class FileBasedTenantRepository implements TenantRepository {
    private static final String FILE_PATH = "./src/data/tenants.txt";
    @Override
    public List<Tenant> findAll() {
        List<Tenant> tenants = new ArrayList<>();
        List<String> lines = FileManager.readLines(FILE_PATH);
        for (String line : lines) {
            tenants.add(Tenant.fromString(line));
        }
        return tenants;
    }

    @Override
    public Tenant findById(String id) {
        return findAll().stream().filter(tenant -> tenant.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void add(Tenant storageItem) {
        List<Tenant> tenants = findAll();
        tenants.removeIf(t -> t.getId().equals(storageItem.getId())); // Remove existing tenant with same ID
        tenants.add(storageItem);
        List<String> lines = new ArrayList<>();
        for (Tenant t : tenants) {
            lines.add(t.toString());
        }
        FileManager.writeLines(FILE_PATH, lines);
    }

    @Override
    public void deleteById(String id) {
        List<Tenant> tenants = findAll();
        tenants.removeIf(tenant -> tenant.getId().equals(id));
        List<String> lines = new ArrayList<>();
        for (Tenant tenant : tenants) {
            lines.add(tenant.toString());
        }
        FileManager.writeLines(FILE_PATH, lines);
    }
}