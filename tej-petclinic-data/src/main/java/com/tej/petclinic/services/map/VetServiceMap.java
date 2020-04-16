package com.tej.petclinic.services.map;

import com.tej.petclinic.model.Vet;
import com.tej.petclinic.services.CurdService;
import com.tej.petclinic.services.VetService;

import java.util.Set;

/**
 * @project tej-petclinic
 * @autor tejnal on 2020-04-11
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {


    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
            super.delete(object);
    }
}
