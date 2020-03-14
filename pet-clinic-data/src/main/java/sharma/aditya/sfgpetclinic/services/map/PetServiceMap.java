package sharma.aditya.sfgpetclinic.services.map;

import sharma.aditya.sfgpetclinic.model.Pet;
import sharma.aditya.sfgpetclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstactMapService<Pet, Long> implements PetService {
    @Override public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override public void delete(Pet pet) {
        super.delete(pet);

    }

    @Override public void deleteById(Long id) {
        super.deleteById(id);
    }
}
