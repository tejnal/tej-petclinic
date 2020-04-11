package com.tej.petclinic.services.map;

import com.tej.petclinic.model.Owner;
import com.tej.petclinic.services.CurdService;

import java.util.Set;

/**
 * @project tej-petclinic
 * @autor tejnal on 2020-04-11
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long>  implements CurdService<Owner, Long> {


    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        this.delete(object);
    }
}
