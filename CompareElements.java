// Java Program to Compare Elements in a Collection
import java.util.*;
  
class CompareElements{
 
    public static void main(String[] args){
        ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(3, 4, 5));
  
        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(4, 5, 3));
  
        Collections.sort(listA);
        Collections.sort(listB);
  
        boolean isEqual = listA.equals(listB);
  
        // print output on screen (true or false)
        System.out.println(isEqual);
    }
}