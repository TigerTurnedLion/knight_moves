# knight_moves

## problem:
Write a function that takes the current position of a knight on a chessboard, 
and returns a preliminary list of possible moves the knight could make. 
(That is, the current positions of other pieces are not provided, 
so you can’t check against capturing pieces on the knight’s own side 
nor making their king vulnerable to capture.)

## algo:
1. create square data / obj that reps row and col with link to piece
Step 2. place squares into map with keys = col + row
Step 3. create knight object that calculates knight moves
Step 4. place knight on a square.
Step 5. check if map contains squares for possible moves.  If so, increment count per each square
Step 6. return count of squares that exist for moves.
