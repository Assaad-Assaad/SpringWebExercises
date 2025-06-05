package be.ehb.springwebexercises.Exercise3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    private final FakeEventRepository fakeEventRepository;

    @Autowired
    public EventController(FakeEventRepository fakeEventRepository) {
        this.fakeEventRepository = fakeEventRepository;
    }

    @GetMapping
    public ResponseEntity<List<Event>> getAllEvents() {
        return ResponseEntity.ok(fakeEventRepository.getAllEvents());
    }
    @GetMapping("/{id}")
    public Event getEventById(@PathVariable int id) {
        return fakeEventRepository.getEventById(id);
    }

    @PostMapping
    public ResponseEntity<Event> addEvent(@RequestBody Event event) {
        fakeEventRepository.addEvent(event);
        return ResponseEntity.ok(event);
    }
}
