package javaSession4;

import java.io.File;
import java.io.IOException;

public class IOTester {
    public static void main(String[] args) {
        try {
            //Using FileUtils
        	FileUtility();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void FileUtility() throws IOException {
        //get the file object
        File file = FileUtils.getFile("input.txt");

        //get the temp directory
        File tmpDir = FileUtils.getTempDirectory();

        System.out.println(tmpDir.getName());

        //copy file to temp directory
        FileUtils.copyFileToDirectory(file, tmpDir);

        //create a new file
        File newTempFile = FileUtils.getFile(tmpDir, file.getName());

        //get the content
        String data = FileUtils.readFileToString(newTempFile, Charset.defaultCharset());

        //print the content
        System.out.println(data);
    }
}