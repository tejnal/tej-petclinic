package com.tej.petclinic.model;

/**
 * @project tej-petclinic
 * @autor tejnal on 2020-04-11
 */
public class Person extends  BaseEntity {

    private String firstName;
    private String lastName;

    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
