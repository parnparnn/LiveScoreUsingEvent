/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescoreusingevent;

import java.util.EventObject;

/**
 *
 * @author Akiparn
 */
public class ScoreEvent extends EventObject {
    private String scoreLine;
    public String getScoreLine()
    {
        return scoreLine;
    }
    
    public ScoreEvent(Object source,String value) {
        super(source);
        scoreLine = value;
    }
    
}
