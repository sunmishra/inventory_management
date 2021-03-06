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
@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer userId;
	@NotNull
	@Column
	private String salutation;
	@NotNull
	@Column
	private String firstName;
	@NotNull
	@Column
	private String lastName;
	@NotNull
	@Column
	private String gender;
	@NotNull
	@Column
	private String mobile;
	@NotNull
	@Column
	private String email;
	@NotNull
	@Column
	private String address;
	@NotNull
	@Column
	private String role;
	@NotNull
	@Column
	private String status;

}
	