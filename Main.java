public class Main 
{
    public static void main(String[] args)
    {
        Candy lime = new Candy(); 
        lime.flavor = "lime" ;
        Candy cherry = new Candy();
        cherry.flavor = "cherry" ;
        Candy grape = new Candy();
        grape.flavor = "grape" ;
        Candy orange = new Candy();
        orange.flavor = "orange";
        Candy lemon = new Candy();
        lemon.flavor = "lemon" ;
        
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

        
    }
}