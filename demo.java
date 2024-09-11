import java.util.Scanner;

class demo {
    // Method to print the pattern
    public void Pattern1(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void Pattern2(int rows){
        for(int i = 1 ; i<=rows ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void Pattern3(int rows){
        for(int i = 1 ; i<=rows ; i++){
            for(int j = 1 ; j<=rows-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void Pattern4(int rows){
        for(int i = 1 ; i<=rows ; i++){
            for(int j = 1 ; j<=rows-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void Pattern5(int rows){
        for(int i = rows ; i>=1 ; i--){
          for(int k = 1 ; k<=rows-i ; k++){
              System.out.print(" ");
          }
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void Pattern6(int rows){
        for(int i = rows ; i>=1 ; i--){
            for(int k = 1 ; k<=rows-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void Pattern7(int rows){
        for(int i = rows ; i>=1 ; i--){
            for(int j = 1 ; j<=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = 2 ; i<=rows ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void Pattern8(int rows){
        for(int i = rows ; i>=1 ; i--){
            for(int k = 1 ; k<=rows-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = 2 ; i<=rows ; i++){
            for(int k = 1 ; k<=rows-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void Pattern9(int rows){
        for(int i = rows ; i>=1 ; i--){
            for(int k = 1 ; k<=rows-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = 2 ; i<=rows ; i++){
            for(int k = 1 ; k<=rows-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void Pattern10(int rows){
        for(int i = 1 ; i<=rows ; i++){
            for(int k = 1 ; k<=rows-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = rows ; i>=1 ; i--){
            for(int k = 1 ; k<=rows-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i-1 ; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
    public void Pattern11(int rows){
        for(int i = 1 ; i<=rows ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = rows ; i>=1 ; i--){
            for(int j = 1 ; j<=i-1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void Pattern12(int rows){
        for(int i = 1 ; i<=rows ; i++){
            for(int k = 1 ; k<=rows-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = rows-1 ; i>=1 ; i--){
            for(int k = 1 ; k<=rows-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows = sc.nextInt();
        System.out.println("Here is your Pattern");

        // Create an instance of the Demo class and call the Pattern1 method
        demo Demo = new demo();
        Demo.Pattern12(rows);

        // Close the scanner
        sc.close();
    }
}
