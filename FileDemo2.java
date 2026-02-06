import java.io.File;
import java.io.IOException;

class FileDemo2 {
    public static void main(String[] args) {

        File f1 = new File("demo1.txt");

        System.out.println("Is demo1.txt exists? "+ f1.exists());
        System.out.println("Is demo1.txt a Directory? "+ f1.isDirectory());
        System.out.println("Is demo1.txt a File? "+ f1.isFile());
        System.out.println("Is demo1.txt Hidden File? "+ f1.isHidden());
        System.out.println("Last Modified :"+f1.lastModified());
        System.out.println("Length of the File :"+f1.length());       
        


    }

}