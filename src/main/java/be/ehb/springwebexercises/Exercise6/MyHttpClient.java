package be.ehb.springwebexercises.Exercise6;

import be.ehb.springwebexercises.Exercise3.Event;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class MyHttpClient {

    public static void main(String[] args) {
        String URL = "http://localhost:8080/events";
        RestTemplate restTemplate = new RestTemplate();

        // GET request
        List<Event> events = restTemplate.getForObject(URL, List.class);
        System.out.println(events);

        // POST request
        Event event = new Event(4, "Test", "Testing");
        restTemplate.postForObject(URL, event, Event.class);
    }
}
