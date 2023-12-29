import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("input.txt");
        File output = new File("output.txt");
        int count = 0;
        try {
            Scanner in = new Scanner(file);
            PrintWriter writer = new PrintWriter(output);
            while(in.hasNextInt()){
                count++;
                in.nextInt();
            }
            in.close();
            in = new Scanner(file);
            for (int i = 0;i<count;i++){
                int c = in.nextInt();
                if (i>=count/2){
                    writer.print(c+" ");
                }
            }
            in.close();
            in = new Scanner(file);
            for (int i = 0;i<count/2;i++){
                int c = in.nextInt();
                writer.print(c+" ");

            }
            writer.close();
            in.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
