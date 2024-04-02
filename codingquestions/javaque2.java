import java.util.Scanner;
class Fibonacci {
public static void main (String args[])
{
int first = 0, second = 1, next;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the term till you want fibonacci series");
int n = sc.nextInt();
System.out.print(first+" "+second);
for ( int i =2; i<n; i++)
{
next = first + second;
System.out.println(" "+next); 
first = second;
second = next;
}
}
}