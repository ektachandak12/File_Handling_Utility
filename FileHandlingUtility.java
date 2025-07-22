import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileHandlingUtility {
    static String filePath = "NewSampleFile.txt";

    public static void main(String[] args) {
        createFile();
        writeToFile("Hello, this is a new sample file.");
        readFile();
        modifyFileContent("this", "This");
        readFile(); // Read after modification
        //deleteFile();
    }
        //Creating new file
        public static void createFile() {

            try {
                File myFile = new File(filePath);
                if (myFile.createNewFile()) {
                    System.out.println("File created " + myFile.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("Unable to create the file.");
                throw new RuntimeException(e);
            }
        }


        //Writing in the file
        public static void writeToFile (String content){
            try (FileWriter fileWriter = new FileWriter(filePath)) {

                fileWriter.write(content);
                System.out.println("Successfully wrote to the file. ");
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred while writing. ");
                throw new RuntimeException(e);
            }
        }

        //Reading a file
        public static void readFile () {
            System.out.println("----File Content----");
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                System.out.println("-----------------");
            } catch (IOException e) {
                System.out.println("An error occurred while reading.");

            }
        }

// 4. Modify the file content
        public static void modifyFileContent (String oldWord, String newWord){
            try {
                // Read all lines
                List<String> lines = Files.readAllLines(Paths.get(filePath));
                List<String> updatedLines = new ArrayList<>();

                // Modify each line
                for (String line : lines) {
                    updatedLines.add(line.replace(oldWord, newWord));
                }

                // Write back modified content
                Files.write(Paths.get(filePath), updatedLines);
                System.out.println("File content modified.");
            } catch (IOException e) {
                System.out.println("An error occurred during modification.");
                e.printStackTrace();
            }
        }

        // 5. Delete the file
        public static void deleteFile () {
            File file = new File(filePath);
            if (file.delete()) {
                System.out.println("Deleted the file: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        }
    }

