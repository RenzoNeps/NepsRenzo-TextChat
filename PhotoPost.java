
/**
 * Write a description of class PhotoPost here.
 *
 * @author Renzo Neps
 * @version 2/14/2018
 */
public class PhotoPost extends Post
{
    private String filename;
    private String caption;
    
    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String author,String filename, String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
    }

    /**
     * Return filename
     */
    public String getImageFile()
    {
        return filename;
    }
    
    public void display()
    {
        super.display();
        System.out.println("\t[" + filename + "]");
        System.out.println("\t" + caption);
    }
}
