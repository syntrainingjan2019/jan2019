package createxmldemo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class Readxml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="employee.xml";
		File xmlfile=new File(filename);
		DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
		try{
			DocumentBuilder dBuilder=documentBuilderFactory.newDocumentBuilder();
			Document doc=dBuilder.parse(xmlfile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element is "+doc.getDocumentElement().getNodeName());
			NodeList nodeList=doc.getElementsByTagName("Employee");
			List<Employee> emplist=new ArrayList<Employee>();
			for(int i=0;i<nodeList.getLength();i++){
				emplist.add(getEmployee(nodeList.item(i)));
			}
			for(Employee emp:emplist){
				System.out.println(emp.toString());
			}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
;
	private static Employee getEmployee(Node node){
		Employee employee=new Employee();
		if(node.getNodeType()==node.ELEMENT_NODE){
			Element element=(Element)node;
			employee.setName(getTagValue("name",element));
			employee.setAge(Integer.parseInt(getTagValue("age",element)));
			employee.setRole(getTagValue("role",element));
			employee.setGender(getTagValue("gender",element));
		}
		return employee;
	}
	private static String getTagValue(String tag,Element element){
		NodeList nodeList=element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node=(Node)nodeList.item(0);
		return node.getNodeValue();
	}
}
