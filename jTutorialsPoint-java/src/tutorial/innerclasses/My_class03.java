package tutorial.innerclasses;

// interface
interface  Message {
    String greet();
}

public class My_class03 {
    // method which accepts the object of interface Message
    public void displayMessage(Message m) {
        System.out.println(m.greet() + ", This is an example of anonymous inner class as an argumet");
    }

    public static void main(String args[]) {
        // Instantiating the class
        My_class03 obj = new My_class03();

        // Passing an anonymous inner class as an argument
        obj.displayMessage(new Message() {
            public String greet() {
                return "Hello";
            }
        });
    }
}