abstract class Animal{

    String name;
    Animal(String name){
        this.name = name;
    }

    abstract void sound();

    final void whoAmI(){
        System.out.println("My name is "+name);
    }

    static void className(){
        System.out.println("This is the Animal abstract class");
    }
}

class Lion extends Animal{

    Lion(){
        super("Lion");
    }

    void sound(){
        System.out.println("ROAR!");
    }
}
class Cow extends Animal{
    Cow(){
        super("Cow");
    }
    void sound(){
        System.out.println("MOO!");
    }
}

interface NumStack{
    String info = "This is a NumStack interface";
    void push(int item);
    int pop();
}

interface Test{
    void print(String message);
}

class FixedStack implements NumStack, Test{
    private int top;
    private int stack[];

    FixedStack(int size){
        this.stack = new int [size];
        this.top = -1;
    }

    public void push(int item){
        if(top == stack.length-1)
            System.out.println("Stack is full");
        else
            stack[++top] = item;
    }

    public int pop(){
        if(top < 0){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int x = stack[top];
            stack[top--] = 0;
            return x;
        }
    }

    public void print(String message){
        System.out.println(message);
    }

    public int capacity(){
        return stack.length;
    }

    public String toString(){
        String res = "";
        for(int i=0; i<stack.length; i++){
            res = res + Integer.toString(stack[i]) + " ";
        }
        return res;
    }
}

public class Q1{
    public static void main(String[] args){
        System.out.println("ABSTRACT CLASSES");
        // Abstract class static method
        Animal.className();

        Animal lion = new Lion();
        Animal cow = new Cow();
        // Abstract class abstract method
        lion.sound();
        // Abstract class final method
        lion.whoAmI();

        cow.sound();
        cow.whoAmI();

        System.out.println("\nINTERFACES");
        //Interface attributes are public static final by default
        System.out.println(NumStack.info);

        FixedStack st = new FixedStack(10);
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("After pushing\t"+st);
        System.out.println("Pop\t"+st.pop());
        System.out.println("After popping\t"+st);
        System.out.println("Capacity\t"+st.capacity());

        st.print("This is from second interface");

    }
}