public SumOrSameGame(int numRows, int numCols)
{
    grid = new int[numRows][numCols];

    for(int r = 0; r < grid.length; r++)
        for(int c = 0; c < grid[0].length; c++)
            grid[r][c] = (int) (Math.random() * 9) + 1;
}
