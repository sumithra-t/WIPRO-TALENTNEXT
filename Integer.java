import java.util.*;
class Integer
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n");
int n=sc.nextInt();
if(n>0)
{
System.out.println("Positive number:");
}
else if(n<0)
{
System.out.println("Negative number:");
}
else if(n==0)
{
System.out.println("zero");
}
else {
System.out.println("Invalid");
}
}
}