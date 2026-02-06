import java.io.File;

public class FileDemo4 {

    public static void main(String[] args) {
        File f1 = new File("a/b/c");
        System.out.println(f1.mkdirs());
    }

}