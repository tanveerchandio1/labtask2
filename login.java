import java.util.*;
class Login{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String users[][]=new String[5][2];
        int i,j;
        String user1e,user2e,user3e,user4e,user5e;
        String user1p,user2p,user3p,user4p,user5p;
        System.out.println("Sign Up.");
        for(i=0;i<5;i++)
        {
            for(j=0;j<1;j++)
            {
                System.out.println("User:"+(i+1)+" Enter your Email:");
                users[i][j]=sc.nextLine();
                System.out.println("User:"+(i+1)+" Enter your Password:");
                users[i][j+1]=sc.nextLine();
            }
        }
        System.out.println("Sign in.");
        System.out.println("User:1 Enter your Email");
        user1e=sc.nextLine();
        System.out.println("User:1 Enter your Password");
        user1p=sc.nextLine();
        if((user1e.equals(users[0][0]))&&(user1p.equals(users[0][1])))
        {
            System.out.println("Sign in Successful!");
        }
        else
        {
            System.out.println("Incorrect Email or Password..");
        }
        System.out.println("User:2 Enter your Email");
        user2e=sc.nextLine();
        System.out.println("User:2 Enter your Password");
        user2p=sc.nextLine();
        if((user2e.equals(users[1][0]))&&(user2p.equals(users[1][1])))
        {
            System.out.println("Sign in Successful!");
        }
        else
        {
            System.out.println("Incorrect Email or Password..");
        }
        System.out.println("User:3 Enter your Email");
        user3e=sc.nextLine();
        System.out.println("User:3 Enter your Password");
        user3p=sc.nextLine();
        if((user3e.equals(users[2][0]))&&(user3p.equals(users[2][1])))
        {
            System.out.println("Sign in Successful!");
        }
        else
        {
            System.out.println("Incorrect Email or Password..");
        }
        System.out.println("User:4 Enter your Email");
        user4e=sc.nextLine();
        System.out.println("User:4 Enter your Password");
        user4p=sc.nextLine();
        if((user4e.equals(users[3][0]))&&(user4p.equals(users[3][1])))
        {
            System.out.println("Sign in Successful!");
        }
        else
        {
            System.out.println("Incorrect Email or Password..");
        }
        System.out.println("User:5 Enter your Email");
        user5e=sc.nextLine();
        System.out.println("User:5 Enter your Password");
        user5p=sc.nextLine();
        if((user5e.equals(users[4][0]))&&(user5p.equals(users[4][1])))
        {
            System.out.println("Sign in Successful!");
        }
        else
        {
            System.out.println("Incorrect Email or Password..");
        }
    }
}
