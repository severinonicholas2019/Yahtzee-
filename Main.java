import java.util.Random;
public class Main {


    public static void main(String[] args) {


        Random rand = new Random();
        int a = rand.nextInt(6)+1;
        int b = rand.nextInt(6)+1;
        int c = rand.nextInt(6)+1;
        int d = rand.nextInt(6)+1;
        int e = rand.nextInt(6)+1;

       System.out.print("Aces            "+aces(5,2,2,2,5);
       System.out.print("Twos            "+ twos(5,2,2,2,5);
       System.out.print("Threes          "+threes(5,2,2,2,5);
       System.out.print("Fours           "+fours(5,2,2,2,5);
       System.out.print("Fives           "+fives(5,2,2,2,5);
       System.out.print("Sixes           "+sixes(5,2,2,2,5);
       System.out.print("3 of a Kind     "+ok3(5,2,2,2,5);
       System.out.print("4 of a Kind     "+ok4(5,2,2,2,5);
       System.out.print("Full House      "+fh(5,2,2,2,5);
       System.out.print("Small Straight  "+ss(5,2,2,2,5);
       System.out.print("Large Straight  "+ls(5,2,2,2,5);
       System.out.print("Yahtzee         "+yah(5,2,2,2,5);
       System.out.print("Chance          "+chan(5,2,2,2,5);

    }
}
