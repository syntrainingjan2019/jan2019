package xmldemo;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.*;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.*;
public class createxmldemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
		Document doc=dBuilder.newDocument();
		Element rootElement=doc.createElement("cars");
		doc.appendChild(rootElement);
		Element supercar=doc.createElement("supercars");
		rootElement.appendChild(supercar);
		Attr attr=doc.createAttribute("company");
		attr.setValue("ferrari");
		supercar.setAttributeNode(attr);
		Element carname=doc.createElement("carname");
		Attr attrtype=doc.createAttribute("type");
		attrtype.setValue("formula one");
		carname.appendChild(doc.createTextNode("ferrari 101"));
		supercar.appendChild(carname);
		TransformerFactory transformerFactory=TransformerFactory.newInstance();
		Transformer transformer=transformerFactory.newTransformer();
		DOMSource source=new DOMSource(doc);
		StreamResult result=new StreamResult(new File("cars.xml"));
		transformer.transform(source, result);
		StreamResult consoleResult=new StreamResult(System.out);
		transformer.transform(source, consoleResult);
		
	}

}
