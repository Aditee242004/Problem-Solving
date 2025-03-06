public class NumberPattern {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; num <= 15; i++) { 
            for (int j = 1; j <= i && num <= 15; j++) {
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
}
