import java.io.File;

/**
 * Created by Andreas on 2015-11-23.
 */
public class Main {

    public static void main(String [] args){
        /*
        JFileChooser jc=new JFileChooser();
        jc.showOpenDialog(null);
        TextReader fr= new TextReader(new File(jc.getSelectedFile().getPath()));
         */
        TextReader fr= new TextReader(new File("/Users/Andreas/Documents/StringSearch/StringSearch.txt"));
    }
}
