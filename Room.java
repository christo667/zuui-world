/*
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * @author  Michael Kolling and David J. Barnes
 * @version 1.0 (February 2002)
 */
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Room 
{
    private String description;
    private HashMap exits;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     */
    public void setExits(String direction, Room neighbor) {
        /*if(north != null)
            exits.put("north", north);
        if(east != null)
            exits.put("east", east);
        if(south != null)
            exits.put("south", south);
        if(west != null)
            exits.put("west", west);*/
        exits.put(direction, neighbor);
    }
    
    public Room getExit(String direction){
        return (Room)exits.get(direction);        
}

    public String getExitString() {
        String returnString = "Exits:";
        Set keys = exits.keySet();
        for(Iterator iter = keys.iterator(); iter.hasNext(); )
        returnString += " " + iter.next();
        return returnString;
    }
    /**
     * Return the description of the room (the one that was defined
     * in the constructor).
     */
    public String getDescription(){
        return description;
    }

}
