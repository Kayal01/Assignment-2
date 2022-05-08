public class CheckOddEven {
    public String checking(int n){
        if ( n < 0)
            throw new IllegalArgumentException("Invalid");
        if(n%2==0)
            return "it is even";
        else
            return "it is odd";
    }

}
