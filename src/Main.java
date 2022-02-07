import java.util.Scanner;
public class Main {
    public static void main(String []args){
Scanner s = new Scanner(System.in);
System.out.println("введиите чтонить");
String x = s.nextLine();
System.out.println("было введено " + x);

for (int i = 0;i<=15;i++){
    if (i%2==0){continue;}
    System.out.println("lol "+i);
}
    }
}

