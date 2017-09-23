package media.jplaylistparser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.xml.sax.SAXException;

public class ParseFile {
	
	public void parseFile(String filename) throws IOException, SAXException, JPlaylistParserException{
		

		String contentType = "text/html";
		InputStream is = new FileInputStream(filename);
		AutoDetectParser parser = new AutoDetectParser(); 
	  //  PlayListAbstractClass obj=FactoryObject.buildObject(type);
	   // PlayListAbstractClass playlist=parser.parse(filename, contentType, is, obj);
	    PlayListAbstractClass playlist=parser.parse(filename, contentType, is);
	    PrintConent printConent=new PrintConent();
	    printConent.printContent(playlist);
	    
	    
		
	}

}
