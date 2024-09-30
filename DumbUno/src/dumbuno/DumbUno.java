//This is an Uno game simulation.
//Created by James Vanderhyde, 30 September 2024
//Modified by Anthony Howard

package dumbuno;

import java.util.Random;

public class DumbUno
{
    private static final Random rng = new Random();
    
    public static void main(String[] args) 
    {
        final int maxHandSize = 12;
        final int minHandSize = 3;
        
        //Put the players into a circular linked list
        IntNode startPlayer = new IntNode(0,null);
        IntNode current = startPlayer;
        current.setNext(new IntNode(0,null));
        current = current.getNext();
        current.setNext(new IntNode(0,null));
        current = current.getNext();
        current.setNext(new IntNode(0,null));
        current = current.getNext();
        current.setNext(new IntNode(0,null));
        current = current.getNext();
        current.setNext(startPlayer);
        
        //Deal every player a hand
        current = startPlayer;
        while (current.getData() == 0)
        {
            
            current.setData(rng.nextInt( maxHandSize - minHandSize + 1) + minHandSize);
            current = current.getNext();
        }
        
        
        printGame(startPlayer);
        
        //Play the game
        current = startPlayer;
        while (current.getData() > 1)
        {
            //Student implementation
            System.out.println(current.getData());
            current = current.getNext();
                    current.setData(current.getData()-1);
            
        }
        System.out.println("I win!");
        
    }
    
    private static void printGame(IntNode startPlayer)
    {
        //Student implementation
        int players = 0;
        while (players < 5){
            players++;
                startPlayer=startPlayer.getNext();
                System.out.println(startPlayer.getData());
                }
    }
    
}
