import java.io.*;
import java.util.*;
public class HelloWorld {
    public static void main(String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
        out.println("Hello World");
        int a=Integer.parseInt(in.readLine());
        out.println(a);
        out.close();
    }
}
