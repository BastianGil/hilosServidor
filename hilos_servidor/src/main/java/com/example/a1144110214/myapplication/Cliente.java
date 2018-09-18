package com.example.a1144110214.myapplication;

import android.util.Log;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente extends Thread {

    @Override
    public void run() {
        try {
            Socket s = new Socket("10.0.2.2",5000);

            OutputStream os = s.getOutputStream();
            PrintWriter out = new PrintWriter(new OutputStreamWriter(os));
            out.println("funciona");
            out.flush();

            Log.e("DEBUG", "LISTO");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
