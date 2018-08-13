//CountMoiveSpaces2
import java.util.*;
public class CountMovieSpaces2
{
    public static void main(String[] args)
    {
        String aString;
        int stringLength;
        Scanner in = new Scanner(System.in);
        int numSpace = 0;
        System.out.print("Enter a moive quote >>");
        aString = in.nextLine();
        stringLength = aString.length();

        for(int i = 0; i < stringLength; i++)
        {
            char ch = aString.charAt(i);
            if(ch == ' ')
                numSpace ++;
        }
        System.out.println("The number of space is" + numSpace);
    }
}
