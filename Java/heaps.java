
public class heaps
{
    static void heapify(int i,int[]arr,int n)
    {
        int lgt=i;
        int l=i*2+1;
        int r=l+1;
        if(l<n&&arr[i]<arr[l]) lgt=l;
        if(r<n&&arr[lgt]<arr[r]) lgt=r;
        
        if(lgt!=i)
        {
            int temp=arr[i];
            arr[i]=arr[lgt];
            arr[lgt]=temp;
            heapify(lgt,arr,n);
        }
    }
    static void build_heap(int[]arr)
    {
        int n=arr.length;
        for(int i=n/2;i>-1;i--)
        {
            heapify(i,arr,n);
        }
    }
    
    public static void main()
    {
        int arr[]={0,0,0,0,1,2,4,5,8,9,44};
        build_heap(arr);
        for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
    }
}
