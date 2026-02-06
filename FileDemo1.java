import java.io.File;
import java.io.IOException;

class FileDemo1 {
    public static void main(String[] args) {

        File f1 = new File("demo1.txt");
        File f2 = new File("p1");
        File f3 = new File("p1", "demo2.txt");
        File f4 = new File("p2");
        File f5 = new File(f4, "demo1.txt");
        System.out.println(f2.mkdir());
        f4.mkdir();
        try {
            System.out.println(f1.createNewFile());
            f3.createNewFile();
            f5.createNewFile();
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println(e);
        }

    }

}