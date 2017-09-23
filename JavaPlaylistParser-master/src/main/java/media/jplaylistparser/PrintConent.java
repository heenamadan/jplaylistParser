package media.jplaylistparser;

import java.util.List;
import java.util.Map;

public class PrintConent {
	
	public void printContent(PlayListAbstractClass playlist){
		if(playlist instanceof MasterPlayList){
	    	for (Map.Entry<String, List<MasterPlayList>> entry : ((MasterPlayList) playlist).getMasterMap().entrySet()) {
	            String key1 = entry.getKey();
	            List<MasterPlayList> values = entry.getValue();
	            
	            for(int i=0;i<values.size();i++){
	            	System.out.println("Key = " + key1);
	            	 System.out.println("bandwidth  = " + values.get(i).getBandwidth() + "\n");
	            	 System.out.println("uri = " + values.get(i).getUri() + "\n");
	            	 System.out.println("pgm id  = " + values.get(i).getProgramID() + "\n");
	            	 System.out.println("version id  = " + values.get(i).getVersion() + "\n");
	    		}
	        }

	    }else if(playlist instanceof MediaPlayList){
	    	for (Map.Entry<String, List<MediaPlayList>> entry : ((MediaPlayList) playlist).getMediaMap().entrySet()) {
	            String key1 = entry.getKey();
	            List<MediaPlayList> values = entry.getValue();
	          
	            for(int i=0;i<values.size();i++){
	            	  System.out.println("Key = " + key1);
	            	 System.out.println("duration = " + values.get(i).getDuration() + "\n");
	            	 System.out.println("uri = " + values.get(i).getUri() + "\n");
	    		}
	        }
	    	
	    }
		
		
	}

}
