package com.example.youtube.Classes;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.ArrayList;
import java.util.List;

public class GenerarFichero {
    public static void crearFichero(ArrayList<Cuenta> cuentas){
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try{
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.newDocument();
            Element rootElement = document.createElement("youtube");
            document.appendChild(rootElement);
            Element cuentaRootElement = document.createElement("cuentas");
            for(Cuenta cuenta : cuentas){
                //////// crear elemento cuenta /////////
                Element cuentaElement = document.createElement("cuenta");
                cuentaElement.setAttribute("nombre", cuenta.getNombre());
                //editor
                Element editorElement = document.createElement("editor");
                editorElement.setAttribute("edad",String.valueOf(cuenta.getEditor().getEdad()));
                Element nombreEditor = document.createElement("nombre");
                nombreEditor.setTextContent(cuenta.getEditor().getNombre());
                Element emailEditor = document.createElement("email");
                emailEditor.setTextContent(cuenta.getEditor().getEmail());
                //insertamos datos editor y elemento cuenta
                editorElement.appendChild(nombreEditor);
                editorElement.appendChild(emailEditor);
                cuentaElement.appendChild(editorElement);
                //rootElement.appendChild(cuentaElement);
                ///// crear elemento video  /////////////
                Element videosElement = document.createElement("videos");
                //// bucle para obtener los elementos video uno a uno por cada cuenta

                List<Video> videosCuenta = cuenta.getVideos();
                for(Video video : videosCuenta){
                    //////element video
                    Element videoEditor = document.createElement("video");
                    videoEditor.setAttribute("likes", String.valueOf(video.getNumeroDeLikes()));
                    videoEditor.setAttribute("nombre", video.getNombre());

                    //datos del elemento video
                    Element duracionVideo = document.createElement("duracion");
                    duracionVideo.setTextContent(String.valueOf(video.getDuracion()));
                    Element descripcionVideo = document.createElement("descripcion");
                    descripcionVideo.setTextContent(video.getDescripcion());
                    /// metemos elementos del video en la etiqueta video
                    videoEditor.appendChild(duracionVideo);
                    videoEditor.appendChild(descripcionVideo);
                    //metemos los videos en la etiqueta de videos
                    videosElement.appendChild(videoEditor);
                }
                //metemos en la cuenta la etiqueta videos con los videos
                cuentaElement.appendChild(videosElement);
                //añadimos la cuenta con todos los datos al root element cuentas
                cuentaRootElement.appendChild(cuentaElement);
                //añadimos todos los datos dentro de la etiqueta youtube
                rootElement.appendChild(cuentaRootElement);



                // Escribir el contenido del documento XML en un archivo
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                DOMSource source = new DOMSource(document);
                StreamResult result = new StreamResult("src/main/resources/static/youtube.xml");
                transformer.transform(source, result);
                //System.out.println("tansformacion hecha");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
