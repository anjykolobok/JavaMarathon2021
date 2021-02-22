package day1;

public class Task6 {
    public static void main(String[] args) {

        int k = 2;
        int ratio = 1;
        while ( ratio < 10){
            System.out.println(ratio + " x " + k + " = " + ratio++*k);
        }
    }
}
