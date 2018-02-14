
import java.util.ArrayList;

/**
 * Write a description of class NewsFeed here.
 *
 * @author Renzo Neps
 * @version 2/14/2018
 */
public class NewsFeed
{
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        photos = new ArrayList<PhotoPost>();
        messages = new ArrayList<MessagePost>();
    }

    /**
     * Adds a message to MessagePost
     */
    public void addMessagePost(MessagePost mp)
    {
        messages.add(mp);
    }
    
    /**
     * Adds a message to PhotoPost
     */
    public void addPhotoPost(PhotoPost pp)
    {
        photos.add(pp);
    }
}
