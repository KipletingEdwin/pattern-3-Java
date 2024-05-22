//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


 //            j
  //         1  2  3  4
//   i   1   *  *  *  *
//       2   *        *
//       3   *        *
 //      4   *  *  *  *

        for(int i = 1; i <=4; i++){

            for(int j = 1; j <=4; j++){

                if(i ==1 || i==4 || j==1 || j==4){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();




        }
    }
}