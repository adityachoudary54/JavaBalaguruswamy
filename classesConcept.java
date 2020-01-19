/**
 * classesConcept
 */
import java.util.Scanner;
class Box{
    int height;
    int width;
    int length;
    Box(Box obj){
        width=obj.width;
        height=obj.height;
        length=obj.length;
    }
    Box(){
        height=width=length=10;
    }
    Box(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    int volume(){
        return height*width*length;
    }
}
class Stack{
    int arr[];
    int capacity;
    int top;
    Stack(){
        arr=new int[10];
        capacity=10;
        top=-1;
    }
    Stack(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        top=-1;
    }
    void push(int item){
        if(top==capacity){
            System.out.println("Stack is full");
        }
        else{
            arr[++top]=item;
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            return arr[top--];
        }
    }
    int size(){
        return top+1;
    }
    int capacityStack(){
        return capacity;
    }
}
public class classesConcept {
    
    static void stackMenu(){
        Scanner scan=new Scanner(System.in);
        Stack myStack=new Stack();
        while(true){
            System.out.println("1. Push item to stack");
            System.out.println("2. Pop item from stack");
            System.out.println("3. View size of given stack");
            System.out.println("4. Capacity of given stack");
            System.out.println("5. View top of Stack");
            System.out.print("Enter your choice:");
            int ch=scan.nextInt();
            
            switch(ch){
                case 1:
                int item=scan.nextInt();
                myStack.push(item);
                break;
                case 2:
                myStack.pop();
                break;
                case 3:
                System.out.println(myStack.size());           
                break;
                case 4:
                System.out.println(myStack.capacityStack());
                break;
                case 5:
                System.out.println(myStack.arr[myStack.top]);
                break;
                default:
                System.out.println("Wrong choice");  
                break;
            }
            System.out.print("Do u want to enter again?");
            char choice=scan.next().charAt(0);
            if(choice!='y'){
                break;
            }
        }
        scan.close();
    }
    public static void main(String[] args) {
        Box myBox1=new Box(10,20,30);
        Box myBox2=new Box(20,20,40);
        Box myBox3=new Box();
        Box myBox4=new Box(myBox1);

        System.out.println(myBox1.volume());
        System.out.println(myBox2.volume());
        System.out.println(myBox3.volume());
        System.out.println(myBox4.volume());
        
        //Using stack
        // stackMenu();

    }
}

