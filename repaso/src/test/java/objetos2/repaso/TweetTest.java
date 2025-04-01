package objetos2.repaso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class TweetTest {

	Tweet retweet, tweet, tweet0char, tweet281char;
	
	@BeforeEach
	void setUp() throws Exception {
		tweet = new Tweet("Hola mundo");
		retweet = new Tweet(tweet);
		tweet0char = new Tweet("");
		tweet281char = new Tweet("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam asdasdasdwahiuhgfslkjaghskjfhdslfhlsdafhdaskfhksadfhldshfkljdshflkjhdslfkjadhslkfdasfasdfsdfsadfsa");
	}
	
    @Test
    public void testTweet() {
        assertEquals("Hola mundo", tweet.getDescripcion());
    }

	public void testRetweet() {
		assertEquals(tweet, retweet.getOrigen());
	}

	public void testTweet0char() {
		assertEquals("", tweet0char.getDescripcion());
	}

	public void testTweet281char() {
		assertEquals("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam asdasdasdwahiuhgfslkjaghskjfhdslfhlsdafhdaskfhksadfhldshfkljdshflkjhdslfkjadhslkfdasfasdfsdfsadfsa", tweet281char.getDescripcion());
	}
}
