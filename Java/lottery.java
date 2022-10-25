import java.util.*;

public class lottery
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int lot=(int)(Math.random()*100);
        System.out.println("Enter a 2 digit number");
        int num=sc.nextInt();
        
        System.out.println("Lottery number is "+lot);
        if(num==lot) System.out.println("You win Rs 10,000");
        else 
        {
            int al=lot%10;
            int bl=lot/10;
            int an=num%10;
            int bn=num/10;
            
            if(al==bn&&an==bl) System.out.println("You win Rs 3,000");
            else if(al==bn||al==an||bl==bn||bl==an) System.out.println("You win Rs 1,000");
            else System.out.println("Oops ! You Lose :) ");
        }
        
        
    }
}
