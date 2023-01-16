import java.lang.*;
import java.io.*;
import java.util.*;

public class ReverseString 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String reverseStr = "";

        for (int i=str.lenght(); i>0; i--)
        {
            reverseStr = reverseStr + charAt(i);
        }

        System.out.println(reverseStr);
    }
}