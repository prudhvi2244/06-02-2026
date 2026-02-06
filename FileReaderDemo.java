import java.io.File;
import java.io.FileReader;
import java.io.IOException;
class FileReaderDemo {

    public static void main(String[] args){
        File f1=new File("demo.txt");
        FileReader fr=null;
        try{
            fr=new FileReader(f1);
            int i=fr.read();
            while(i!=-1){
              System.out.print((char)i);
              i=fr.read();
            }
           
        }
        catch(IOException e){
            System.out.println(e);
        }
        

    }
    
}