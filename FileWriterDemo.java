import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter fw1 = null;
        try {
            fw1 = new FileWriter("abc.txt",true);
            fw1.write("A");
            fw1.write("A");
            fw1.write("\n");
            fw1.write("B");
            fw1.write("\n");
            fw1.write("C");
            fw1.write("\n");
            fw1.write("D");
            fw1.write(65); // A
            fw1.write(97); // a
        } catch (IOException ioe) {
            System.out.println(ioe);
        } finally {
            try{
            fw1.close();
            }
            catch(IOException e){
                System.out.println(e);
            }
            
        }
    }

}