
import java.io.BufferedReader;
import java.io.IOException;
// import java.io.BufferedWriter;
import java.io.InputStreamReader;
// import java.util.Scanner;

import memento.*;

public class EditorDeTexto {

    private String canvas;
    private CareTaker ct = new CareTaker();

    public EditorDeTexto(String canvas){
        this.setCanvas(canvas);
    }

    public String getCanvas() {
        return canvas;
    }

    public void setCanvas(String canvas) {
        this.canvas = canvas;
    }

    public void escrever(){
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        try {
            input = s.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        this.ct.addMemento(new Memento<String>(canvas));
        this.canvas += input + "\n";
        
    }

    public void ler(){
        System.out.println(this.canvas);
    }

    public void ctrlZ(){
        this.canvas = this.ct.getLastMemento().getState();
    }
}
