package kotish.com;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerLoading {

    private static ServerSocket server;

    public static void main(String[] args){
        start();
        handle();
        end();
    }

    private static void start(){
        try{
            server = new ServerSocket(8888);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    private static void end(){
        try{
            server.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public static void handle(){
        while (true){
            try {
                Socket client = server.accept();
                new ClientHandle(client);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(10);
            }catch (InterruptedException ex){

            }
        }
    }
}
