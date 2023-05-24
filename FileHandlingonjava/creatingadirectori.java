package FileHandlingonjava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public interface creatingadirectori {

    public static void main(String[] args) throws IOException  {
        {
            File directory = new File("study");
            directory.mkdirs();
            File file = new File("nul","null");
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("File Created");
            System.out.println("Dire");

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            /*
             * Scanner vs Buffered reader
             * 
             * Scanner is more slow and Buffered has a better  performance
             * Scanner is for small files anad Buffered reader is for large files.
             */
        }
    }
    
}
