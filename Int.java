import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Random;
public class Int {
    public static void main(String[] args) throws IOException
     {
        Random rand = new Random();
        int rand1 = rand.nextInt();
      for (int i = 0; i <= rand1; i++) {
        FileWriter fw = new FileWriter("num.txt", true);
        PrintWriter out = new PrintWriter(fw);
        out.println(i);
        out.close();
        fw.close();
        System.out.println(i);


      }  
    }
  }
  
  