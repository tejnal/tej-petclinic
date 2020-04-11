package com.tej.petclinic.services;

import com.tej.petclinic.model.Owner;

/**
 * @project tej-petclinic
 * @autor tejnal on 2020-04-11
 */
public interface OwnerService extends CurdService<Owner, Long> {

    Owner findByLastName();

}
