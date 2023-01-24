package com.MyHotel.rest.Daos;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractDao<T> {

    protected abstract JpaRepository<T, Integer> getRepository();

    public T create(T entity) {
        this.beforeSave(entity);
        entity = getRepository().save(entity);
        this.afterSave(entity);
        return entity;
    }

    public T update(T entity) {
        this.beforeUpdate(entity);
        entity = getRepository().save(entity);
        this.afterUpdate(entity);
        return entity;
    }

    public void delete(T entity) {
        this.beforeDelete(entity);
        getRepository().delete(entity);
        this.afterDelete(entity);
    }

    public void deleteAll() {
        this.getRepository().deleteAll();
    }

    protected void beforeSave(T entity) {

    }

    protected void afterSave(T entity) {

    }

    protected void beforeUpdate(T entity) {

    }

    protected void afterUpdate(T entity) {

    }

    protected void beforeDelete(T entity) {

    }

    protected void afterDelete(T entity) {

    }
}
