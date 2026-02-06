import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
class Customer{
    int cid;
    String cname;

    Customer(int cid,String cname){
        this.cid=cid;
        this.cname=cname;
    }

    @Override
    public String toString(){
        return "Customer ID :"+cid+" Customer Name :"+cname;
    }
}
public class PrintWriterDemo{

    public static void main(String[] args){

        PrintWriter pw=null;
        File f1=new File("employees.txt");
        FileWriter fw=null;
        try{
            fw=new FileWriter(f1,true);
            pw=new PrintWriter(fw,true);
            pw.println("Welcome");
            pw.print("Hello");
            pw.write(97);
            Customer c1=new Customer(1,"Prudhvi");
            pw.println(c1);
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
        finally{
            pw.close();
        }
    }
    
}