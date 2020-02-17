class KnightsTour {
    //Making the chessboard
    int rows = 8;
    int cols = 8;
    private int chessBoard[][] = new int[rows][cols];

    public boolean validSquare(int r, int c) {
        if (r >= 0 && r < rows && c >= 0 && c < cols && chessBoard[r][c] == -1)
            return true;
        else
            return false;
    }

    public boolean knightPath(int x, int y, int nextMove, int moveX[], int moveY[]) {
        int square;
        int horizontalMove;
        int verticalMove;

        if (nextMove == rows * cols)
            return true;

        for (square = 0; square < rows; square++) {
            horizontalMove = x + moveX[square];
            verticalMove = y + moveY[square];
            if (validSquare(horizontalMove, verticalMove)) {
                chessBoard[horizontalMove][verticalMove] = nextMove;
                if (knightPath(horizontalMove, verticalMove, (1 + nextMove), moveX, moveY))
                    return true;
                else
                    chessBoard[horizontalMove][verticalMove] = -1;
            }
        }
        return false;
    }

    public boolean tour() {
        int r2;
        int c2;
        for (r2 = 0; r2 < rows; r2++) {
            for (c2 = 0; c2 < cols; c2++) {
                chessBoard[r2][c2] = -1;
            }
        }
        //possible moves for the knight piece
        int rowMove[] = {-1, -2, -2, -1, 1, 2, 2, 1};
        int colMove[] = {2, 1, -1, -2, -2, -1, 1, 2};

        chessBoard[0][0] = 0; //initialize knight's position

        if (!knightPath(0, 0, 1, rowMove, colMove)) {
            return false;
        } else {
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    System.out.print("   " + chessBoard[r][c]);
                }
                System.out.println();
            }
        }
        return true;
    }
}

