import java.util.*; 
public class Function {
public static void fact(int n) {
  int fact=1;
  for(int i=n;i>=1;i--)
  {
    fact=fact*i;
  }
System.out.println(fact);
}

public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
   System.out.println("Enter the value for n:");
  int n = sc.nextInt();
  System.out.println("The factorial value is:");
  fact(n);
}
}
