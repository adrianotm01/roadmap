package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import filesandapi.ApiUtil;
import filesandapi.FileUtil;
import filesandapi.serialization.Person;
import socket.Server;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException, ClassNotFoundException {
        FileUtil fileUtil = new FileUtil();
        fileUtil.write("C:\\Users\\adriano.junior\\Downloads\\text.txt", "TESTEANDOdsadsadas dsasadsa");
        fileUtil.read("C:\\Users\\adriano.junior\\Downloads\\text.txt");

        ApiUtil apiUtil = new ApiUtil(HttpClient.newBuilder().build());
        apiUtil.callGet("https://api.adoptapet.com/search/pets_at_shelter?key=A34F48&v=1&output=xml&shelter_id=2342");

        callSerialization();
        System.out.println(callDeserialization().getAge());

    }

    public static void callSerialization() throws IOException {
        Person pe = new Person("male", "leus",10);
        FileOutputStream file = new FileOutputStream("C:\\Users\\adriano.junior\\Downloads\\teste.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
        objectOutputStream.writeObject(pe);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public static Person callDeserialization() throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\adriano.junior\\Downloads\\teste.txt"));
        Person person = (Person) inputStream.readObject();
        inputStream.close();
        return person;
    }

    public static Server createServer() throws IOException {
        return new Server(2052);
    }
}
