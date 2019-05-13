package src.main.java.bancomunday;


import static java.lang.System.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadAndWrite {

    public static void main(String file_location_name) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(file_location_name));
        scanner.useDelimiter(",");
        // while(scanner.hasNext()){
        //     System.out.print(scanner.next()+"|");
        // }

        while(scanner.hasNext()) {
           String lineOfText = scanner.nextLine();
           if (lineOfText.startsWith("#") || lineOfText.startsWith(" ") || lineOfText.startsWith("//")) {
              continue; //Exit this iteration if line starts with space or /
           }
           System.out.println(lineOfText);
        }

        scanner.close();
    }


}
