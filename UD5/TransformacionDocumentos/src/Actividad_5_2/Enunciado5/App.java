package Actividad_5_2.Enunciado5;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class App {

    static ArrayList<Perro> perrosList = new ArrayList();
    public static void main(String[] args) {
        try{
            File fichero = new File("src/Actividad_5_2/Enunciado5/content.xml");
            leerFichero(fichero);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        getPerros();

    }
    public static void leerFichero(File fichero){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(fichero);
            document.getDocumentElement().normalize();
            NodeList perros = document.getElementsByTagName("perro");
            for (int i = 0; i< perros.getLength();i++){
                //obetenemos el elemento i del array de perros
                Element item = (Element)perros.item(i);
                String nombre = item.getElementsByTagName("nombre").item(0).getTextContent();
                int edad = Integer.parseInt(item.getElementsByTagName("edad").item(0).getTextContent());
                boolean vacunado;
                if(item.getElementsByTagName("vacunado").item(0).getTextContent().equalsIgnoreCase("si") || item.getElementsByTagName("vacunado").item(0).getTextContent().equalsIgnoreCase("sí")){
                    vacunado = true;
                }else{
                    vacunado = false;
                }
                double peso = Double.parseDouble(item.getElementsByTagName("peso").item(0).getTextContent());
                String colorPelo = item.getElementsByTagName("color_de_pelo").item(0).getTextContent();
                //cramos el perro obteniendo su objeto y añadiendolo al arrayList
                addPerro(crearPerro(nombre,edad,vacunado,peso,colorPelo));

            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static Perro crearPerro(String nombre,int edad,boolean vacunado,double peso,String colorPelo){
        Perro perro = new Perro(nombre,edad,vacunado,peso,colorPelo);
        return  perro;
    }
    public static void addPerro(Perro perro){
        perrosList.add(perro);
    }
    public static void getPerros(){
        for(Perro p:perrosList){
            System.out.println(p);
        }
    }


}
