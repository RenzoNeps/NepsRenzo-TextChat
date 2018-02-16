
import java.util.ArrayList;

/**
 * Write a description of class MessagePost here.
 *
 * @author Renzo neps
 * @version 2/14/2018
 */
public class Post
{
    private ArrayList<String> comments;
    private int likes;
    private String username;
    private long timestamp;
    
    /**
     * Constructor for objects of class MessagePost
     */
    public Post(String author)
    {
        comments = new ArrayList<String>();
        likes = 0;
        username = author;
        timestamp = System.currentTimeMillis();
    }

    /**
     * Subtracts likes
     */
    public void unlike()
    {
        if (likes > 0)
        {
            likes--;
        }
    }
    
    /**
     * Get the username
     */
    public String getUsername()
    {
        return username;
    }
    
    /**
     * Get the timestamp
     */
    public String getTimeStamp()
    {
        return timeString(timestamp);
    }
    
    public int getLikes()
    {
        return likes;
    }
    
    public ArrayList<String> getComments()
    {
        return comments;
    }
    
    public void display()
    {
        System.out.println(getTimeStamp());
        
        if (likes > 0)
        {
            System.out.println(" - " + getLikes() + " people like this");
        }
        else
        {
            System.out.println();
        }
        
        if (comments.isEmpty())
        {
            System.out.println("\tNo Comments");
        }
        else
        {
            System.out.println("");
        }
    }
    
    /**
     * Displays the exact time when the message was placed
     */
    private String timeString(long time)
    {
        long current = System.currentTimeMillis();
        long pastMillis = current - time; // Elapsed time
        
        long seconds = pastMillis / 1000;
        long minutes = seconds / 60;
        
        if (minutes > 0)
        {
            return minutes + " minute(s) ago.";
        }
        else
        {
            return seconds + " seconds(s) ago.";
        }
    }
}
