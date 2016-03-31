package org.apache.hadoop.raid;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;  
import java.net.Socket;  
import org.apache.hadoop.raid.ServeOneJabbr;

public class raidServer{  
    public static boolean raid=false;
    public void getstart() {  
        ServerSocket s = null;  
        Socket socket  = null;  
        try {  
            s = new ServerSocket(8080);  
            //等待新请求、否则一直阻塞  
            System.out.println("wait for client");  
            while(true){  
                socket = s.accept();  
                System.out.println("socket:"+socket);  
                new ServeOneJabbr(socket);                   
            }  
        } catch (Exception e) {  
            try {  
                socket.close();  
            } catch (IOException e1) {  
                // TODO Auto-generated catch block  
                e1.printStackTrace();  
            }  
        }finally{  
            try {  
                s.close();  
            } catch (IOException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
          
  
    }  
  
}  


