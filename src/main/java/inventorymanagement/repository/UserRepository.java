package inventorymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import inventorymanagement.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
