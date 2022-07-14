package day5;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    //later - throws IOException
    public static void main(String[] args) throws IOException {
        File folder = new File("h:\\devops");

        File file = new File("h:\\revature.txt");
        if(file.exists()){
            System.out.println("File reavature.txt exists");
        }
        else {
            System.out.println("File does not exists and created");
            file.createNewFile();
        }

        String allFileContents[] = folder.list();

        for(String temp:allFileContents){
            int i = temp.indexOf(".");
            if(i==-1){
                System.out.println(temp+ "   is a folder ");
            }
            else {
                System.out.println(temp+ "   is a file ");
            }
        }

    }
}
