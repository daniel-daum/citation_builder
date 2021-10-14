package code;

public class Citation {

    private String citationClassification;
    private String originator;
    private String sourceID;
    private String date;
    private String titleClassification;
    private String title; 
    private String citedPortionClassified;
    private String overallDocumentClassified; 
    private String builtCitation;
    private boolean isNull = false; 
    
    public Citation(){
        
    }

    public Citation(String pCitationClassification, String pOriginator, String pSourceID, String pDate, String pTitleClassification, String pTitle, String pCitedPortionClassified, String pOverallDocumentClassified){
        setCitationClassification(pCitationClassification);
        setOriginator(pOriginator);
        setSourceID(pSourceID);
        setDate(pDate);
        setTitleClassification(pTitleClassification);
        setTitle(pTitle);
        setCitationClassification(pCitationClassification);
        setOverallDocumentClassified(pOverallDocumentClassified);

    }

    public void setCitationClassification(String pCitationClassification){
        citationClassification = pCitationClassification;
    }

    public String getCitationClassification(){
        return citationClassification;
    }

    public void setOriginator(String pOriginator){
        originator = pOriginator;
    }

    public String getOriginator(){
        return originator;
    }

    public void setSourceID(String pSourceID){
        sourceID = pSourceID;
    }

    public String getSourceID(){
        return sourceID;
    }

    public void setDate(String pDate){
        date = pDate;
    }

    public String getDate(){
        return date;
    }

    public void setTitleClassification(String pTitleClassification){
        titleClassification = pTitleClassification;
    }

    public String getTitleClassification(){
        return titleClassification;
    }

    public void setTitle(String pTitle){
        title = pTitle;
    }

    public String getTitle(){
        return title;
    }

    public void setCitedPortionClassified(String pCitedPortionClassified){
        citedPortionClassified = pCitedPortionClassified;
    }

    public String getCitedPortionClassified(){
        return citedPortionClassified;
    }

    public void setOverallDocumentClassified(String pOverallDocumentClassifed){
        overallDocumentClassified = pOverallDocumentClassifed;
    }

    public String getOverallDocumentClassified(){
        return overallDocumentClassified;
    }

    public void setBuiltCitation(){
        builtCitation = buildCitation();

    }

    public String getBuiltCitation(){
        return builtCitation;
    }

    public String buildCitation(){
        String result = "";

        result = getCitationClassification() + " " + getOriginator() + ", " + getSourceID() + ", " + getDate() + ", " + getTitleClassification() + " " + getTitle() + ", cited portion classified: " + getCitedPortionClassified() + ", overall document classified: " + getOverallDocumentClassified();

        return result;

    }

    public void checkNull(){
        if(getCitationClassification().equals("") && getOriginator().equals("") && getSourceID().equals("") && getDate().equals("") && getTitleClassification().equals("") && getTitle().equals("") && getCitedPortionClassified().equals("") && getOverallDocumentClassified().equals("")){

            isNull = true;
        }
    }

    public boolean getNullStatus(){
        checkNull();
        return isNull;
    }



}
