package day5;

import java.io.File;
import java.io.IOException;

public class FileExercise {
    public static void main(String[] args) throws IOException {
        File f1 = new File("h:\\Batch\\BatchMates.txt");
        File f2 = new File("h:\\Batch");
        if(f2.exists() && f2.isDirectory()){
            System.out.println("Folder batch already exists");
        }
        else {
                f2.mkdir();
            System.out.println("Successfully created the folder -Batch");
        }
        System.out.println("Creating BatchMates.txt inside "+f2.getAbsolutePath());
        f1.createNewFile();
    }
}
