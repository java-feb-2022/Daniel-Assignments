import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello, " + name + ", so happy to see you...";
    }

    public String guestGreeting(String dayPeriod, String name) {
        String greeting = String.format("Good %s, %s, lovely to see you!", dayPeriod, name);
        return greeting;
        //return "Good " + dayPeriod + ", " + name + ", lovely to see you!";
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "Todays date is " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.indexOf("Alexis") >= 0) {
            return "Right away. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.indexOf("Alfred") >= 0) {
            return "At your service. As you wish, naturally.";
        }
        else {
            return "Right. And with that I shall retire.";
        }
        
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

