package sharma.aditya.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import sharma.aditya.sfgpetclinic.model.Owner;
import sharma.aditya.sfgpetclinic.services.OwnerService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstactMapService<Owner, Long> implements OwnerService {
    @Override public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override public Owner save(Owner owner) {
        return super.save(owner);
    }

    @Override public void delete(Owner owner) {
        super.delete(owner);

    }

    @Override public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override public Owner findByLastName(String lastName) {
        return null;
    }
}
