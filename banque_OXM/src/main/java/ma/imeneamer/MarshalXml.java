package ma.imeneamer;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;

public class MarshalXml {
    public static void main(String[] args) throws JAXBException {

        JAXBContext jaxbContext= JAXBContext.newInstance(Banque.class);

        Banque banque= new Banque();

        Compte cp1=new Compte(1,5000,new Date(), TypeCompte.COURANT);
        Compte cp2=new Compte(2,10500,new Date(),TypeCompte.EPARGNE);
        Compte cp3=new Compte(3,50000,new Date(),TypeCompte.COURANT);

        banque.comptes.add(cp1);
        banque.comptes.add(cp2);
        banque.comptes.add(cp3);
        Marshaller marshaller=jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
       // marshaller.marshal(banque,System.out);
        marshaller.marshal(banque,new File("compte.xml"));




    }
}
