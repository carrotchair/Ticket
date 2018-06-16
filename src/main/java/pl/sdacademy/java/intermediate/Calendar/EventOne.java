package pl.sdacademy.java.intermediate.Calendar;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlType(name = "event")
@XmlAccessorType(XmlAccessType.FIELD)
public class EventOne {

    @XmlAttribute(name = "date")
    private String date;
    @XmlValue
    private String name;
}
