package sharma.aditya.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import sharma.aditya.sfgpetclinic.model.Vet;
import sharma.aditya.sfgpetclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstactMapService<Vet, Long> implements VetService    {
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

