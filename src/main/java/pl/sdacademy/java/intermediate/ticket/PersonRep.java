package pl.sdacademy.java.intermediate.ticket;

import javax.xml.bind.JAXB;
import java.io.File;
import java.util.Optional;

public class PersonRep {

    private People people;

    PersonRep() {
        File xml = new File("src\\main\\resources\\people_db.xml"); //zadziałało i z "people_db.xml.xml"
        this.people = JAXB.unmarshal(xml, People.class);
        //(a, b) - a - plik, z którego bierzemy dane, b - plik do którego wrzucamy
    }

    Optional<Person> findByPesel(Long pesel) {
        return people.getPersonList().stream()
                .filter(person -> person.getPesel().equals(pesel))
                .findAny();
        //System.out.println();
    }

}
