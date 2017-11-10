package basics;
import org.w3c.dom.*;
import org.xml.sax.*;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import java.io.*;

public class ReadXML {
	
	public static final String path ="C:\\testing\\XMLReading\\Test.xml";
	
	public static void main(String[] args) {
	      
	      try {
	         File inputFile = new File(path);
	         
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder;

	         dBuilder = dbFactory.newDocumentBuilder();

	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();

	         XPath xPath =  XPathFactory.newInstance().newXPath();

	         String expression = "/class/password";
	         NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(
	            doc, XPathConstants.NODESET);
	         for (int i = 0; i < nodeList.getLength(); i++) {
		            Node nNode = nodeList.item(i);
		            System.out.println("\nCurrent Element :" + nNode.getNodeName());
		            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			               Element eElement = (Element) nNode;
			             System.out.println("roll no :" + eElement.getAttribute("pass"));
			             
		            }	         
	         }

	/*         for (int i = 0; i < nodeList.getLength(); i++) {
	            Node nNode = nodeList.item(i);
	            System.out.println("\nCurrent Element :" + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               //System.out.println("Student roll no :" + eElement.getAttribute("rollno"));
	               String name = eElement.getAttribute("rollno");
	               System.out.println("String as "+name);
	  System.out.println("First Name : "+ eElement.getElementsByTagName("firstname").item(0).getTextContent());
	  System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
	  System.out.println("Nick Name : "+ eElement.getElementsByTagName("nickname").item(0).getTextContent());
	  System.out.println("Marks : "+ eElement.getElementsByTagName("marks").item(0).getTextContent());
	            }
	       } */
	      } catch (ParserConfigurationException e) {
	         e.printStackTrace();
	      } catch (SAXException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (XPathExpressionException e) {
	         e.printStackTrace();
	      }
	   }
	}
