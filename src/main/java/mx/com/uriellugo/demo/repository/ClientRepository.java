package mx.com.uriellugo.demo.repository;

import org.springframework.data.repository.CrudRepository;

import mx.com.uriellugo.demo.entity.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {
    
}
