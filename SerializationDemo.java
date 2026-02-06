import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) {

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        Student s=new Student(1, "First", "first@gmail.com");

        try {
            fos = new FileOutputStream("student.txt");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(s);
            System.out.println("Serialization Done!");

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}