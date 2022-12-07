import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class AppServer {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8090/",new BanqueService());
        System.out.println("Web service deployé ");
    }
}
