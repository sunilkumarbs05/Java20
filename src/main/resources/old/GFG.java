import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Pair 
{  
    int x, y; 
      
    Pair(int a, int b) 
    { 
        this.x = a; 
        this.y = b; 
    } 
}


public class GFG 
{ 
static int inf = Integer.MIN_VALUE; 
  
// Function to find the minimum  
// number days required  
public static int minimumDays(int N, int D1[],  
                              int D2[]) 
{ 
    // initialising ans to  
    // least value possible  
    int ans = -inf; 
      
    ArrayList<Pair>  
              list = new ArrayList<Pair>(); 
      
    for (int i = 0; i < N; i++)  
    list.add(new Pair(D1[i], D2[i])); 
      
    // sort by first i.e D(i)  
    Collections.sort(list, new Comparator<Pair>()  
    { 
        @Override
        public int compare(Pair p1, Pair p2)  
        { 
            return p1.x - p2.x; 
        } 
    }); 
      
// Calculate the minimum possible days  
for (int i = 0; i < N; i++)  
{  
    if (list.get(i).y >= ans)  
        ans = list.get(i).y;  
    else
        ans = list.get(i).x;  
}  
  
return ans;  
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    // Number of works  
    int N = 3;  
  
    // D1[i]  
    int D1[] = new int[]{6, 5, 4};  
      
    // D2[i]  
    int D2[] = new int[]{1, 2, 3}; 
      
    System.out.print(minimumDays(N, D1, D2)); 
} 
}