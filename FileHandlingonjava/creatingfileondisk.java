package FileHandlingonjava;
import java.io.File;
import java.io.IOException;

public class creatingfileondisk {
    public static void main(String[] args) throws IOException {

        {
            File file = new File("nul","null");
            file.createNewFile();
            System.out.println("File Created");
        }
        
    }
}



