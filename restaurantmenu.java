import java.util.Scanner;
public class restaurantmenu {
    public static void main(String[] args){
        int menu;
        System.out.println(" Resturant Menu");
        System.out.println(" 1. Chicken Biryani");
        System.out.println(" 2. Beef Biryani");
        System.out.println(" 3. Mutton Biryani");
        System.out.println(" 4. Chicken Karahi");
        System.out.println(" 5. Beef Karahi");
        System.out.println(" 6. Mutton Karahi");
        System.out.println("Please choose a dish from our menu to see it's price ");
        Scanner sc = new Scanner(System.in);
        menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("price of Chicken Biryani is 150 Rs");
                break;
            case 2:
                System.out.println("price of Beef Biryani is 200 Rs");
                break;
            case 3:
                System.out.println("price of Mutton Biryani is 250 Rs");
                break;
            case 4:
                System.out.println("price of Chicken Karahi is 300 Rs");
                break;
            case 5:
                System.out.println("price of Beef Karahi is 350 Rs");
                break;
            case 6:
                System.out.println("price of Mutton Karahi is 400 Rs");
                break;
            default:
                System.out.println("The dish is not on the menu");

        }



    }

}