package models.person.roles;

import models.person.Person;

import java.util.Date;

public class Host extends Person {
    public Host() {
        super();
    }

    public Host(String id, String fullName, Date dateOfBirth, String contactInfo) {
        super(id, fullName, dateOfBirth, contactInfo);
    }

    @Override
    public String toString() {
        return id + "," + fullName + "," + dateOfBirth.getTime() + "," + contactInfo;
    }

    public static Host fromString(String data) {
        String[] parts = data.split(",");
        String id = parts[0];
        String fullName = parts[1];
        Date dateOfBirth = new Date(Long.parseLong(parts[2]));
        String contactInfo = parts[3];
        return new Host(id, fullName, dateOfBirth, contactInfo);
    }
}
