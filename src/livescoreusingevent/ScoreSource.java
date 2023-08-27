/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescoreusingevent;

import java.util.ArrayList;

/**
 *
 * @author Akiparn
 */
public class ScoreSource {
    ArrayList<ScoreListener> subscribers ;
    public ScoreSource()
    {
        subscribers  = new ArrayList<>();
    }
    public void addSubscriber(ScoreListener subscriber)
    {
        subscribers .add(subscriber);
    }
    public void setScoreLine(String scoreLine)
    {
        notifySubscribers(new ScoreEvent(this,scoreLine));
    }
    public void notifySubscribers(ScoreEvent evt)
    {
        for(ScoreListener  subscriber : subscribers)
        {
            subscriber.scoreChange(evt);
        }
    }
}
