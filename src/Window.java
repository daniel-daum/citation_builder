

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Window extends JFrame implements ActionListener{

    private Citation citation;
    private JButton buildButton;
    private JTextArea textArea; 
    private JPanel gridPanel;
    private JPanel borderPanel;
    private JPanel buttonPanel;
    
    private JLabel citationClassificationLabel;
    private JLabel originatorLabel;
    private JLabel sourceIDLabel;
    private JLabel dateLabel;
    private JLabel sourceTitleClassificationLabel;
    private JLabel sourceTitleLabel;
    private JLabel citedPortionClassifiedLabel;
    private JLabel overallDocumentClassifiedLabel;

    private JTextField citationClassificationField;
    private JTextField originatorField; 
    private JTextField sourceIDField;
    private JTextField dateField;
    private JTextField sourceTitleClassificationField;
    private JTextField sourceTitleField; 
    private JTextField citedPortionClassifiedField; 
    private JTextField overallDocumentClassifiedField; 

    private final int FIELD_WIDTH = 40;
    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 400;
    private final int ROWS = 1;
    private final int COLUMNS = 0;

    private final String CITATION_CLASSIFICATION = "Citation Classification:";
    private final String ORIGINATOR = "Originator:";
    private final String SOURCE_ID = "Source ID:";
    private final String DATE = "Date:";
    private final String SOURCE_TITLE_CLASSIFICATION = "Source Title Classification:";
    private final String SOURCE_TITLE = "Source Title:";
    private final String CITED_PORTION_CLASSIFIED = "Cited Portion Classified:";
    private final String OVERALL_DOCUMENT_CLASSIFIED_TEXT = "Overall Document Classified:";
    private final String BUILD_BUTTON = "Build";
    
    public Window(){
        createComponents();
        createPanel();
        setSize(getFRAME_WIDTH(),getFRAME_HEIGHT()); 

    }

    public void createComponents(){

        setCitationClassificationLabel(getCITATION_CLASSIFICATION());
        setCitationClassifiedField(getFIELD_WIDTH());

        setOriginatorLabel(getORIGINATOR());
        setOriginatorField(getFIELD_WIDTH());

        setSourceIDLabel(getSOURCE_ID());
        setSourceIDField(getFIELD_WIDTH());

        setDateLabel(getDATE());
        setDateField(getFIELD_WIDTH());

        setSourceTitleClassificationLabel(getSOURCE_TITLE_CLASSIFICATION());
        setSourceTitleClassificationField(getFIELD_WIDTH());

        setSourceTitleLabel(getSOURCE_TITLE());
        setSourceTitleField(getFIELD_WIDTH());

        setCitedPortionClassifiedLabel(getCITED_PORTION_CLASSIFIED());
        setCitedPortionClassifiedField(getFIELD_WIDTH());

        setOverallDocumentClassifiedLabel(getOVERALL_DOCUMENT_CLASSIFIED());
        setOverallDocumentClassifiedField(getFIELD_WIDTH());

        setBuildButton(getBUILD_BUTTON_TEXT());
        
        //Setting Horizontal Text Alignment for all JLabels to CENTER

        getCitationClassificationLabel().setHorizontalAlignment(JLabel.CENTER);
        getOriginatorLabel().setHorizontalAlignment(JLabel.CENTER);
        getSourceIDLabel().setHorizontalAlignment(JLabel.CENTER);
        getDateLabel().setHorizontalAlignment(JLabel.CENTER);
        getSourceTitleClassificationLabel().setHorizontalAlignment(JLabel.CENTER);
        getSourceTitleLabel().setHorizontalAlignment(JLabel.CENTER);
        getCitedPortionClassifiedLabel().setHorizontalAlignment(JLabel.CENTER);
        getOverallDocumentClassifiedLabel().setHorizontalAlignment(JLabel.CENTER);
    }

    public void createPanel(){

        gridPanel = new JPanel(new GridLayout(8,2,0,10));

        gridPanel.add(getCitationClassificationLabel());
        gridPanel.add(getCitationClassifiedField());

        gridPanel.add(getOriginatorLabel());
        gridPanel.add(getOriginatorField());

        gridPanel.add(getSourceIDLabel());
        gridPanel.add(getSourceIDField());

        gridPanel.add(getDateLabel());
        gridPanel.add(getDateField());

        gridPanel.add(getSourceTitleClassificationLabel());
        gridPanel.add(getSourceTitleClassificationField());

        gridPanel.add(getSourceTitleLabel());
        gridPanel.add(getSourceTitleField());

        gridPanel.add(getCitedPortionClassifiedLabel());
        gridPanel.add(getCitedPortionClassifiedField());

        gridPanel.add(getOverallDocumentClassifiedLabel());
        gridPanel.add(getOverallDocumentClassifiedField());

        buttonPanel = new JPanel();
        getBuildButton().addActionListener(this);
        buttonPanel.add(getBuildButton());        

        borderPanel = new JPanel();
        borderPanel.setLayout(new BorderLayout());
        borderPanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        borderPanel.add(gridPanel, BorderLayout.CENTER);
        borderPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(borderPanel);     
        
    }

    @Override
    public void actionPerformed(ActionEvent pEvent){
        
        if(pEvent.getActionCommand().equals("Build")){
             
            citation = new Citation();

            citation.setCitationClassification(getCitationClassifiedField().getText().trim());
            citation.setOriginator(getOriginatorField().getText().trim());
            citation.setSourceID(getSourceIDField().getText().trim());
            citation.setDate(getDateField().getText().trim());
            citation.setTitleClassification(getSourceTitleClassificationField().getText().trim());
            citation.setTitle(getSourceTitleField().getText().trim());
            citation.setCitedPortionClassified(getCitedPortionClassifiedField().getText().trim());
            citation.setOverallDocumentClassified(getOverallDocumentClassifiedField().getText().trim());

           citation.setBuiltCitation();

           if(citation.getNullStatus()){
            
            JOptionPane.showMessageDialog(null, "No citation information has been entered.", "Notification", JOptionPane.INFORMATION_MESSAGE );


           }
           else{   setTextArea();
            textArea.setText(citation.getBuiltCitation());
            textArea.setEnabled(true);

            JOptionPane.showMessageDialog(null, textArea, "Completed Citation", JOptionPane.INFORMATION_MESSAGE );

           }
        }

         
                
        
    }

    public void setCitationClassificationLabel(String pLabelText){
        citationClassificationLabel = new JLabel(pLabelText);
    }

    public JLabel getCitationClassificationLabel(){
        return citationClassificationLabel;
    }

    public void setOriginatorLabel(String pLabelText){
        originatorLabel = new JLabel(pLabelText);
    }

    public JLabel getOriginatorLabel(){
        return originatorLabel;
    }

    public void setSourceIDLabel(String pLabelText){
        sourceIDLabel = new JLabel(pLabelText);
    }

    public JLabel getSourceIDLabel(){
        return sourceIDLabel;
    }

    public void setDateLabel(String pLabelText){
        dateLabel = new JLabel(pLabelText);
    }

    public JLabel getDateLabel(){
        return dateLabel;
    }

    public void setSourceTitleClassificationLabel(String pLabelText){
        sourceTitleClassificationLabel = new JLabel(pLabelText);
    }

    public JLabel getSourceTitleClassificationLabel(){
        return sourceTitleClassificationLabel;
    }

    public void setSourceTitleLabel(String pLabelText){
        sourceTitleLabel = new JLabel(pLabelText);
    }

    public JLabel getSourceTitleLabel(){
        return sourceTitleLabel;
    }

    public void setCitedPortionClassifiedLabel(String pLabelText){
        citedPortionClassifiedLabel = new JLabel(pLabelText);
    }

    public JLabel getCitedPortionClassifiedLabel(){
        return citedPortionClassifiedLabel;
    }

    public void setOverallDocumentClassifiedLabel(String pLabelText){
        overallDocumentClassifiedLabel = new JLabel(pLabelText);
    }

    public JLabel getOverallDocumentClassifiedLabel(){
        return overallDocumentClassifiedLabel;
    }

    public void setCitationClassifiedField(int pFieldWidth){
        citationClassificationField = new JTextField(pFieldWidth);
    }

    public JTextField getCitationClassifiedField(){
        return citationClassificationField;
    }

    public void setOriginatorField(int pFieldWidth){
        originatorField = new JTextField(pFieldWidth);
    }

    public JTextField getOriginatorField(){
        return originatorField;
    }

    public void setSourceIDField(int pFieldWidth){
        sourceIDField = new JTextField(pFieldWidth);
    }

    public JTextField getSourceIDField(){
        return sourceIDField;
    }

    public void setDateField(int pFieldWidth){
        dateField = new JTextField(pFieldWidth);
    }

    public JTextField getDateField(){
        return dateField;
    }

    public void setSourceTitleClassificationField(int pFieldWidth){
        sourceTitleClassificationField = new JTextField(pFieldWidth);
    }

    public JTextField getSourceTitleClassificationField(){
        return sourceTitleClassificationField;
    }

    public void setSourceTitleField(int pFieldWidth){
        sourceTitleField = new JTextField(pFieldWidth);
    }

    public JTextField getSourceTitleField(){
        return sourceTitleField;
    }

    public void setCitedPortionClassifiedField(int pFieldWidth){
        citedPortionClassifiedField = new JTextField(pFieldWidth);
    }

    public JTextField getCitedPortionClassifiedField(){
        return citedPortionClassifiedField;
    }

    public void setOverallDocumentClassifiedField(int pFieldWidth){
        overallDocumentClassifiedField = new JTextField(pFieldWidth);
    }

    public JTextField getOverallDocumentClassifiedField(){
        return overallDocumentClassifiedField;
    }

    public void setTextArea(){
        textArea = new JTextArea(getROWS(), getCOLUMNS());

    }

    public JTextArea getTextArea(){
        return textArea;
    }

    public void setBuildButton(String pButtonText){
        buildButton = new JButton(pButtonText);
    }

    public JButton getBuildButton(){
        return buildButton;
    }

    public int getFIELD_WIDTH(){
        return FIELD_WIDTH;
    }

    public int getFRAME_WIDTH(){
        return FRAME_WIDTH;
    }

    public int getFRAME_HEIGHT(){
        return FRAME_HEIGHT;
    }

    public String getCITATION_CLASSIFICATION(){
        return CITATION_CLASSIFICATION;
    }

    public String getORIGINATOR(){
        return ORIGINATOR;
    }

    public String getSOURCE_ID(){
        return SOURCE_ID;
    }

    public String getDATE(){
        return DATE;
    }

    public String getSOURCE_TITLE_CLASSIFICATION(){
        return SOURCE_TITLE_CLASSIFICATION;
    }

    public String getSOURCE_TITLE(){
        return SOURCE_TITLE;
    }

    public String getCITED_PORTION_CLASSIFIED(){
        return CITED_PORTION_CLASSIFIED;
    }

    public String getOVERALL_DOCUMENT_CLASSIFIED(){
        return OVERALL_DOCUMENT_CLASSIFIED_TEXT;
    }

    public String getBUILD_BUTTON_TEXT(){
        return BUILD_BUTTON;
    }

    public int getROWS(){
        return ROWS;
    }

    public int getCOLUMNS(){
        return COLUMNS;
    }

}

