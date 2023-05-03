package filesandapi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

    private FileWriter writer;
    private FileReader reader;

    public FileUtil(FileWriter writer)  {
        this.writer = writer;
    }

    public FileUtil()  {
    }

    public void write(String nameFile, String text) throws IOException {
        writer = new FileWriter(nameFile,true);
        this.write(text);
    }
    public void write(String text) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(text);
        bufferedWriter.close();
    }

    public void read(String nameFile) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(nameFile));
        bufferedReader.lines().forEach(line -> System.out.println(line));
        bufferedReader.close();
    }
}
