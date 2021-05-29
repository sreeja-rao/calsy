import java.util.Scanner;

public class loops {

    static int balls;
    static int bat;
    static int people;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of people you have to play:");
        people= sc.nextInt();

        if(people == 2 || people> 2){
            System.out.println("You need atleast 2 bats and 1 ball to play tennis\n");
        }else{
            System.out.println("Your not following the rules of tennis\n");
        }

        System.out.println("CAUTION: do enter atleast 2 bats, if not you might face trouble while going to next step.\n");

        
        System.out.println("Enter no of bats you want: ");
        bat = sc.nextInt();

        while(bat == 2 || bat>2){
            System.out.println("You are going good! Come on lets go get the ball\n");
            break;
        }

        System.out.println("\nRemeber you need atleast 1 ball to play the game!\n");
        
        System.out.println("Enter no of balls you want:\n");
        balls= sc.nextInt();

        do{
            System.out.println("Yeah! Now we are ready to have a tennis match\n");
            break;
        }while(balls==0 || balls==1);

        System.out.println("\nHere you go with all the equipments.\nThanks for doing all the required procedure, now go have a safe match :)\n");

        sc.close();
    }
    
}
