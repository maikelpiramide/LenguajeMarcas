package Actividad_5_2.Enunciado4;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        try{
            File fichero = new File("src/Actividad_5_2/Enunciado4/content.xml");
            setPerro(fichero);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static HashMap<String,String> leerFichero(File fichero){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        HashMap<String,String> datosPerro = new HashMap<>();
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(fichero);
            document.getDocumentElement().normalize();
            Element nombre = (Element)document.getElementsByTagName("nombre").item(0);
            Element edad = (Element)document.getElementsByTagName("edad").item(0);
            Element vacunado = (Element)document.getElementsByTagName("vacunado").item(0);
            Element peso = (Element)document.getElementsByTagName("peso").item(0);
            Element colorPelo = (Element)document.getElementsByTagName("color_de_pelo").item(0);
            datosPerro.put("nombre",nombre.getTextContent());
            datosPerro.put("edad", edad.getTextContent());
            datosPerro.put("vacunado",vacunado.getTextContent());
            datosPerro.put("peso",peso.getTextContent());
            datosPerro.put("colorPelo",colorPelo.getTextContent());

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return datosPerro;
    }
    public static void setPerro(File fichero){
        HashMap<String,String> data = leerFichero(fichero);
        System.out.println(data);
        boolean vacunado;
        if(data.get("vacunado").equalsIgnoreCase("sí") || data.get("vacunado").equalsIgnoreCase("si") ){
            vacunado = true;
        }else{
            vacunado = false;
        }
        Perro perro = new Perro(data.get("nombre"),Integer.parseInt(data.get("edad")),vacunado,Double.valueOf(data.get("peso")),data.get("colorPelo"));
        System.out.println("to string");
        System.out.println(perro.toString());
    }
}
