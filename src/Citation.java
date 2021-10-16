
public class Citation {
    //This class is intended to represent a citation in my organization.

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

    //Accessor and Mutator Methods
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

    public void setOverallDocumentClassified(String pOverallDocumentClassified){
        overallDocumentClassified = pOverallDocumentClassified;
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
        //This method builds the Citation by adding all of the object attribute strings togeather. 
        String result = "";

        result = getCitationClassification() + " " + getOriginator() + ", " + getSourceID() + ", " + getDate() + ", " + getTitleClassification() + " " + getTitle() + ", cited portion classified: " + getCitedPortionClassified() + ", overall document classified: " + getOverallDocumentClassified();

        return result;

    }

    public void checkNull(){
        //This returns true if each atrubute of the citation isntance is null.
        if(getCitationClassification().equals("") && getOriginator().equals("") && getSourceID().equals("") && getDate().equals("") && getTitleClassification().equals("") && getTitle().equals("") && getCitedPortionClassified().equals("") && getOverallDocumentClassified().equals("")){

            isNull = true;
        }
    }

    public boolean getNullStatus(){
        //Calls check null to retrun if the Citation object attributes are  null.
        checkNull();
        return isNull;
    }



}
