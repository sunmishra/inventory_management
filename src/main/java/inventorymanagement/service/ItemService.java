package inventorymanagement.service;

import java.util.List;

import inventorymanagement.entities.Item;

public interface ItemService {

	Item updateItem(Item item);

	void deleteItem(Integer itemId);

	List<Item> findAll();

	void saveItem(Item item);

}