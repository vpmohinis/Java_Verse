package JavaRevision;

class OutsideClass {

    // A simple method that returns a message
    public String displayMessage() {
        return "Hello from the JavaRevision.OutsideClass!";
    }
}

public class MainClass {

    public static void main(String[] args) {
        // Creating an object of the JavaRevision.OutsideClass
        OutsideClass obj = new OutsideClass();

        // Calling the method from JavaRevision.OutsideClass and printing the output
        String message = obj.displayMessage();
        System.out.println(message);
    }
}

// JavaRevision.OutsideClass definition (outside of JavaRevision.MainClass)

