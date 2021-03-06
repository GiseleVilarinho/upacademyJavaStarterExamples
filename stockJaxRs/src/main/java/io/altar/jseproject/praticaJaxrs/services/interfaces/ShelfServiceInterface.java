package io.altar.jseproject.praticaJaxrs.services.interfaces;

import java.util.List;

import io.altar.jseproject.praticaJaxrs.models.Shelf;

public interface ShelfServiceInterface extends EntityServiceInterface<Shelf> {

	void updateProductOnShelfs(long productId, List<Long> shelfsOld, List<Long> shelfsNew);

	List<Long> getShelfIdsByProductId(long productId);
}
