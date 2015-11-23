import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by Andreas on 2015-11-23.
 */
public class TextReader {

    private char[] charArray;
    private File file;
    private BufferedReader br;

    public TextReader(File file){
        this.file=file;

        readText();

    }
    public void readText(){
        try {
            br= new BufferedReader(new FileReader(file));
            String result="";
            String str=br.readLine();

            while(str!=null){
                result+=str+"\n";
                str=br.readLine();

            }
            charArray=result.toCharArray();
            System.out.println(result);

            for(int i=0;i<charArray.length;i++){
                System.out.print(charArray[i]);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        new StringSearch(this);
    }
    public char[] getCharArray(){
        return this.charArray;
    }
    public void search(String search){
        for(int i=0;i<charArray.length;i++){
            if(search.charAt(0)==charArray[i]){
                System.out.println("Found it!:"+charArray[i]+" ,i= "+i+"= "+search.charAt(0));
            }
        }
    }

}
