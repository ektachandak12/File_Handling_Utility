##📄 FileHandlingUtility – Java File Operations
This project demonstrates basic file handling operations in Java, including:

Creating a new file

Writing content to the file

Reading content from the file

Modifying file content

Deleting the file

📁 File: FileHandlingUtility.java

##🛠️ Features Implemented
Operation	Description
✅ File Creation -	Creates a new file named NewSampleFile.txt if it does not already exist.
✅ File Writing - Writes a given string to the file, replacing any existing content.
✅ File Reading  - 	Reads and displays the contents of the file line-by-line.
✅ File Modifying - Searches for a specific word in the file and replaces it with another.
✅ File Deletion - Deletes the file from the system.

##🔍 Method Descriptions
1. createFile()
Purpose: Creates a new file if it doesn't already exist.

Logic: Uses File.createNewFile() from java.io package.

2. writeToFile(String content)
Purpose: Writes the given content to the file.

Note: Overwrites existing content if the file already has data.

3. readFile()
Purpose: Reads and prints each line of the file using BufferedReader.

4. modifyFileContent(String oldWord, String newWord)
Purpose: Replaces all occurrences of oldWord with newWord in the file.

Steps:

Reads all lines using Files.readAllLines().

Uses String.replace() on each line.

Writes updated lines back to the file.

5. deleteFile()
Purpose: Deletes the file from the filesystem using File.delete().

##🧪 Sample Output

File created NewSampleFile.txt
Successfully wrote to the file.
----File Content----
Hello, this is a new sample file.
-----------------
File content modified.
----File Content----
Hello, This is a new sample file.
-----------------

##🧑‍💻 How to Run
Make sure Java is installed.

Save the code as FileHandlingUtility.java.

Compile and run using the terminal:

javac FileHandlingUtility.java
java FileHandlingUtility

##📌 Notes
Ensure you have write permissions in the directory to create/delete files.

Uncomment deleteFile() in main() if you want to test the deletion operation.

##📂 Author
Ekta Naresh Chandak
Second-Year B.Tech Student | Artificial Intelligence and Data Science
