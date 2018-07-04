package com.everis.alicante.courses.beca.garage.manager;

import com.everis.alicante.courses.beca.garage.dao.AbstractDAO;
import com.everis.alicante.courses.beca.garage.domain.GarageEntity;

import java.util.List;

public abstract class AbstractManager<T extends GarageEntity> {


    public abstract AbstractDAO<T> getDao();


    public List<T> findAll() {
        return getDao().findAll();
    }

    public void save(final T element) {
        getDao().save(element);
    }

    public void delete(final T element) {
        getDao().delete(element);
    }

    public T get(final int i) {
        return getDao().get(i);
    }
}
