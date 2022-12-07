package ma.imeneamer;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.SchemaOutputResolver;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class GenerateXmlSchema {
    public static void main(String[] args) throws JAXBException, IOException {

        JAXBContext jaxbContext=JAXBContext.newInstance(Banque.class);
        jaxbContext.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String s, String s1) throws IOException {

                File file=new File("banque.xsd");
                StreamResult streamResult=new StreamResult(file);
                return streamResult;
            }
        });
    }
}
