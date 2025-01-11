public class Fibonacci {

    /**
     * This <code>fibonacciValue</code> method calculates the value of the Fibonacci sequence at a given place. This method
     * has one parameter <code>n</code> passed when the method is called. The value <code>n</code> represents the place value to
     * calculate up to. An <code>int</code> value is returned.
     * This is a recursive method.
     *
     * @param  n an int value that gives the nth place to calculate up to
     * @return   the int value calculated by the recursive method
     * @see      int
     * */


    public static int fibonacciValue(int n) {
        if(n==0) return n;
        if(n==1) return n;
        return fibonacciValue(n-1)+fibonacciValue(n-2);
    }

    public static void main(String[] args) {
        int value = 10;
        System.out.println("The value of the Fibonacci sequence at " + value +" = " + fibonacciValue(value));
        }
    }