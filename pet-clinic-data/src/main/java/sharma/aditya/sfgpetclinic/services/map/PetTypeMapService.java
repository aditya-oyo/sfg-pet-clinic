package sharma.aditya.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import sharma.aditya.sfgpetclinic.model.PetType;
import sharma.aditya.sfgpetclinic.services.PetTypeService;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstactMapService<PetType, Long> implements PetTypeService {
    @Override public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override public PetType save(PetType t) {
        return super.save(t);
    }

    @Override public void delete(PetType object) {
        super.delete(object);
    }

    @Override public void deleteById(Long id) {
        super.deleteById(id);
    }
}
