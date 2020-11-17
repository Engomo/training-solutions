package filescanner.bucketlist;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class BucketList {

    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(Path.of("BucketList.txt"))){
            while (scanner.hasNextLine()) {
                String line =scanner.nextLine();
                System.out.println(line);
            }
        }catch (IOException ioe){
            System.out.println("Cannot read BucketList.txt file.");
        }
    }
}
