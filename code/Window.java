package code;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class Window extends JFrame {

    private JButton submit;
    private JPanel panelMain;

    private JLabel authorLabel;
    private JLabel title_classificationLabel;
    private JLabel titleLabel;
    private JLabel publisherLabel;
    private JLabel date_publishedLabel;
    private JLabel date_accessedLabel;
    private JLabel linkLabel; 
    
    private JTextField authorField;
    private JTextField title_classificationField;
    private JTextField titleField;
    private JTextField publisherField;
    private JTextField date_publishedField;
    private JTextField date_accessedField;
    private JTextField linkField;
    
    private final int FIELD_WIDTH = 10;
    private final int FRAME_WIDTH = 500;
    private final int FRAME_HEIGHT = 200;

    public Window(){
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);    
        
    }

    public void createPanel(){

        panelMain = new JPanel();

        panelMain.add(createLabel(authorLabel, "Author:"));
        panelMain.add(createField(authorField, getFieldWidth()));

        panelMain.add(createLabel(title_classificationLabel, "Title Classification:"));
        panelMain.add(createField(title_classificationField, getFieldWidth()));

        panelMain.add(createLabel(titleLabel, "Title:"));
        panelMain.add(createField(titleField, getFieldWidth()));

        panelMain.add(createLabel(publisherLabel, "Publishing Organization:"));
        panelMain.add(createField(publisherField, getFieldWidth()));

        panelMain.add(createLabel(date_publishedLabel, "Date Published:"));
        panelMain.add(createField(date_publishedField, getFieldWidth()));

        panelMain.add(createLabel(date_accessedLabel, "Date Accessed:"));
        panelMain.add(createField(date_accessedField, getFieldWidth()));

        panelMain.add(createLabel(linkLabel, "Link:"));
        panelMain.add(createField(linkField, getFieldWidth()));     

        panelMain.add(createButton(submit, "Submit"));
    
        add(panelMain);
    }

    public JLabel createLabel(JLabel pLabel, String pLabelTitle){

        pLabel = new JLabel(pLabelTitle);
        
        return pLabel;
    }


    public JTextField createField(JTextField pField, int pSize){

        pField = new JTextField(pSize);

        return pField;
    }

    public JButton createButton(JButton pButton, String pButtonText){
        pButton = new JButton(pButtonText);

        return pButton;
    }
     
    public int getFieldWidth(){
        return FIELD_WIDTH;
    }




}
