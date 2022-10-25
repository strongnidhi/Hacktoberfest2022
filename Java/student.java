package labs;
import java.util.*;

class student
{
    String name;
    int roll_no,reg_no,marks1,marks2,marks3;
    
    student(String n,int roll,int reg,int m1,int m2,int m3)
    {
        name=n;
        roll_no=roll;
        reg_no=reg;
        marks1=m1;
        marks2=m2;
        marks3=m3;
        
    }
    
    void Result()
    {
        int avg=(marks1+marks2+marks3)/3;
        System.out.println("Name "+name);
        System.out.println("Roll Number "+roll_no);
        System.out.println("Registration Number "+reg_no);
        System.out.println("Marks obtained : ");
        System.out.println("Marks 1 "+marks1);
        System.out.println("Marks 2 "+marks2);
        System.out.println("Marks 3 "+marks3);
        System.out.println("Average marks is "+avg);
    }
}

public class students
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        student s;
        
        
        student ritu=new student("ritu",59,1117,100,50,70);
        student rituparna=new student("rituparna",159,1190,10,0,17);
        student ddefault=new student("Default",0,0,0,0,0);
        
        System.out.println("\nEnter roll number of student . \nAvailable rolls : 59 \t 159");
        int n=sc.nextInt();
        if(n==59) s=ritu;
        else if(n==159) s=rituparna;
        else s=ddefault;
        s.Result();
        //rituparna.Result();
    }
}
