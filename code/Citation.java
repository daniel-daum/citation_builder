package code;
//  This class is a representation of a citation, according to 
//  my workplaces internal citation standards.

public class Citation{

    private String mAuthor;
    private String mTitle_classification;
    private String mTitle;
    private String mPublisher;
    private String mDate_published;
    private String mDate_accessed;
    private String mlink; 

    public Citation(){

    }

    public Citation(String pAuthor, String pTitle_classification, String pTitle, String pPublisher, String pDate_published, String pDate_accessed, String pLink){
        setAuthor(pAuthor);
        setTitle_classification(pTitle_classification);
        setTitle(pTitle);
        setPublisher(pPublisher);
        setDate_published(pDate_published);
        setDate_accessed(pDate_accessed);
        setLink(pLink);

    }

    public void setAuthor(String pAuthor){
        mAuthor = pAuthor;
    }

    public String getAuthor(){
        return mAuthor;
    }

    public void setTitle_classification(String pTitle_classifcation){
        mTitle_classification = pTitle_classifcation;
    }

    public String getTitle_classification(){
        return mTitle_classification;
    }

    public void setTitle(String pTitle){
        mTitle = pTitle;
    }

    public String getTitle(){
        return mTitle;
    }

    public void setPublisher(String pPublisher){
        mPublisher = pPublisher;
    }

    public String getPublisher(){
        return mPublisher;
    }

    public void setDate_published(String pDate_published){
        mDate_published = pDate_published;
    }

    public String getDate_published(){
        return mDate_published;
    }

    public void setDate_accessed(String pDate_accessed){
        mDate_accessed = pDate_accessed;
    }

    public String getDate_accessed(){
        return mDate_accessed;
    }

    public void setLink(String pLink){
        mlink = pLink;
    }

    public String getLink(){
        return mlink;
    }


}