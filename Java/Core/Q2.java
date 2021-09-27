class Encapsulated{
    private int code;
    private String message;

    Encapsulated(){
        this.code = 0;
        this.message = "Nothing yet";
    }

    public int getCode(){
        return code;
    }
    public String getMessage(){
        return message;
    }
    public void setCode(int value){
        this.code = value;
    }
    public void setMessage(String value){
        this.message = value;
    }

    public String toString(){
        return "Code: "+this.getCode()+"\tMessage: "+this.getMessage();
    }
}

public class Q2{
    public static void main(String [] args){
        Encapsulated object = new Encapsulated();
        System.out.println(object);
        object.setCode(7);
        object.setMessage("Hi there");
        System.out.println("After using the setters");
        System.out.println(object);
        System.out.println("Using the getters");
        System.out.println("This is the code: "+object.getCode());
        System.out.println("This is the message: "+object.getMessage());

    }
}