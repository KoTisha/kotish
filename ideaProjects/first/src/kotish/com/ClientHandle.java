package kotish.com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandle extends Thread{

    private final Socket client;

    public ClientHandle(Socket client){
        this.client = client;
        start();
    }

    @Override
    public void run(){
        while (true){
            try {
                DataInputStream dis = new DataInputStream(client.getInputStream());
                if(dis.available()>0){

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
