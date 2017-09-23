package media.jplaylistparser;

public class FactoryObject {
	
	public static PlayListAbstractClass buildObject(ListType model) {
		PlayListAbstractClass playListObject = null;
        switch (model) {
        case MEDIA:
        	playListObject = new MediaPlayList();
            break;
 
        case MASTER:
        	playListObject = new MasterPlayList();
            break;
 
        default:
            // throw some exception
            break;
        }
        return playListObject;
    }

}
