import java.util.Scanner;

public class loopsifelse {

    static int appels;
    
    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);
        System.out.println("how many appels you ate today ?");
        
        appels=sc.nextInt();

        if(appels > 0){
            System.out.println("Wow! you have agood habit.");
        }else{
            System.out.println("Oh! no! you need to adapt to healthier habits");
        }

        sc.close();

    }
    

}
