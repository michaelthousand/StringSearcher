import java.io.*;

public class StringSearcher {
    public static void main(String args[]) {
        if (args.length != 2 ) {
            System.out.println("Usage: java Module8 string filename");
            System.exit(0);
        }

        String str = args[0];
        String filename = args[1];
        int strCount = 0;

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while (true) {
                line = br.readLine();

                if (line == null) {
                    break;
                } 

                if (line.contains(str)) {
                    ++strCount;
                }

            }
            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } 

        System.out.println("There are " + strCount + " instances of that word in the file.");

    }
}
