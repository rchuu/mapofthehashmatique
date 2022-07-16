import java.util.Set;
import java.util.HashMap;

public class MapOfTheHashmatique {
    public static void getSongData() {
        HashMap<String, String> songMap = new HashMap<String, String>();
        songMap.put("Artist1", "Lyrics1");
        songMap.put("Artist2", "Lyrics2");
        songMap.put("Artist3", "Lyrics3");
        songMap.put("Artist4", "Lyrics4");

        String artist = songMap.get("Artist1");
        System.out.println("The artist here wrote " + artist);

        String songByPulledByTitle = songMap.get("Artist1");
        System.out.println(songByPulledByTitle);

        System.out.println("xxxxxx");

        Set<String> keys = songMap.keySet();
        for (String key : keys) {
            System.out.println(key);
            // System.out.println(songMap.get(key));
        }
    }
}
