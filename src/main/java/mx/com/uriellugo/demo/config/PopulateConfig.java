package mx.com.uriellugo.demo.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.com.uriellugo.demo.service.ClientService;

@Component
public class PopulateConfig {
    
    @Autowired
    ClientService clientService;

    @PostConstruct
    public void populateConfig() {
        clientService.init();
    }
}
