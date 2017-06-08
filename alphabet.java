import java.io.*;
import java.util.*;
public class alphabet
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s=scan.next();
char c=s.charAt(0);
{
if((c<='z')&&(c>='a'))
{
System.out.println("the character is an alphabet");
}
else
{
System.out.println("the character is not an alphabet");
}
}
}
}
