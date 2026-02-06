import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class DeSerializationDemo{

    public static void main(String[] args){
        FileInputStream fis=null;
        ObjectInputStream ois=null;

        try{
            fis=new FileInputStream("student.txt");
            ois=new ObjectInputStream(fis);
            Student student=(Student)ois.readObject();
            System.out.println(student);

        }
        catch(IOException | ClassNotFoundException ioe){
            System.out.println(ioe);
        }
       
    }
    
}