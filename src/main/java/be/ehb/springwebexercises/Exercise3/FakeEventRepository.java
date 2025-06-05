package be.ehb.springwebexercises.Exercise3;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class FakeEventRepository {

    private Map<Integer, Event> events = new HashMap<>();

    public List<Event> createEvents() {
        List<Event> eventList = List.of(
                new Event(1, "Party", "Party"),
                new Event(2, "Concert", "Concert"),
                new Event(3, "Festival", "Festival")
        );
        return eventList;
    }



    public void addEvent(Event event) {
        events.put(event.getId(), event);

    }

    public Event getEventById(int id) {
        return getAllEvents().get(id);

    }

    public List<Event> getAllEvents() {
       return createEvents();
    }
}
