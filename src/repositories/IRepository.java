package repositories;

import models.storage.StorageItem;

import java.util.List;

public interface IRepository<T extends StorageItem> {
    List<T> findAll();
    T findById(String id);
    void add(T storageItem);
    void deleteById(String id);
}
