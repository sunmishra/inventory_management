package inventorymanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "item")
public class Item {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer itemId;
	@Column
	@NotNull
	private String itemName;
	@Column
	@NotNull
	private String itemImage;
	@Column
	@NotNull
	private String itemCategory;
	@Column
	@NotNull
	private Integer itemQty;
	@Column
	@NotNull
	private Double itemUnitPrice;
	@Column
	@NotNull
	private String itemStatus;

}
