package Actividad_5_2.Enunciado1;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class App {
    public static void main(String[] args) {
        String fichero = "src/Actividad_5_2/Enunciado1/contenido.xml";
        leerFichero(fichero);
    }
    public static void leerFichero(String fichero){

        //creamos una instancia de la fabrica para trabajar con el documento
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try{
            //creamos el fichero
            File fichXML = new File(fichero);
            //creamos una fabrica que convertirá el documento
            DocumentBuilder db = factory.newDocumentBuilder();
            //creamos el documento para poder empezar a trabajar
            Document document = db.parse(fichXML);
            //obtenemos el elemento raiz del documento xml
            document.getDocumentElement().normalize();
            /*Element document = doc.getDocumentElement();*/
            //obtenemos la lista de nodos de los libros porque hay varios
            NodeList libros = (NodeList) document.getElementsByTagName("libro");

            System.out.println("Biblioteca");
            //para saber que funcina le indicamos que nos imprima cuantos elementos tiene el la lista de nodos
            //System.out.println(libros.getLength());

            //recorremos la lista de los libros con un bucle
            for (int i = 0 ; i < libros.getLength(); i++){
                //parseamos el elemnto que vamos a obtener del nodo
                Element item = (Element) libros.item(i);
                //imprimimos las caracteristicas del libro, esto lo hará con cada libro que se obtenga en el bucle
                System.out.println("Libro {");
                System.out.println("    Titulo: " + item.getElementsByTagName("titulo").item(0).getTextContent());
                System.out.println("    Autor: " + item.getElementsByTagName("autor").item(0).getTextContent());
                System.out.println("    Genero: " + item.getElementsByTagName("genero").item(0).getTextContent());
                System.out.println("    Año: " + item.getElementsByTagName("anio").item(0).getTextContent());
                System.out.println("}\n");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
