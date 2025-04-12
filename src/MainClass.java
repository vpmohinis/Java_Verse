class OutsideClass {

    // A simple method that returns a message
    public String displayMessage() {
        return "Hello from the OutsideClass!";
    }
}

public class MainClass {

    public static void main(String[] args) {
        // Creating an object of the OutsideClass
        OutsideClass obj = new OutsideClass();

        // Calling the method from OutsideClass and printing the output
        String message = obj.displayMessage();
        System.out.println(message);
    }
}

// OutsideClass definition (outside of MainClass)

