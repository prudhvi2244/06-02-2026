import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
class BufferedWriterDemo {

public static void main(String[] args){
    // try with resources
    try(FileWriter fw= new FileWriter("sample.txt");
       BufferedWriter  bw=new BufferedWriter(fw);){
       
       bw.write("LPU");
       bw.newLine();
       bw.write(100);
       bw.newLine();

    }
    catch(IOException e){
        System.out.println(e);
    }
    

    
}

}