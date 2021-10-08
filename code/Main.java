package code;

import javax.swing.JFrame;

public class Main {

       public static void main(String[] args){
        run();

    }

    public static void run(){
        JFrame app = new Window();
        
        app.setTitle("Citation Builder");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
    
}
