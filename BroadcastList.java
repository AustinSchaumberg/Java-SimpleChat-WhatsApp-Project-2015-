
import java.util.List;

/**
 * This is the broadcast list class which captures information of a broadcast
 * list
 *
 * @author jmishra
 */
public class BroadcastList
{
	private String nickname;
	private List<String> members;
	

    //TODO: Add class fields here

    /**
     * Constructs a new instance of this class. nickname cannot be null or
     * empty. members cannot be null.
     *
     * @param nickname the nickname of the broadcast list
     * @param members the list of nicknames of all members of this list
     * @throws WhatsAppRuntimeException throw a new instance of this with
     * CANT_BE_EMPTY_OR_NULL message if the validation of nickname or members
     * fails
     *
     */
    public BroadcastList(String nickname, List<String> members) throws 
    WhatsAppRuntimeException
    {
        //TODO
    	this.nickname = nickname;
    	this.members = members;
    	try {
			// if the members ArrayList is empty, 
			// the console is displayed the message below.
			if(members.isEmpty())
			{
				throw new WhatsAppRuntimeException
				(Config.CANT_BE_EMPTY_OR_NULL);
			}
		// if no ArrayList of Recipes has been created yet, then it will
		// still prompt the user that no recipes are available.
		} catch (NullPointerException exception) 
		{
			throw new WhatsAppRuntimeException(Config.CANT_BE_EMPTY_OR_NULL);
		}
    }

    /**
     * A getter of the nickname
     *
     * @return the nickname of the broadcast list
     */
    public String getNickname()
    {
        //TODO
        return nickname;
    }

    /**
     * A setter of the nickname of this broadcast list
     *
     * @param nickname the nickname of this broadcast list
     */
    public void setNickname(String nickname)
    {
        //TODO
    	this.nickname = nickname;
    }

    /**
     * A getter of the list of members of this broadcast list
     *
     * @return the list of members of this broadcast list
     */
    public List<String> getMembers()
    {
        //TODO
        return members;
    }

    /**
     * A setter of the list of members of this broadcast list
     *
     * @param members the list of members of this broadcast list
     */
    public void setMembers(List<String> members)
    {
        //TODO
    	this.members = members;
    }

}
