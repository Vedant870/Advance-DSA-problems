import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
        int y = sc.nextInt();
        int c = y/x;
        int v = n/c;
        if (n%c!=0)
            v++;
        System.out.println(v);
        sc.close();
	}
}
