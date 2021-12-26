package com.tej.petclinic.services;

import com.tej.petclinic.data.model.Owner;

import java.util.List;

/**
 * @project tej-petclinic
 * @autor tejnal on 2020-04-11
 */
public interface OwnerService extends CurdService<Owner, Long> {


    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

}
