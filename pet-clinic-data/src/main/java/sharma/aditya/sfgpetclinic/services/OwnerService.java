package sharma.aditya.sfgpetclinic.services;

import sharma.aditya.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
