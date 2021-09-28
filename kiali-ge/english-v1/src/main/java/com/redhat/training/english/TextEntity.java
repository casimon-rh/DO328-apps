package com.redhat.training.english;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class TextEntity extends PanacheEntity{
    public String t;
    @Id
    public Long id;
    
    public String getT(){
        return this.t;
    }
}
