package mx.com.uriellugo.demo.service.filters;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import lombok.extern.log4j.Log4j2;
import mx.com.uriellugo.demo.entity.Client;

@Log4j2
public class FilterUtil {
    
    public static final int MAYORIA_EDAD = 18;

    public static Predicate<Client> filterMayoriaEdad() {
        return c -> c.getAge() >= MAYORIA_EDAD;
    }

    public static Map<Long, Client> getMap(List<Client> clients) {

		Map<Long, Client> map = new HashMap<>();
		clients.stream()
            .filter(filterMayoriaEdad())
            .forEach(c -> log.info(c));

		//clients.stream().filter(c -> c.getId().equals(1L));
		clients.stream()
		.filter(
			((Predicate<Client>)c -> { return c.getAge() >= MAYORIA_EDAD;})
			.and(c-> true)
			)
			.forEach(
				c -> map.put(c.getId(), c)
			);;
		

		return map;
	}
}
