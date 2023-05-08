package main.java.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket;

    private Integer port;

    public Server(Integer port) throws IOException {
        this.port = port;
        this.serverSocket = new ServerSocket(port);
        System.out.println("ABERTO CONEXÃO NA PORTA "+this.port);
        System.out.println("HOSTNAME: "+serverSocket.getInetAddress().getHostName());
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void close() throws IOException {
        this.serverSocket.close();
    }

    public Socket connect() throws IOException {
        return this.serverSocket.accept();
    }
}
