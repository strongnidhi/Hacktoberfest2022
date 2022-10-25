import java.util.*;

class node
{
    boolean flag;
    node arr[];
    node()
    {
        flag=false;
        arr=new node[26];
    }
    void insertn(char ch, node n)
    {
        n.arr[ch-'a']=new node();
    }
}


public class trie
{
    node root;
    trie()
    {
        root=new node();
    }
    void insert(String s)
    {
        int n=s.length();
        node temp=root;
        
        for(int i=0;i<n;i++)
        {
            int ch=s.charAt(i)-'a';
            if(temp.arr[ch]==null) temp.arr[ch]=new node();
            temp=temp.arr[ch];
        }
        temp.flag=true;
    }
    boolean search(String s)
    {
        int n=s.length();
        node temp=root;
        for(int i=0;i<n;i++) 
        {
            int ch=s.charAt(i)-'a';
            if(temp.arr[ch]!=null)
            {
                temp=temp.arr[ch];
            }
            else return false;
        }
        return temp.flag;
    }
    boolean startsWith(String s)
    {
        int n=s.length();
        node temp=root;
        for(int i=0;i<n;i++) 
        {
            int ch=s.charAt(i)-'a';
            if(temp.arr[ch]!=null)
            {
                temp=temp.arr[ch];
            }
            else return false;
        }
        return true;
    }
    
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        trie t=new trie();
        boolean b=true;
        while(b)
        {
            System.out.println("1. Insert \n2. search \n3. Starts with \n4. exit");
            int ch=sc.nextInt();
            System.out.println("Enter string :");
            String s=sc.next();
            switch(ch)
            {
                case 1:
                    t.insert(s);
                    System.out.println("Inserted successfully");
                    break;
                case 2:
                    System.out.println(t.search(s));
                    break;
                case 3:
                    System.out.println(t.startsWith(s));
                    break;
                case 4:
                    b=false;
            }
        }
    }
}
