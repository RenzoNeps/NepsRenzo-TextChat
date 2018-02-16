
/**
 * Write a description of class MessagePost here.
 *
 * @author Renzo Neps
 * @version 2/15/18
 */
public class MessagePost extends Post
{
    private String message;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String message, String author)
    {
        super(author);
        this.message = message;
    }
    
    /**
     * Get text
     */
    public String getText()
    {
        return message;
    }
    
    public void display()
    {
        super.display();
        System.out.println(getUsername() + " posted a message:");
        System.out.println("\t" + message);
    }
}
