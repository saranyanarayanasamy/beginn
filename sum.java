import java.io.*;
import java.util.*;
public class sum
{
static public void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
int a=Integer.parseInt(s);
int b=0;
for(int i=0;i<a;i++)
{
b=b+a;
b--;
}
System.out.print(b);
}
}
