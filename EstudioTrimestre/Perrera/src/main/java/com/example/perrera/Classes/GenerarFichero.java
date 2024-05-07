package com.example.perrera.Classes;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.naming.spi.DirStateFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.ArrayList;

import static javax.xml.transform.OutputKeys.INDENT;

public class GenerarFichero {
    public static void crearBackup(ArrayList<Cliente> clientes){
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.newDocument();
            Element root = document.createElement("perrera");
            document.appendChild(root);
            Element clientesElement = document.createElement("clientes");
            root.appendChild(clientesElement);

            for(Cliente cliente : clientes){
                //elemento cliente individual
                Element clienteRoot = document.createElement("cliente");
                clienteRoot.setAttribute("id",String.valueOf(cliente.getId()));
                clienteRoot.setAttribute("email",cliente.getEmail());
                Element nombreCliente = document.createElement("nombre");
                nombreCliente.setTextContent(cliente.getNombre());
                clienteRoot.appendChild(nombreCliente);
                Element primerApellidoCliente = document.createElement("primerApellido");
                primerApellidoCliente.setTextContent(cliente.getPrimerApellido());
                clienteRoot.appendChild(primerApellidoCliente);
                Element segindoApellidoCliente = document.createElement("segundoApellido");
                segindoApellidoCliente.setTextContent(cliente.getSegundoApellido());
                clienteRoot.appendChild(segindoApellidoCliente);

                //elemto perro
                Element perroElement = document.createElement("perro");
                perroElement.setAttribute("chip",cliente.getPerro().getNumeroChip());
                clienteRoot.appendChild(perroElement);
                Element nombrePerro = document.createElement("nombre");
                nombrePerro.setTextContent(cliente.getPerro().getNombre());
                perroElement.appendChild(nombrePerro);
                //elemento cuidadores de los perros
                Element cuidadoresPerros = document.createElement("cuidador");
                Element nombreCuidador = document.createElement("nombre");
                cuidadoresPerros.setAttribute("id",String.valueOf(cliente.getPerro().getCuidador().getId()));
                nombreCuidador.setTextContent(cliente.getPerro().getCuidador().getNombre());
                cuidadoresPerros.appendChild(nombreCuidador);
                perroElement.appendChild(cuidadoresPerros);
                //introducimos rtiqueta cliente en clientes
                clientesElement.appendChild(clienteRoot);
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            Source source = new DOMSource(document);
            Result result = new StreamResult("src/main/resources/static/backup.xml");
            transformer.transform(source,result);
            System.out.println("fichero creado");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
