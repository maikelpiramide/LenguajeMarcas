package Actividad_5_1.Enunciado2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        File fichero = new File("src/Actividad_5_1/enunciado1.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document documento = null;
        Element document = null;
        try{
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            documento = documentBuilder.parse(fichero);
            document = documento.getDocumentElement();
            System.out.println("Introduce el nombre del autor");
            String res = scn.nextLine();
            if(res.equals(document.getElementsByTagName("autor").item(0).getTextContent()) ){
                System.out.println("El autor " + res + " es el autor de la noticia");
            }else{
                System.out.println("El autor " + res + " no es el autor de la noticia");
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
