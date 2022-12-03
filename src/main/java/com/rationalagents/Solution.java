package com.rationalagents;

import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
    Solution(){}
    static HashMap<String,Square> buildBoard(){
        HashMap<String,Square> board = new HashMap<>();
        Square s = null;
        Solution sol = new Solution();

        for( int i = 1; i <= 8 ; i++){
            for( int j = 'a'; j <= 'h' ; j++){
            s = sol.new Square( (char)j,i );
            board.put(s.getHash(),s);
            }
        }
        return board;
    }
    public class Square{
        char col = '\0';
        int row = 0;

        Square(char col, int row){
            this.col = col;
            this.row = row;
        }
        String getHash(){
            return Character.toString(this.col) + Integer.toString(this.row);
        }
        public String toString(){
          return this.getHash();
        }
    }
    public class Knight{
        Square square = null;
        Knight(Square s){
            this.square = s;
        }
        ArrayList<Square> getMoves(HashMap<String,Square> board){
            ArrayList<Square> moves = new ArrayList<>();
            Square s = null;

            //check all 8 
            s = new Square((char)(this.square.col - 2),this.square.row + 1);
            if(board.containsKey(s.getHash())){ moves.add(s);}

            s = new Square((char)(this.square.col - 2),this.square.row - 1);
            if(board.containsKey(s.getHash())){ moves.add(s);}

            s = new Square((char)(this.square.col + 2),this.square.row + 1);
            if(board.containsKey(s.getHash())){ moves.add(s);}

            s = new Square((char)(this.square.col + 2),this.square.row - 1);
            if(board.containsKey(s.getHash())){ moves.add(s);}


            s = new Square((char)(this.square.col + 1),this.square.row + 2);
            if(board.containsKey(s.getHash())){ moves.add(s);}

            s = new Square((char)(this.square.col - 1),this.square.row + 2);
            if(board.containsKey(s.getHash())){ moves.add(s);}

            s = new Square((char)(this.square.col + 1),this.square.row - 2);
            if(board.containsKey(s.getHash())){ moves.add(s);}

            s = new Square((char)(this.square.col - 1),this.square.row - 2);
            if(board.containsKey(s.getHash())){ moves.add(s);}

            return moves;
        }
    }
}
