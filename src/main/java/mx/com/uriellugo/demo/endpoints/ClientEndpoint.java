package mx.com.uriellugo.demo.endpoints;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.uriellugo.demo.entity.Client;
import mx.com.uriellugo.demo.service.ClientService;
import mx.com.uriellugo.demo.service.filters.FilterUtil;

@RestController
@RequestMapping("/clients")
public class ClientEndpoint {

    @Autowired
    ClientService clientService;

    public ClientEndpoint(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getClients() {

        Map<Long, Client> map = new HashMap<>();
		map.put(4L, Client.builder().id(4L).firstName("Martin").lastName("Cabrera").build());
		//map.putAll(getMap(Arrays.asList(client1, client2, client3, client4, client5)));
		System.out.println(map);
        
        return clientService.listClients();

    }

    @GetMapping("/hola")
    public String getHola() {
        FilterUtil.getMap(clientService.listClients());
        return "Hola mundo Spring";
    }
    
}
