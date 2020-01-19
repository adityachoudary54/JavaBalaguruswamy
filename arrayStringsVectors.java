/**
 * arrayStringsVectors
 */
import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
public class arrayStringsVectors {
    static String[] stringOrdering(String names[]){
        for (int i = 0; i < names.length; i++) {
                for (int j = i+1; j < names.length; j++) {
                    if(names[i].compareTo(names[j])>0){
                        String temp=names[i];
                        names[i]=names[j];
                        names[j]=temp;
                    }
                }
        }
        return names;
    }
    public static void main(String[] args) {
        // 1d array
        // int num[]={1,2,3,4};
        // int n=num.length;
        // System.out.println("Length is:"+n);
        // 2d array
        // int myArray[][];
        // myArray=new int[3][4];
        // Scanner scan=new Scanner(System.in);
        // for (int i = 0; i < myArray.length; i++) {
        //     for (int j = 0; j < myArray[i].length; j++) {
        //         myArray[i][j]=scan.nextInt();                
        //     }
        // }
        // scan.close();
        // for (int[] array : myArray) {
        //     for (int item : array) {
        //         System.out.print(item+" ");
        //     }
        //     System.out.println("");
        // }
        // Variable size arrays
        // int x[][]=new int[3][];
        // x[0]=new int[2];
        // x[1]=new int[4];
        // x[2]=new int[3];
        // Scanner sc=new Scanner(System.in);
        // for (int i = 0; i < x.length; i++) {
        //     for (int j = 0; j < x[i].length; j++) {
        //         x[i][j]=sc.nextInt();                
        //     }
        // }
        // sc.close();
        // for (int[] array : x) {
        //     for (int item : array) {
        //         System.out.print(item+" ");
        //     }
        //     System.out.println("");
        // }

        //String methods
        // String s1="       Aditya        ";
        // String s2=s1.toLowerCase();
        // System.out.println(s1.toLowerCase());
        // System.out.println(s1.toUpperCase());
        // System.out.println(s1.replace('y', 'x'));
        // System.out.println(s1.trim());
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equalsIgnoreCase(s2));
        // System.out.println(s1.length());
        // System.out.println(s1.charAt(9));
        // System.out.println(s1.compareTo(s2));
        // System.out.println(s1.concat(s2));
        // System.out.println(s1);
        // System.out.println(s1.substring(9));
        // System.out.println(s1.substring(9,12));
        // System.out.println(s1.toLowerCase().indexOf('a'));
        // System.out.println(s1.toLowerCase().indexOf('a',s1.toLowerCase().indexOf('a')+1));
        // String i=String.valueOf("12");
        // System.out.println(i);

        //Sorting strings
        // String names[]={"Madras","Delhi","Ahmedabad","Calcutta","Bombay"};
        // String[] t=stringOrdering(names);
        // for (String string : t) {
        //     System.out.print(string+" ");
        // }
        // System.out.println("");
        // for (String string : names) {
        //     System.out.print(string+" ");
        // }
        // Vector
        Vector<Integer> intVect=new Vector<Integer>();
        Vector<String> strVect=new Vector<String>();
        intVect.addElement(3);
        intVect.addElement(4);
        intVect.addElement(5);
        strVect.add("adi");
        strVect.add("ayi");
        strVect.add("aoi");
        for (Object object : intVect) {
            System.out.println(object);
        }
        //ArrayList(use them instead of vectors)

        // size of ArrayList 
        int n = 5; 
  
        //declaring ArrayList with initial size n 
        ArrayList<Integer> arrli = new ArrayList<Integer>(n); 
  
        // Appending the new element at the end of the list 
        for (int i=1; i<=n; i++) 
            arrli.add(i); 
  
        // Printing elements 
        System.out.println(arrli); 
  
        // Remove element at index 3 
        arrli.remove(3); 
  
        // Displaying ArrayList after deletion 
        System.out.println(arrli); 
  
        // Printing elements one by one 
        for (int i=0; i<arrli.size(); i++) 
            System.out.print(arrli.get(i)+" ");
        
        //Using Wrapper classes
        Float principalAmount = Float.valueOf(0);
        Float interestRate = Float.valueOf(0);
        int numYears=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the principle amount:");
        principalAmount=scan.nextFloat();
        System.out.print("Enter the interestRate amount:");
        interestRate=scan.nextFloat();
        System.out.print("Enter the numYears amount:");
        numYears=scan.nextInt();
        Float interest=(principalAmount*interestRate*numYears)/100;
        System.out.println("Interest is:"+interest);
        System.out.println("Interest is:"+interest.toString());
        System.out.println("Interest is:"+Float.valueOf(interest.toString()));
        scan.close();
    }
    
}