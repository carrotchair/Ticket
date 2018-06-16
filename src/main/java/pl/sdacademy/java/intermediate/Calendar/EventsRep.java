package pl.sdacademy.java.intermediate.Calendar;

import java.util.List;

public interface EventsRep {

    List<EventOne> getAllEventList();
    Events getNextEvent();
    void addEvent (EventOne eventOne);
    void save (EventOne eventOne);

}
