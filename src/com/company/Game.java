package com.company;

import java.util.Scanner;

/**
 * Created by Sean Whitfield on 6/6/2017.
 */
public class Game
{

    Scanner input = new Scanner(System.in);
    char currentPlayer;

//Defining variables
    private boolean running;

//Constructor
    public Game()
    {
        this.running = true;
        this.currentPlayer = 'x';


    }


  public boolean run()
  {
      System.out.println("run() has been executed");

      // decide which player goes first
            // pvt void player
      // get input
      // receive and display moves
      // if statement for has anyone won
      // Advanced graphics

      //waits for input "blocking function" nothing happens until it finishes
      String notScanner = input.nextLine();
      System.out.println("You wrote " + notScanner);


      return this.running;

  }

  // Gets input from user. returns an array where getInput[0]
  //  == x coordinate and getInput[1] == y coordinate
  private int[] getInput()
    {
        // input[0] == x coordinate
        // input [1] == y coordinate
        int[] input = new int[2];

        int[][] grid = new int[3][3];
        /*

        1,1  1,2  1,3

        2,1  2,2
         */

        return null;
    }


}
