package Actividad_5_2.Enunciado5;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class App {
    public static void main(String[] args) {
        try{
            File fichero = new File("src/Actividad_5_2/Enunciado5/content.xml");
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
    public static void leerFichero(File fichero){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(fichero);
            document.getDocumentElement().normalize();
            NodeList perros = document.getElementsByTagName("perro");
            for (int i = 0; i< perros.getLength();i++){
                Element item = (Element)perros.item(i);

            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static void addPerro(Perro perro){

    }


}
