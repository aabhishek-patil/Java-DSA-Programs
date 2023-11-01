package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            divide(a, b);
//        try {
//            int c = a / b;
//        }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will get execute");
        }
    }

        static int divide(int a, int b)throws ArithmeticException{
            if(b==0){
                throw new ArithmeticException("cannot divide by zero");
            }
            return a/b;
    }
}
