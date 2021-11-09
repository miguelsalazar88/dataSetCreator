package app;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        Random rnd = new Random();

        try {
            FileWriter myWriter = new FileWriter("src/files/dataSet.txt");
            for (int i = 1; i < 1000001; i++) {

                if(i%10==0){
                    myWriter.write(String.valueOf(rnd.nextInt(1000000)));
                    myWriter.write("\n");
                }
                else{
                    myWriter.write(String.valueOf(rnd.nextInt(1000000))+",");
                }
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
