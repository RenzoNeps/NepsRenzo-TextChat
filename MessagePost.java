
import java.util.ArrayList;

/**
 * Write a description of class MessagePost here.
 *
 * @author Renzo neps
 * @version 2/14/2018
 */
public class MessagePost
{
    private ArrayList<String> comments;
    private int likes;
    private String message;
    private String username;
    private long timestamp;
    
    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String text, String name)
    {
        comments = new ArrayList<String>();
        likes = 0;
        username = name;
        message = text;
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
     * Get the message
     */
    public String getText()
    {
        return message;
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
    public long getTimeStamp()
    {
        return timestamp;
    }
    
    /**
     * Displays the message
     */
    public void display()
    {
        System.out.println(username);
        System.out.println(message);
        System.out.println(timeString(timestamp));
        
        // Likes
        if (likes > 0)
        {
            System.out.println(" - " + likes + " people like this.");
        }
        else
        {
            System.out.println();
        }
        
        // Comments
        if (comments.isEmpty())
        {
            System.out.println("\tNo Comments.");
        }
        else
        {
            System.out.println("\t" + comments.size() + " comment(s). Click here to view.");
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
