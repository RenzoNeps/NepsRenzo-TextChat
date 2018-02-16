
import java.util.ArrayList;

/**
 * Write a description of class NewsFeed here.
 *
 * @author Renzo Neps
 * @version 2/14/2018
 */
public class NewsFeed
{
    private ArrayList<Post> posts;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        posts = new ArrayList<Post>();
    }

    /**
     * Adds a message to Post
     */
    public void addPost(Post post)
    {
        posts.add(post);
    }
    
    public void display()
    {
        for (Post post : posts)
        {
            /*if(post.instanceOf(PhotoPost))
            {
                PhotoPost pp = (PhotoPost) post;
            }
            else
            {
                MessagePost mp = (MessagePost) post;
            }*/
            post.display();
            System.out.print("\r\r");
        }
    }
}
