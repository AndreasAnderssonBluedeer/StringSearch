import javax.swing.*;

/**
 * Created by Andreas on 2015-11-24.
 */
public class StringSearch {

    private boolean proceed=false;
    private String search;
    private TextReader textReader;

    public StringSearch(TextReader textReader){
        this.textReader=textReader;
        proceed=true;
        while(proceed){

            int choice=Integer.parseInt(JOptionPane.showInputDialog(null,"Välj:\n" +
                    "1- Algoritm Uno\n2-Algoritm Dos\n3- Avsluta"));

            if(choice==1){

                search=JOptionPane.showInputDialog(null,"Mata in det ord du vill söka efter.");
                System.out.println("Sökning: "+search);
                //Anropa Algoritm 1

            }
            else if(choice==2){

                search=JOptionPane.showInputDialog(null,"Mata in det ord du vill söka efter.");
                System.out.println("Sökning: "+search);
                textReader.search(search);
                //Anropa Algoritm 2
            }
            else{
                proceed=false;
            }
        }
    }
}
