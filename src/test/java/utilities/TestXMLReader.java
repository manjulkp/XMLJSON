package utilities;

import java.io.IOException;

public class TestXMLReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XMLReader xml = new XMLReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Locator\\XML.xml");
        System.out.println(xml.getLocator("username.css"));
        
        //driver.findElement(By.xpath(xml.getLocator("username.css")))
        
        JsonReader json = new JsonReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Locator\\XML.xml");
        System.out.println(json.getLocator("locators.header.username.css"));
        
	}

}
