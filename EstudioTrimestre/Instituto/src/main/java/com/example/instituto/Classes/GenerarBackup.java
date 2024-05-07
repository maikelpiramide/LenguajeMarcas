package com.example.instituto.Classes;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.List;

public class GenerarBackup {
    public static void crearFichero(List<Profesor> profesores, List<TipodeGasto> tiposDeGasto,List<Gasto> gastos) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            //crear documento "virtual"
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.newDocument();
            Element root = document.createElement("instituto");
            document.appendChild(root);


            //bucle de gastos
            Element rootTipoDeGasto = document.createElement("tipos_de_gastos");
            for(TipodeGasto tipodeGasto : tiposDeGasto) {
                Element tipoGastoElement = document.createElement("tipo_de_gasto");
                tipoGastoElement.setAttribute("id",String.valueOf(tipodeGasto.getId()));
                Element nombreGasto = document.createElement("nombre");
                nombreGasto.setTextContent(tipodeGasto.getNombre());
                tipoGastoElement.appendChild(nombreGasto);
                rootTipoDeGasto.appendChild(tipoGastoElement);
            }
            root.appendChild(rootTipoDeGasto);

            //zona de profesores
            Element rootProfesorElement = document.createElement("profesores");
            for(Profesor profesor : profesores) {
                Element profesorElement = document.createElement("profesor");
                profesorElement.setAttribute("id",String.valueOf(profesor.getId()));
                profesorElement.setAttribute("nombre",profesor.getNombre());
                rootProfesorElement.appendChild(profesorElement);

            }
            root.appendChild(rootProfesorElement);

            //zona de gastos
            Element rootTipoDeGastosElement = document.createElement("gastos");
            for(Gasto gasto : gastos) {
                Element gastoElement = document.createElement("gasto");
                gastoElement.setAttribute("id",String.valueOf(gasto.getId()));

                Element precioGasto = document.createElement("precio");
                precioGasto.setTextContent(String.valueOf(gasto.getPrecio()));

                Element tipoDeGasto = document.createElement("tipo_de_gasto");
                tipoDeGasto.setTextContent(gasto.getTipodeGasto().getNombre());

                Element profesorGasto = document.createElement("profesor");
                profesorGasto.setTextContent(gasto.getProfesor().getNombre());

                gastoElement.appendChild(precioGasto);
                gastoElement.appendChild(tipoDeGasto);
                gastoElement.appendChild(profesorGasto);

                rootTipoDeGastosElement.appendChild(gastoElement);
            }
            root.appendChild(rootTipoDeGastosElement);

            //crear documento .xml un vez tenemos el virtual
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");

            Source source = new DOMSource(document);
            Result result = new StreamResult("src/main/resources/static/backup.xml");
            transformer.transform(source,result);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
