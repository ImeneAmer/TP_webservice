import proxy.BanqueService;
import proxy.BanqueWebService;
import proxy.Compte;

public class ClientWs {
    public static void main(String[] args) {

        BanqueService stub=new BanqueWebService().getBanqueServicePort();
        System.out.println("le montant en Euro "+stub.conversionEuroToDh(550));
        System.out.println("");
        Compte cp1= stub.getCompte(1);
        System.out.println("Detail du Compte");
        System.out.println("__________________");
        System.out.println(cp1.getCode());
        System.out.println(cp1.getSolde());



    }
}
