package src.students.Sara;

public class lab07 {
    //    Write a return method that can reverse
   // number and return it as int
    public static void main(String[] args) {


    int num = 1234, reversed = 0;


    while(num != 0) {

        // get last digit from num
        int digit = num % 10;
        reversed = reversed * 10 + digit;

        // remove the last digit from num
        num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
}
}