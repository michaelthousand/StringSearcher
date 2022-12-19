import java.io.*;

public class StringSearcher {
    public static void main(String args[]) {
        // Checks for proper arugments
        if (args.length != 2 ) {
            System.out.println("Usage: java StringSearcher string filename");
            System.exit(0);
        }

        String str = args[0];
        String filename = args[1];
        int strCount = 0;

        // Opens a BufferedReader to utilize the readLine() method and search the text file for the string
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while (true) {
                line = br.readLine();

                // Stops the search at the end of the file
                if (line == null) {
                    break;
                } 

                if (line.contains(str)) {
                    ++strCount;
                }

            }
            fr.close();
            br.close();
            
        // Catch blocks for exception handling
        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } 

        System.out.println("There are " + strCount + " instances of that word in the file.");

    }
}
