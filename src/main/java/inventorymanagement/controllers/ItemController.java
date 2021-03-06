package inventorymanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inventorymanagement.entities.Item;
import inventorymanagement.service.ItemService;

@RequestMapping("/api/item")
@RestController
public class ItemController {

	@Autowired
	ItemService itemservice;
	
	@GetMapping
	public List<Item> findAll(){
		return itemservice.findAll();
	}
	
	@PostMapping
	public ResponseEntity<String> saveItem(@RequestBody Item item) {
		System.out.println( ".................."+item );
		itemservice.saveItem(item);
		return new ResponseEntity<String>("Item has been Saved successfully", HttpStatus.OK);
	}

	@PutMapping
	public Item updateItem(@RequestBody Item item) {
		return itemservice.updateItem(item);
	}

	@DeleteMapping("/{itemId}")
	public ResponseEntity<String> deleteItem(@PathVariable Integer itemId) {
		itemservice.deleteItem(itemId);
		return new ResponseEntity<String>("Item has been Deleted", HttpStatus.OK);
	}
	
}
