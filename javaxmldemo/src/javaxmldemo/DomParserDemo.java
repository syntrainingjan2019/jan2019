package javaxmldemo;
import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
public class DomParserDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File inputFile=new File("students.xml");
		DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
		Document doc=dBuilder.parse(inputFile);
		doc.getDocumentElement().normalize();
		System.out.println("Root Element : "+doc.getDocumentElement().getNodeName());
		NodeList nList=doc.getElementsByTagName("student");
		System.out.println("=========================================================");
		for(int temp=0;temp<nList.getLength();temp++){
			Node nNode=nList.item(temp);
			System.out.println("\nCurrent Element : "+nNode.getNodeName());
			if(nNode.getNodeType() == Node.ELEMENT_NODE){
				Element eElement=(Element)nNode;
				System.out.println("Student Roll No :"+eElement.getAttribute("rollno"));
				System.out.println("First Name :"+eElement.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println("Last Name :"+eElement.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("Nick Name :"+eElement.getElementsByTagName("nickname").item(0).getTextContent());
				System.out.println("Marks :"+eElement.getElementsByTagName("marks").item(0).getTextContent());
			}
		}
	}

}
