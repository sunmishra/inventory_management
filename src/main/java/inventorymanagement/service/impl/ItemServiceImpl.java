package inventorymanagement.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventorymanagement.entities.Item;
import inventorymanagement.repository.ItemRepository;
import inventorymanagement.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemRepository itemRepository;

	@Override
	@Transactional
	public void saveItem(Item item) {
		itemRepository.save(item);
	}
	
	@Override
	@Transactional
	public Item updateItem(Item item) {
		if(itemRepository.findById(item.getItemId()).isPresent()) {
			Item existingItem = itemRepository.findById(item.getItemId()).get();
			existingItem.setItemName(item.getItemName());
			existingItem.setItemImage(item.getItemImage());
			existingItem.setItemCategory(item.getItemCategory());
			existingItem.setItemQty(item.getItemQty());
			existingItem.setItemStatus(item.getItemStatus());
			existingItem.setItemUnitPrice(item.getItemUnitPrice());
			return itemRepository.save(item);
		}
		else return null;
		
	}


	@Override
	@Transactional
	public void deleteItem(Integer itemId) {
		itemRepository.deleteById(itemId);
	}

	@Override
	@Transactional
	public List<Item> findAll() {
		return itemRepository.findAll();
	}
}
