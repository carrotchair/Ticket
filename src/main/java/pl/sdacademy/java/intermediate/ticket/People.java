package pl.sdacademy.java.intermediate.ticket;

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
class People {
    @XmlElement(name = "person")
    private List<Person> personList = new ArrayList<>();
}
