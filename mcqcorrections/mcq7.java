

/**
 * Write a description of class mcq7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mcq7
{
    //Q1
    //Correct. This statement correctly declares an ArrayList that can contain only Thing objects. The reference type Thing is contained in angle brackets to indicate that the a object is to contain elements of type Thing.
    public static void Q1()
    {
        ArrayList<Thing> a = /* missing code */;
        //new ArrayList<Thing>()
    }
    
    //Q2
    //Statement II results in a syntax error, as the call to the ArrayList constructor must contain (). 
    //Statement III correctly declares an ArrayList object that can contain elements only of type Integer.
    public static void Q2()
    {
        ArrayList<Integer> numbers = /* missing code */;
        //new ArrayList<Integer>
        //new ArrayList<Integer>()
    }
    
    //Q3
    //This statement correctly declares an ArrayList that can contain only String objects.
    public static void Q3()
    {
        /* missing code */ = new ArrayList<String>();
        //ArrayList<String> arrList

    }
    
    //Q4
    //[4, 3, 0, 2, 0]
    // Finally, the call nums.add(2, 0) inserts 0 at index 2, changing the contents to[4, 3, 0, 2, 0].
    public static void Q4()
    {
       ArrayList<Integer> nums = new ArrayList<>();
       nums.add(3);
       nums.add(2);
       nums.add(1);
       nums.add(0);
       nums.add(0, 4);
       nums.set(3, 2);
       nums.remove(3);
       nums.add(2, 0);
    }
    
    //Q6
    //[4, 2, 0]
    //. In the first statement, the size of vals is 0, so 0 is inserted at index 0. In the second statement, the size of vals is 1, so 2 is inserted at index 0. In the third statement, the size of vals is 2, so 4 is inserted at index 0.
    public static void Q6()
    {
        ArrayList<Integer> vals = new ArrayList<Integer>();
        vals.add(vals.size(), vals.size());
        vals.add(vals.size() - 1, vals.size() + 1);
        vals.add(vals.size() - 2, vals.size() + 2);  
    }
    
    //Q8
    //[new, pet]
    //When i has the value 0, "mat" is removed from the list. When i is incremented and has the value 1, it is less than the current size of the list, or 3, so the loop is executed again. \
    //When i has the value 1, "open" is removed from the list. (The element "new" is skipped because it is now at index 0.) When i is incremented and has the value 2, it is equal to the current size of the list, or 2, so the loop is not executed again. (The element "pet" is skipped because it is now at index 1.) The current contents of the list, "new" and "pet", are printed.
    public static void Q8()
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("mat");
        words.add("new");
        words.add("open");
        words.add("pet");
        int i = 0;
        while (i < words.size())
        {
            words.remove(i);
            i++;
        }
        System.out.println(words.toString());
    }
    
    //Q9
    //AC
    //During the first iteration of the loop, i has the value 0 and the size of arrList is 4, so the element at index 0 ("A") is removed and printed. 
    //During the second iteration of the loop, i has the value 1 and the size of arrList is 3, so the element at index 1 ("C") is removed and printed. 
    //During the third comparison of i and arrList.size() in the loop header, i has the value 2 and the size of arrList is 2, so the loop terminates.
    public static void Q9()
    {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");
        arrList.add("D");
        for (int i = 0; i < arrList.size(); i++)
        {
            System.out.print(arrList.remove(i));
        }
    }
    
    //Q10
    //When firstList is {1, 3, 5, 7} and secondList is {5, 5, 3, 1} does not return correct value
    //The loop will iterate two times. Therefore, the 1 in firstList will be compared with the 1 in secondList and the 3 in firstList will be compared with the 3 in secondList. 
    //These pairs are equal, so the method returns true even though the last element of firstList is not equal to the first element of secondList. 
    //To correct the error, the loop should iterate over the entire firstList rather than just over the first half—in other words, the terminating condition for the loop should be j < firstList.size() instead of j < firstList.size() / 2.
    /** Precondition: firstList.size() == secondList.size() */
            public static boolean isReversed(ArrayList<Integer> firstList, ArrayList<Integer> secondList)
            {
                for (int j = 0; j < firstList.size() / 2; j++)
                {
                    if (firstList.get(j) != secondList.get(secondList.size() - 1 - j))
                    {
                        return false;
                    }
                }
                return true;
            }
            
    //Q11
    //{1, 0, 0, 2}
    //For this ArrayList, the code segment removes the element at index 1, shifting the second instance of 0 to index 1. 
    //The code segment then increases j to 2, so the second instance of 0 is never removed.
    public static void Q11()
    {
        int j = 0;
        while (j < myList.size())
        {
            if (myList.get(j) == 0)
            {
                myList.remove(j);
            }
            j++;
        }
    }
    
    //Q16
    //int[] arr = {10, 8, 3, 4};
    //insertionSort(arr);
    //5
    //The while loop iterates once each time an array element is shifted to the right as a result of an insertion. Therefore, the statement in line 10 is executed each time an element is shifted to the right. For the given array, 10 is shifted right when 8 is inserted before it. Then 8 and 10 are each shifted right when 3 is inserted before them. 
    //Lastly, 8 and 10 are each shifted right when 4 is inserted before them. A total of five shifts occur, so the statement in line 10 is executed five times.
    public static void insertionSort(int[] elements)
    {
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;   // line 10
            }
            elements[possibleIndex] = temp;
        }
    }
    
    //Q17
    //int[] nums = {8, 7, 5, 4, 2, 1};
    //insertionSort(nums);
    //5
    //The statement in line 12 executes once each time an element is inserted into the array. The number of insertions is one less than the length of the array. 
    //For this array, the statement is executed for a total of five times: when 7 is inserted before 8, when 5 is inserted before 7, when 4 is inserted before 5, when 2 is inserted before 4, and when 1 is inserted before 2.
    public static void insertionSort1(int[] elements)
    {
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;   // line 12
        }
    }

}
