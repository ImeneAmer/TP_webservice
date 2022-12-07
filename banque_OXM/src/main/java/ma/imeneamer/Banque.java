package ma.imeneamer;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;
@XmlRootElement
public class Banque {
@XmlElement(name = "Compte")
   public List<Compte> comptes= new ArrayList<>();

}
