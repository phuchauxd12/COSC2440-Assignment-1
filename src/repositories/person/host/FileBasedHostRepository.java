package repositories.person.host;

import models.person.roles.Host;
import models.person.roles.Tenant;
import utils.FileManager;

import java.util.ArrayList;
import java.util.List;

public class FileBasedHostRepository implements  HostRepository{
    private static final String FILE_PATH = "./src/data/hosts.txt";
    @Override
    public List<Host> findAll() {
        List<Host> hosts = new ArrayList<>();
        List<String> lines = FileManager.readLines(FILE_PATH);
        for (String line : lines) {
            hosts.add(Host.fromString(line));
        }
        return hosts;
    }

    @Override
    public Host findById(String id) {
        return findAll().stream().filter(host -> host.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void add(Host storageItem) {
        List<Host> hosts = findAll();
        hosts.removeIf(t -> t.getId().equals(storageItem.getId())); // Remove existing tenant with same ID
        hosts.add(storageItem);
        List<String> lines = new ArrayList<>();
        for (Host t : hosts) {
            lines.add(t.toString());
        }
        FileManager.writeLines(FILE_PATH, lines);
    }

    @Override
    public void deleteById(String id) {
        List<Host> hosts = findAll();
        hosts.removeIf(host -> host.getId().equals(id));
        List<String> lines = new ArrayList<>();
        for (Host host : hosts) {
            lines.add(host.toString());
        }
        FileManager.writeLines(FILE_PATH, lines);
    }
}
