import java.io.File;
import java.util.ArrayList;

/**
 * Created by Andreas on 2015-11-23.
 */
public class FileReader {

    private ArrayList<Character> charArray;
    private File file;

    public FileReader(File file){
        charArray= new ArrayList<>();
        this.file=file;
    }

}
