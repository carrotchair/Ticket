package pl.sdacademy.java.intermediate.Calendar;

import javax.xml.bind.JAXB;
import java.io.File;
import java.util.List;

public class EventsXmlRep implements EventsRep {

    private final Events events;
    private final File file;

    EventsXmlRep(File file) {
        this.file = file;
        this.events = JAXB.unmarshal(file, Events.class);
    }

    @Override
    public List<EventOne> getAllEventList() {
        return null;
    }

    @Override
    public Events getNextEvent() {
        return null;
    }

    @Override
    public void addEvent(EventOne eventOne) {
        events.getEventList().add(eventOne);
    }

    @Override
    public void save(EventOne eventOne) {
        JAXB.marshal(events, file);
    }
}
