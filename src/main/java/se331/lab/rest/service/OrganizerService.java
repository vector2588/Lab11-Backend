package se331.lab.rest.service;

import org.springframework.data.domain.Page;
import se331.lab.rest.entity.Event;
import se331.lab.rest.entity.Organizer;

import java.util.List;

public interface OrganizerService {
    List<Organizer> getAllOrganizer();
    Organizer save(Organizer organizer);
    Page<Organizer> getOrganizer(Integer page, Integer pageSize);
}
