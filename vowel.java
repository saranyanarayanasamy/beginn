import java.io.*;
import java.util.*;
public class vowel
{
public static void main(String args[])
{
int count=0,i;
char d[]={'a','e','i','o','u'};
Scanner scan=new Scanner(System.in);
string s=scan.next();
char p=s.charAt(0);
for(i=0;i<5;i++)
{
if(d[i]==s)
{
count=d[i];
}
}
if(count==0)
{
System.out.println("the character is consonant");
}
else
{
System.out.println("the character is vowel");
}
}
}
