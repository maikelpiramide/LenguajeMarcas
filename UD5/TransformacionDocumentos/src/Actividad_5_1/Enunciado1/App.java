package Actividad_5_1.Enunciado1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class App {
    public static void main(String[] args){
        //creamos el fichero
        File fichero = new File("src/Actividad_5_1/enunciado1.xml");
        //creamos una instancia para crear los documentos
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try{
            //creamos el document builder
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            //convertimos el xml en un objeto document para manipularlo
            Document documento = documentBuilder.parse(fichero);
            //obtenemos el elemento raiz del xml
            Element document = documento.getDocumentElement();
            System.out.println("Noticia:");
            //imprimimos directamento el contendio del elemento titulo
            System.out.println("Título: " + document.getElementsByTagName("titulo").item(0).getTextContent());
            System.out.println("Categoría: " + document.getElementsByTagName("categoria").item(0).getTextContent());
            System.out.println("Descripción: " + document.getElementsByTagName("descripcion").item(0).getTextContent());
            //obtenemos el elemento autor a parte ya que tenemos que repetir codio sino
            Element autor = (Element) document.getElementsByTagName("autor").item(0);
            System.out.println("Autor: " + autor.getTextContent() + " | Twitter: " + autor.getAttribute("twitter") + " | Email: " + autor.getAttribute("email"));




        }catch(Exception ex){
            ex.printStackTrace();
        }

        
    }



}
