package pl.sdacademy.java.intermediate.ticket;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlType(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    @XmlElement(required = true)             //ctrl + p
    private String name;
    @XmlElement(required = true)
    private String surname;
    @XmlElement(required = true)
    private Long pesel;
    @XmlElement(name = "id_number") //tu dodajemy nazwę, bo różni się od tej w xml'u
    private String idNumber;
    @XmlElement
    private String address;

}
