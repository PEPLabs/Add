public class Application {
    /**
     * This class contains a main method that allows you to manually test the Add challenge functionality.
     * No changes you make here affect the test case results. You must still run & pass the test cases.
     * All implementation code should be written in the Lab class.
     *
     * The Lab.add method should produce the sum of two numbers.
     */
    public static void main(String[] args) {
        Lab add = new Lab();
        System.out.println("Currently, the lab produces the result of 9 + 10 as:");
        int result = add.addNumbers(9,10);
        System.out.println(result);
    }
}
