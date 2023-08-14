import java.util.Scanner;

class pattern3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter pattern number");
        int num = sc.nextInt();
        for(int i =0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                if(i==0||j==0||i==num-1||j==num-1||i==j||i+j==num-1||i+j==(num-1)/2||i-j==(num-1)/2||i+j==(num-1)+(num-1)/2||j-i==(num-1)/2)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();

        }

    }
}
