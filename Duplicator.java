import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class Duplicator {
    public static void main(String[] args) throws IOException
     {
        Scanner input = new Scanner(System.in);
        System.out.println("enter string to be duplicated");
        String str = input.nextLine();
        long start = System.currentTimeMillis();
        long duration = start + 10000;
        while(start < duration){
            FileWriter fw = new FileWriter("text.txt", true);
            PrintWriter out = new PrintWriter(fw);
            out.println(str);
            out.close();
            fw.close();
            System.out.println(str);
      }  
    }
  }