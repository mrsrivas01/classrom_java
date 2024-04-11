import java.util.*;
import java.io.*;
public class Arrays{
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output=new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(input.readLine());
        String[] arr=new String[4];
        output.println(arr[0]);//1.1 null;

        //1.2
         for(String num:arr){
             output.print(num+" ");
         }
         output.println();
         int [] str=new int[4];
         output.println(Arrays.toString(str));
        output.close();
    }
}

/*
 1.1 null is the special type of the literal that can not assign to the primtive it can only
     assign with the non primitive data type it is similar as python none;
      String str=null // output not throws error assign this to str reference variable
      int num=null// throws error
 */
/*
 1.2 to print this array we use for-each loop and array toString method
 */