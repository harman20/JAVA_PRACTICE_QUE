/*package whatever //do not write package name here */

/*  // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HighestMarks
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no of semester:");
        int sems = sc.nextInt(); //Number of semesters
        
        boolean incorrect = false; // checks if an incorrect value is entered
        
        int arr[] = new int [sems];
        for(int i=0;i<sems;i++)
        {
            System.out.println("Enter no of subjects in "+(i+1)+" semester:");
            arr[i]=sc.nextInt();
        }
        int maxMarks[] = new int[sems];
        
        for(int i=0;i<sems;i++)
        {
            System.out.println("Marks obtained in semester "+(i+1)+":");
            int max = sc.nextInt();
            if(max<0||max>100)
            {
                System.out.println("You have entered invalid mark.");
                System.exit(0);
                
            }
            for(int j=1;j<arr[i];j++)
            {
                
                int marks=sc.nextInt();
                if(marks<0||marks>100)
                {
                    System.out.println("You have entered invalid mark.");
                    System.exit(0); 
                    
                }
                if(max<marks)
                max=marks;
                //System.out.println(j+" ");
            }
            maxMarks[i]= max;   
        }
        for(int i=0;i<sems;i++)
        {
            System.out.println("Maximum mark in "+(i+1)+" semester:"+maxMarks[i]);
        }
    }
}
