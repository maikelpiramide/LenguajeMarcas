package Actividad_5_2.Enunciado2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class App {
    public static void main(String[] args) {

        try{
            File fichero = new File("src/Actividad_5_2/Enunciado2/content.xml");
            leerFichero(fichero);
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
    public static void leerFichero(File fichero){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try{
            Document document = factory.newDocumentBuilder().parse(fichero);
            document.getDocumentElement().normalize();
            NodeList usuarios = document.getElementsByTagName("usuario");
            System.out.println("Usuarios:");
            for (int i = 0; i < usuarios.getLength(); i++){
                Element item = (Element)usuarios.item(i);
                Element nombre = (Element)item.getElementsByTagName("nombre").item(0);
                Element contacto = (Element)item.getElementsByTagName("contacto").item(0);
                System.out.println("    Usuario " + item.getAttribute("id"));
                System.out.println("        Nombre: " + nombre.getTextContent() + " " +  nombre.getAttribute("apellido"));
                System.out.println("        Edad: " + nombre.getAttribute("edad"));
                System.out.println("        Email: " + contacto.getElementsByTagName("email").item(0).getTextContent());
                System.out.println("        Teléfono: " + contacto.getElementsByTagName("telefono").item(0).getTextContent());
                System.out.println();
            }


        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
