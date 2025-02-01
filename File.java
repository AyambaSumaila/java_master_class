import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class File {

    public static void main(String[] args) throws FileNotFoundException {
        

     try (PrintWriter outputFile = new PrintWriter("students2.txt")) {

    outputFile.println("Adam");

    }

    }

    
}
