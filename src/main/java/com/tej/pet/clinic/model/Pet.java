package com.tej.pet.clinic.model;

import java.time.LocalDate;

/**
 * @project tej-petclinic
 * @autor tejnal on 2020-04-11
 */
public class Pet {

    private PetType petType;
    private Pet pet;
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
