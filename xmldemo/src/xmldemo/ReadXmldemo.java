package xmldemo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class ReadXmldemo {
	public static void main(String args[]){
		String filename="employee.xml";
		File xmlFile=new File(filename);
		DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try{
			dBuilder =dbFactory.newDocumentBuilder();
			Document doc=dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root Element"+doc.getDocumentElement().getNodeName());
			NodeList nodeList=doc.getElementsByTagName("Employee");
			List<Employee> emplist=new ArrayList<Employee>();
			for(int i=0;i<nodeList.getLength();i++){
				emplist.add(getEmployee(nodeList.item(i)));
				System.out.println("ading the employee");
			}
			for(Employee emp:emplist){
				System.out.println(emp.toString());
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	private static Employee getEmployee(Node node){
		Employee emp=new Employee();
		if(node.getNodeType()==node.ELEMENT_NODE){
			Element element=(Element)node;
			emp.setName(getTagValue("name", element));
			emp.setAge(Integer.parseInt(getTagValue("age", element)));
			emp.setGender(getTagValue("gender", element));
			emp.setRole(getTagValue("role", element));
		}
		return emp;
	}
	private static String getTagValue(String tag,Element element){
		NodeList nodeList=element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node=(Node)nodeList.item(0);
		return node.getNodeValue();
	}
}
