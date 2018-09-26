package utilities;

import java.io.File;
import java.io.IOException;

import com.jayway.jsonpath.JsonPath;

public class JsonReader {
	
	// user JSON editor to check whether json file creadted without any error .
	private File jsonFile;
	public String fileName;
	
	public JsonReader(String fileName){
		
		this.fileName = fileName;
	}
	
	
	public String getLocator(String locator) throws IOException{
		
		jsonFile = new File(fileName);
		return JsonPath.read(jsonFile, "$."+locator);
				
		
	}

}
