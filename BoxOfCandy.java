public class BoxOfCandy
{
    public Candy[][] box;

    /**
    * Moves one piece of candy in column col, if necessary and possible, so that the box
    * element in row 0 of column col contains a piece of candy, as described in part (a).
    * Returns false if there is no piece of candy in column col and returns true otherwise.
    * Precondition: col is a valid column index in box.
    */
    public boolean moveCandyToFirstRow(int col)
    {
        if (null != box[0][col]) return true;
        for (int row = 1; row < box.length; row++)
        {
            if (null != box[row][col])
            {
                box[0][col] = box[row][col];
                box[row][col] = null;
                return true;
            }
        } return false;
    }

    /**
    * Removes from box and returns a piece of candy with flavor specified by the parameter, or
    * returns null if no such piece is found, as described in part (b)
    */
    public Candy removeNextByFlavor(String flavor)
    {
        int row = box.length - 1 ;
        while(row >= 0)
        {
            for (int col = 0; col < box[0].length ; col++)
            {
                /* == or .equals? */
                if (box[row][col].getFlavor() == flavor && box[row][col] != null)
                {
                    Candy yum = box[row][col];
                    box[row][col] = null;
                    return yum;
                }
            }
            row-- ;
        } return null;
    }
}