package pl.sdacademy.java.intermediate.Calendar;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;

public class TodoOne {

    @XmlElement(name = "todo")
    private String todo;
}
