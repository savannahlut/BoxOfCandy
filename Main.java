public class Main 
{
    public static void main(String[] args)
    {
        Candy lime = new Candy("lime"); 
        Candy cherry = new Candy("cherry");
        Candy grape = new Candy("grape");
        Candy orange = new Candy("orange");
        Candy lemon = new Candy("lemon");
        
        BoxOfCandy bigBox = new BoxOfCandy() ;
        bigBox.box = new Candy[][] 
        {
            {null, lime, null },
            {null, orange, null },
            {null, null, cherry },
            {null, lemon, grape }
        };

        System.out.println(bigBox.moveCandyToFirstRow(0));
        System.out.println(bigBox.moveCandyToFirstRow(1) + " Flavor: " + bigBox.box[0][1].getFlavor());
        System.out.println(bigBox.moveCandyToFirstRow(2) + " Flavor: " + bigBox.box[0][2].getFlavor());

        BoxOfCandy biggerBox = new BoxOfCandy() ;
        biggerBox.box = new Candy[][] 
        {
            {lime, lime, null, lemon, null },
            {orange, null, null, lime, lime },
            {cherry, null, lemon, null, orange }
        };

        System.out.print(biggerBox.removeNextByFlavor("cherry"));
        System.out.println(" = " + cherry);
        System.out.println("Space is now: " + biggerBox.box[2][0]);

        System.out.print(biggerBox.removeNextByFlavor("lime"));
        System.out.println(" = " + lime);
        System.out.println("Space is now: " + biggerBox.box[1][3]);

        System.out.print(biggerBox.removeNextByFlavor("grape"));
        System.out.println(" = " + null);
        System.out.println("Box Unchanged? : ");
        for (int i = 0; i < biggerBox.box.length ; i++)
        {
            for (int j = 0; j < biggerBox.box[0].length ; j++)
            {
                System.out.print(biggerBox.box[i][j] + " ");
            }
        }
    }
}