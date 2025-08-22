package system.dev.base.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import system.dev.base.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

	  public Optional<Person> findById(Long name); 
}
