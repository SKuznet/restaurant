package io.khasang.restaurant.dao;

import io.khasang.restaurant.entity.Document;
import org.hibernate.Session;

import java.util.List;

public interface BasicDao<T> {

    /**
     * @return current session for Hibernate
     */
    Session getCurrentSession();

    /**
     * Create entity at database
     *
     * @param entity - current entity
     * @return entity
     */
    T create(T entity);

    /**
     * @return all entity list
     */
    List<T> getList();

    /**
     * Get entity by id
     *
     * @param id - specify id
     * @return entity
     */
    T getById(long id);

    /**
     * Delete specify entity from database
     *
     * @param entity - entity for delete
     * @return deleted entity
     */
    T delete(T entity);

    /**
     * Update specify entity at database
     *
     * @param entity - entity for update
     * @return updateded entity
     */
    T update(T entity);

}
