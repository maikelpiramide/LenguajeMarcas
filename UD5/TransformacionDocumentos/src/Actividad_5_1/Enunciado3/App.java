package Actividad_5_1.Enunciado3;


import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.swing.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class App {
    public static void main(String[] args) {
        String res;
        File fichero = new File("src/Actividad_5_1/enunciado1.xml");
        Document documento;
        Element document;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            documento = builder.parse(fichero);
            document = documento.getDocumentElement();
            res = JOptionPane.showInputDialog("Introduce el email del autor");
            Element autor = (Element)document.getElementsByTagName("autor").item(0);
            if(res.equals(autor.getAttribute("email"))){
                JOptionPane.showMessageDialog(null,"El email " + res + " pertenece al autor de la noticia");
            }else{
                JOptionPane.showMessageDialog(null,"El email " + res + " no pertenece al autor de la noticia");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
