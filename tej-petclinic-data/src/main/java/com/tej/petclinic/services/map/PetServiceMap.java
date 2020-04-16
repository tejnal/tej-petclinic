package com.tej.petclinic.services.map;

import com.tej.petclinic.model.Pet;
import com.tej.petclinic.services.CurdService;
import com.tej.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @project tej-petclinic
 * @autor tejnal on 2020-04-11
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long>  implements PetService {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
