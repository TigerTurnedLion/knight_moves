package com.rationalagents;

//import java.io.*;
import java.util.HashMap;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        String coor = "";

        
        Solution sol = new Solution();
        HashMap<String,Solution.Square> board = Solution.buildBoard();

        System.out.println("");
        System.out.println("Where's your knighty...?");
        coor = System.console().readLine();

        Solution.Square square = board.get(coor);
        Solution.Knight kn = sol.new Knight(square);
        ArrayList<Solution.Square> moves = kn.getMoves(board);

        System.out.println("");
        System.out.printf("Ya'll knight moves from %s: ",square.getHash());System.out.println(moves.size());
        System.out.println(moves);
        System.out.println("");
    }
}
