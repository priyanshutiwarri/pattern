import java.sql.SQLOutput;
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of ppattern");
        int num = sc.nextInt();


        for(int i =0;i<num;i++) {

            // Pattern A
            for (int j = 0; j < num; j++) {
                if(i==0&&j>0&&j<num-1||i==(num-1)/2||j==0&&i>0||j==num-1&&i>0)
                {
                    System.out.print("# ");
                 }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

//          Pattern  B
            for (int j = 0; j < num; j++) {
                if(i==0 && j<num-1 || j==0 || i==(num-1)/2 && j<(num-1)||i==num-1 &&j<num-1||j==num-1&&i<num-1&&i>0)
                {
                    System.out.print("# ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

//          Pattern C
            for (int j = 0; j < num; j++) {
                if(i==0&&j>0||i==num-1&&j>0||j==0&&i>0&&i<num-1)
                {
                    System.out.print("# ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

//          Pattern D
            for (int j = 0; j < num; j++) {
                if(i==0&&j<num-1||i==num-1&&j<num-1||j==0||j==num-1&&i>0&&i<num-1)
                {
                    System.out.print("# ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

//            Pattrern G
                for (int j = 0; j < num; j++) {
                    if(i==0&&j>0&&j<num-1||i== (num-1)/2 &&j>=(num-1)/2&&j<=num-1||i==num-1&&j>0&&j<num-1||j==0&&i>0&&i<num-1||j==num-1&&i==1||j==num-1&&i>=(num-1)/2&&i<num-1)
                    {
                        System.out.print("# ");

                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println( );

        }

    }
}
