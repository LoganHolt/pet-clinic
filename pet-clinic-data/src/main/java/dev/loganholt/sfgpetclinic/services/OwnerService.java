package dev.loganholt.sfgpetclinic.services;

import dev.loganholt.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
