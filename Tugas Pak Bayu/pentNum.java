public class pentNum {
    
    public static int getPentagonalNumber(int n) {
        return n * (3*n -1) / 2;
    }
    public static void main(String[] args) {
        System.out.println();
        for (int x=1; x<=100; x++){
                System.out.printf("%7d", getPentagonalNumber(x));
            
        }
    }
}
