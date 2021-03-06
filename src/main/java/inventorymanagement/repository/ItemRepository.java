package inventorymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import inventorymanagement.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
