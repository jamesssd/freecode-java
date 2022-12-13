import java.util.Scanner;

public class Nest{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Input your age: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);
        
        if(age >= 13){
            System.out.println(" You can ride!");
        } 
        else{
            System.out.println("You can ride!");
        }
        sc.cloese;
    }
}