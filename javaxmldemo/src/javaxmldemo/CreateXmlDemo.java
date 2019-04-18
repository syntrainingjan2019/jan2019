package javaxmldemo;
import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;
import javax.xml.parsers.*;
public class CreateXmlDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
		Document doc=dBuilder.newDocument();
		
		Element rootElement=doc.createElement("class");
		doc.appendChild(rootElement);
		Element student=doc.createElement("student");
		rootElement.appendChild(student);
		Attr attr=doc.createAttribute("rollno");
		attr.setValue("101");
		student.setAttributeNode(attr);
		Element firstname=doc.createElement("firstname");
		firstname.appendChild(doc.createTextNode("fname01"));
		student.appendChild(firstname);
		TransformerFactory transformerFactory=TransformerFactory.newInstance();
		Transformer transformer=transformerFactory.newTransformer();
		DOMSource source=new DOMSource(doc);
		StreamResult result=new StreamResult(new File("E:\\workspace\\oxygen\\study\\javaxmldemo\\studentfile.xml"));
		transformer.transform(source, result);
		StreamResult consoleResult=new StreamResult(System.out);
		transformer.transform(source, consoleResult);
	}

}
