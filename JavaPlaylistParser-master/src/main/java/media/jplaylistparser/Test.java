package media.jplaylistparser;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.net.MalformedURLException;

public class Test {

	public static void main(String a[]) throws SAXException, JPlaylistParserException{

		try {
			// you can download m3u8 file and specify the complete path here.
			final String path = "<path of m3u8 file>";
			ParseFile parseFile=new ParseFile();
			parseFile.parseFile(path);

		}catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
