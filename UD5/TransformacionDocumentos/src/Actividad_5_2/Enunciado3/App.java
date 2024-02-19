package Actividad_5_2.Enunciado3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    static Scanner scn = new Scanner(System.in);
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
        HashMap<Long,String> usuariosMap = new HashMap<Long, String>();
        try{
            Document document = factory.newDocumentBuilder().parse(fichero);
            document.getDocumentElement().normalize();
            NodeList usuarios = document.getElementsByTagName("usuario");

            for (int i = 0; i < usuarios.getLength(); i++){
                Element item = (Element)usuarios.item(i);
                Element nombre = (Element)item.getElementsByTagName("nombre").item(0);
                Element contacto = (Element)item.getElementsByTagName("contacto").item(0);
                Element telefono = (Element)contacto.getElementsByTagName("telefono").item(0);
                //metemos en el map clave/valor
                usuariosMap.put(Long.parseLong(telefono.getTextContent()),nombre.getTextContent());
            }


        }catch(Exception ex){
            ex.printStackTrace();
        }

        long resUser = getTelefono();
        try{

            boolean getNumber = usuariosMap.containsKey(resUser);
            if(getNumber){
                System.out.println("El numero " + resUser + " pertenece al usuario " + usuariosMap.get(resUser));
                return;
            }
            throw new Exception("El numero " + resUser + " no pertenece a ningún usuario");


        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static long getTelefono(){
        System.out.println("Introduce el número de telefono del usuario");
        long res = scn.nextLong();
        return res;
    }
}
