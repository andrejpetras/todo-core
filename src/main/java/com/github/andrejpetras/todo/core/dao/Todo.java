package com.github.andrejpetras.todo.core.dao;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo extends PanacheEntityBase {

    @Id
    public String id;

    public String text;
}
