package code;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.nio.Buffer;


public class Window extends JFrame {

    private JButton enter;
    private JPanel panelMain;
    private JTextField authorField;
    private JTextField title_classificationField;
    private JTextField titleField;
    private JTextField publisherField;
    private JTextField date_publishedField;
    private JTextField date_accessedField;
    private JTextField linkField;

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 200;

    public Window(){
        createFrame();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);        
    }


    public void createFrame(){

       enter = new JButton("Enter");
       
       panelMain = new JPanel();

       panelMain.add(enter);
       add(panelMain);
    }


}
