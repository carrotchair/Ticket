package pl.sdacademy.java.intermediate.Calendar;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@Data
@XmlRootElement     //od tej klasy zostanie wszystko wczytane
@XmlAccessorType(XmlAccessType.FIELD)

public class Todos {
    @XmlElement(name = "todo")
    private List<TodoOne> todosList = new ArrayList<>();
}
