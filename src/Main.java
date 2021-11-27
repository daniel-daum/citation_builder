
import javax.swing.JFrame;

public class Main {

       public static void main(String[] args){
           //Main method for this program. Calls the static Method run()

        
       run();

    }

    public static void run(){
        //This method creates a JFrame Object from the Window Class. Sets the window title, close operation, and makes it visible.

        JFrame app = new Window();
        
        app.setTitle("Citation Builder");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
    
    
}
