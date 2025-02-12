/*🔴 Exercise 1: Personal Information
Write a Java program that declares variables to store:

Your name (String)
Your age (int)
Your height in meters (float)
Whether you are a student (boolean)
👉 Print all the values in the output. */

class Ex_1 {
    public static void main(String args[]) {
        String name = "Gauri";
        int age = 22;
        float height = 10.0f; 
        boolean is_student = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Is Student: " + is_student);
    }
}