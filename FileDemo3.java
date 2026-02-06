import java.io.File;
import java.io.IOException;

class FileDemo3 {
    public static void main(String[] args) {

        //File f1 = new File("demo1.txt");
        //System.out.println(f1.delete());

        int fileCount=0,dirCount=0;

        File f2=new File(".");
        File f3=null;

        String []s=f2.list();

        for(String s1:s){
            f3=new File(s1);
            if(f3.isFile()){
                fileCount++;
            }
            if(f3.isDirectory()){
                dirCount++;
            }
            //System.out.println(s1);
            
        }

        System.out.println("Total Files :"+fileCount);
        System.out.println("Total Directories :"+dirCount);

        
    }
}