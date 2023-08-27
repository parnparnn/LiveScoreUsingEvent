/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livescoreusingevent;

import java.util.Scanner;

/**
 *
 * @author Akiparn
 */
public class LiveScoreUsingEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource source = new ScoreSource();
        Subscriber subscriber1 = new Subscriber();
        Subscriber subscriber2 = new Subscriber();
        source.addSubscriber(subscriber1);
        source.addSubscriber(subscriber2);
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Score  ");
            String scoreLine = scanner.nextLine();
            if (scoreLine.isEmpty()) {
                break;
            }
            source.setScoreLine(scoreLine);
        }
    }
}
