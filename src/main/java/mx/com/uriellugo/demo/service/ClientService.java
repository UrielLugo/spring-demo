package mx.com.uriellugo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.uriellugo.demo.entity.Client;
import mx.com.uriellugo.demo.repository.ClientRepository;

@Service
public class ClientService {
    
    @Autowired
    ClientRepository clientRepository;

    public void init() {
        Client client1 = Client.builder().id(1L).firstName("Uriel").lastName("Lugo").age(24).build();
		Client client2 = Client.builder().id(2L).firstName("Sebastian").lastName("Borbolla").age(21).build();
		Client client3 = Client.builder().id(3L).firstName("Elena").lastName("Romero").age(12).build();
		Client client4 = Client.builder().id(4L).firstName("Andrea").lastName("Reyes").age(5).build();
		Client client5 = Client.builder().id(5L).firstName("Alfredo").lastName("Alarcon").age(43).build();

        clientRepository.save(client1);
        clientRepository.save(client2);
        clientRepository.save(client3);
        clientRepository.save(client4);
        clientRepository.save(client5);
    }

    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    public List<Client> listClients() {
        return (List<Client>) clientRepository.findAll();
    }
}