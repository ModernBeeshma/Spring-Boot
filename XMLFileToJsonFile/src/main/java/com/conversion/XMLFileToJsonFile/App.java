package com.conversion.XMLFileToJsonFile;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
 
import org.json.JSONObject;
import org.json.XML;
public class App 
{
    public static void main( String[] args ) throws IOException
    {
int PRETTY_PRINT_INDENT_FACTOR = 4;
		
		String xmlString = 	"<Customer>" + 
				"  <name>Mary</name>" + 
				"  <age>37</age>" + 
				"  <address>" + 
				"    <street>NANTERRE CT</street>" + 
				"    <postcode>77471</postcode>" + 
				"  </address>" + 
				"</Customer>";
		
		JSONObject xmlJSONObj = XML.toJSONObject(xmlString);
		String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
		
		System.out.println(jsonPrettyPrintString);
		
		String xmlFile = System.getProperty("user.dir") + "\\Input.xml";
		
		xmlString = new String(Files.readAllBytes(Paths.get(xmlFile)));
		xmlJSONObj = XML.toJSONObject(xmlString);
		
		String jsonFile = System.getProperty("user.dir") + "\\Output.json";
		
		try (FileWriter fileWriter = new FileWriter(jsonFile)){
			fileWriter.write(xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR));
		}   	
		System.out.println("Done!");
    }
}
