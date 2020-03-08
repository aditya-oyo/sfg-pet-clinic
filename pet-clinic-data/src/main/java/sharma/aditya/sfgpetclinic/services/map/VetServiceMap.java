package sharma.aditya.sfgpetclinic.services.map;

import sharma.aditya.sfgpetclinic.model.Vet;
import sharma.aditya.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstactMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override public Vet save(Vet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override public void delete(Vet pet) {
        super.delete(pet);

    }

    @Override public void deleteById(Long id) {
        super.deleteById(id);
    }
}
