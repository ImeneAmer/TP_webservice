package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
import java.util.Random;

@WebService(serviceName = "BanqueWebService")
public class BanqueService {

    @WebMethod(operationName = "ConversionEuroToDh")
    public double conversion (@WebParam(name = "Montant") double mt){

        return mt*11;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "Code") int code){

        return new Compte(1, Math.random()*9888,new Date());

    }
    @WebMethod
    public List<Compte> listComptes(){

        return List.of(
                new Compte(1,Math.random()*9888,new Date()),
                new Compte(2,Math.random()*9888,new Date()),
                new Compte(3,Math.random()*9888,new Date())

        );
    }
}
