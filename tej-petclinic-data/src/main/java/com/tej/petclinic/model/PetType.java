package com.tej.petclinic.model;

/**
 * @project tej-petclinic
 * @autor tejnal on 2020-04-11
 */
public class PetType extends  BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
