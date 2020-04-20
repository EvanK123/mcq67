

/**
 * Write a description of class mcq6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mcq6
{
    // Q3
    //II) checkString(new String[0]);
    //III) String[] str = {"cat", "dog"};
    //III 2) checkString(str);
    public static int checkString(String[] arr)
    {
        int count = 0;
        for (int k = 0; k < arr.length; k++)
            if (arr[k].length() >= 3)
                count++;
        return count;

    }
    
    // Q5
    // -4 is printed
    public static void Q5()
    {
        int[] arr = {4, 3, 2, 1, 0};
        int total = 0;
        for (int k = 0; k <= total; k++)
        {
            if (arr[k] % 2 == 0)
                total += arr[k];
               else
                    total -= arr[k];
        }
        System.out.print(total);
    }
    
    //Q6
    // for (int i = 0; i <= fruits.length; i++) causes an exception error, occurs when attempting to access the elemenm at index 4
    public static void Q6()
    {
       String [] fruits = {"apples", "bananas", "cherries", "dates"};
       
       for (int i = 0; i <= fruits.length; i++)
        System.out.println(fruits[i]);

    }
    
    //Q9
    //in Q9 test, both are the same
    public class Toy
    {
        private int yearFirstSold;
        public int getYearFirstSold()
        {
            return yearFirstSold;
        }
                /* There may be instance variables, constructors, and other methods not shown. */                
    }
    public class Q9
    {
        public void Q9test()
        {
            /*
            for (int k = 0; k < toyArray.length; k++)
            {
                System.out.println(toyArray[k].getYearFirstSold());
            }
            */
           
            /*for (Toy k : toyArray)
            {
                System.out.println(k.getYearFirstSold());
            }*/
        }
    }
    
    //Q10
    //Code segment 2 executes without error and prints 45678
    public static void Q10()
    {
       int[] arr = {1, 2, 3, 4, 5};
       for (int x = 0; x < arr.length; x++)
       {
           System.out.print(arr[x + 3]);
       }
       //vs
       for (int x : arr)
       {
           System.out.print(x + 3);
       }
    }
    
    //Q11
    // for (int y = x + 1; y < arr.length; y++) The outer loop will iterate through all elements of the array. For each iteration of the outer loop, this loop header will cause the inner loop to examine all elements that come after the current element. This will ensure that no element is ever compared with itself.
    public static void Q11()
    {
        boolean duplicates = false;
        for (int x = 0; x < arr.length - 1; x++)
        {
            for (int y = x + 1; y < arr.length; y++)
            {
                if (arr[x] == arr[y])
                {
                    duplicates = true;
                }
            }
        }
    }
    
    //Q12
    //With this loop header, the code segment will iterate through the array from left to right, swapping the element k positions from the front of the array with the element k positions from the end of the array. The loop terminates when k has reached the middle of the array, leaving the array elements in reverse order.
    public static void Q12()
    {
        for (int k = 0; k < numArr.length / 2; k++)
        {
            int temp = numArr[k];
            numArr[k] = numArr[numArr.length - k - 1];
            numArr[numArr.length - k - 1] = temp;

        }   
    }
}
