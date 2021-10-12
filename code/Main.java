package code;

import javax.swing.JFrame;

public class Main {

       public static void main(String[] args){
        
        generateWindow();

    }

    public static void generateWindow(){

        JFrame app = new Window();
        
        app.setTitle("Citation Builder");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
    
    
}
