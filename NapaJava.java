// // class HelloJava {
// // 	public static void main(String args[]){
// // 		// // System.out.println("Hello! I'm RecurrentTechnology");
// //         // System.out.println("java is excellent");

// // 		for ( int number = 1;number <= 100;number ++){
// // 				System.out.println("*" );
// // 			}
// // 	}
// // }


// // public class Sumten {
// //     public static void main (String[] args){
// //         int sum = 0;//[1]
// //         for (int number = 1; number <= 10; number++) {//[2]
// //             sum += number;//[3]
// //         }
// //         System.out.println("sum:" + sum);//[4]
// //     }
// // }


// // public class NapaJava {
// //     public static void main(String[] args) {
// //         for (int number1 = 1, number2 = 1; number2 <= 9; number2++){//[1]
// //             System.out.print("" + number1 + "x" + number2 + "=" + (number1 * number2) + " ");//[2]
// //         }
// //         System.out.println("");//[3]
// //         for (int number1 = 2, number2 = 1; number2 <= 9; number2++){//[4]
// //             System.out.print("" + number1 + "x" + number2 + "=" + (number1 * number2) + " ");//[5]
// //         }
// //         System.out.println("");//[6]
// //         for (int number1 = 3, number2 = 1; number2 <= 9; number2++){//[7]
// //             System.out.print("" + number1 + "x" + number2 + "=" + (number1 * number2) + " ");//[8]
// //         }
// //         System.out.println("");//[9]
// //         for (int number1 = 4, number2 = 1; number2 <= 9; number2++){//[10]
// //             System.out.print("" + number1 + "x" + number2 + "=" + (number1 * number2) + " ");//[11]
// //         }
// //         System.out.println("");//[12]
// //         for (int number1 = 5, number2 = 1; number2 <= 9; number2++){//[13]
// //             System.out.print("" + number1 + "x" + number2 + "=" + (number1 * number2) + " ");//[14]
// //         }
// //         System.out.println("");//[15]
// //         for (int number1 = 6, number2 = 1; number2 <= 9; number2++){//[16]
// //             System.out.print("" + number1 + "x" + number2 + "=" + (number1 * number2) + " ");//[17]
// //         }
// //         System.out.println("");//[18]
// //         for (int number1 = 7, number2 = 1; number2 <= 9; number2++){//[19]
// //             System.out.print("" + number1 + "x" + number2 + "=" + (number1 * number2) + " ");//[20]
// //         }
// //         System.out.println("");//[21]
// //         for (int number1 = 8, number2 = 1; number2 <= 9; number2++){//[22]
// //             System.out.print("" + number1 + "x" + number2 + "=" + (number1 * number2) + " ");//[23]
// //         }
// //         System.out.println("");//[24]
// //         for (int number1 = 9, number2 = 1; number2 <= 9; number2++){//[25]
// //             System.out.print("" + number1 + "x" + number2 + "=" + (number1 * number2) + " ");//[26]
// //         }
// //     }
// // }


// // 二重for文を利用して簡素化する

// // public class NapaJava {
// //     public static void main(String[] args) {
// //         for (int number1 = 1; number1 <= 9; number1++){//[1]
// //             for (int number2 = 1; number2 <= 9; number2++){//[1]

        
// //                 System.out.print("" + number1 + "x" + number2 + "=" + (number1 * number2) + " ");//[2]
// //             }
// //          }
// //     }
// // }



// public class NapaJava {
//     static int a = 10;//[1]
//     static int b = 20;//[2]

//     public static void main (String[] args) {
//         printMaximum();//[3]
//         printMinimum();//[4]
//         printAverage();//[5]
//     }
//     private static void printMaximum() {//[20]
//         int maximum = a;//[21]
//         if (b > a) {//[22]
//             maximum = b;//[23]
//         }
//         System.out.println("[24] 最大値；" + maximum);
//     }
//     private static void printMinimum() {//[25]
//         int minimum = a;//[26]
//         if (b < a) {//[27]
//             minimum = b;//[28]
//         }
//         System.out.println("[29] 最小値；" + minimum);
//     }
//     private static void printAverage() {//[30]
//         int average = (a + b) / 2;//[31]
//         System.out.println("[32] 平均値；" + average);
//     }
// }




// // アルゴリズム演習課題１

// import java.io.BufferedReader;
// import java.io.InputStreamReader;

// public class NapaJava {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         // 入力パラメータを読み込む
//         String input = br.readLine();
//         String[] param = input.split(" ");//入力値を空白で分解する
//     int num1 = Integer.parseInt(param[0]);
//     int num2 = Integer.parseInt(param[1]);
//     System.out.println(num1 + num2);
//     }
// }





// アルゴリズム演習課題2


// import java.io.BufferedReader;
// import java.io.InputStreamReader;

// public class NapaJava {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         // 入力パラメータを読み込む
//         String input = br.readLine();
//         String[] param = input.split(" ");//入力値を空白で分解する

    
//         int num1 = Integer.parseInt(param[0]);
//         String calmark = param[1];
//         int num2 = Integer.parseInt(param[2]);
        
//         if (calmark.equals("+")){
//             System.out.println(num1 + num2);
//         }

//         if (calmark.equals("-")){
//             System.out.println(num1 - num2);
//         }

//         if (calmark.equals("*")){
//             System.out.println(num1 * num2);
//         }        

//         if (calmark.equals("/")){
//             int solve = (num1 / num2);
//             int solveindvi = (num1 % num2);
//             System.out.println(solve + ",,," + solveindvi);
//         }
//     }
// }








// // アルゴリズム演習課題3 案１→修正中


// import java.io.BufferedReader;
// import java.io.InputStreamReader;

// public class NapaJava {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         // 入力パラメータを読み込む
//         String input = br.readLine();
//         String[] param = input.split(" ");//入力値を空白で分解する

    
//         // int num1 = Integer.parseInt(param[0]);
//         // String calmark = param[1];
//         // int num2 = Integer.parseInt(param[2]);
//         int ListElements = param.length;
//         int sum = 0;
//         int num = 0;
//         System.out.println("------------------------------------------------------------------------------------");
//         System.out.println("要素の長さ=" + ListElements);
//         System.out.println("------------------------------------------------------------------------------------");




//         for (int i = 0 ; i <= (ListElements - 1); i++){

//             System.out.println("------------------------------------------------------------------------------------");
//             System.out.println("試行するiの値  :  " + i);





//             if (param[i].equals("+")){
//                 sum += num;
//                 System.out.println("計算種類      + parten");
//                 System.out.println("今までの合計値sumの値:  " + sum);



//             } else if (param[i].equals("-")){
//                 sum -= num;
//                 System.out.println("計算種類       - parten");

//             } else if (i == ListElements){
//                 System.out.println("最後の処理を実行");

//             // } else if (Integer.parseInt(param[i]) <= 10000 && Integer.parseInt(param[i]) >= -10000);
//             } else {
//                 num = Integer.parseInt(param[i]);
//                 System.out.println("int parten");
//                 System.out.println("入力された値:" + num);
//             } 
//         }


//     System.out.println(" ");
//     System.out.println(" ");
//     System.out.println(" ");

//     System.out.println("--------------------------------------------------------------------------");
//     System.out.println("--------------------------------------------------------------------------");
//     System.out.println("for文から脱出");
//     System.out.println("--------------------------------------------------------------------------");
//     System.out.println("--------------------------------------------------------------------------");

//     System.out.println(" ");
//     System.out.println(" ");
//     System.out.println(" ");

//     System.out.println(ListElements);


//     System.out.println("処理完了後の累計値  :   " + sum);

//     if (param[(ListElements - 1)].equals("+")){
//         sum += num;

//     } else {
//         sum -= num;
//     }


//     System.out.println(sum);
//     }
// }





// アルゴリズム演習課題3 案2


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NapaJava {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 入力パラメータを読み込む
        String input = br.readLine();
        String[] param = input.split(" ");//入力値を空白で分解する

    
        // int num1 = Integer.parseInt(param[0]);
        // String calmark = param[1];
        // int num2 = Integer.parseInt(param[2]);
        int ListElements = param.length;
        int sum = Integer.parseInt(param[0]);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("要素の長さ=" + ListElements);
        System.out.println("------------------------------------------------------------------------------------");




        for (int i = 1 ; i <= (ListElements - 1); i += 2){

            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("試行するiの値  :  " + i);





            if (param[i].equals("+")){
                sum += Integer.parseInt(param[i+1]);
                System.out.println("計算種類      + parten");
                System.out.println("今までの合計値sumの値:  " + sum);



            } else if (param[i].equals("-")){
                sum -= Integer.parseInt(param[i+1]);
                System.out.println("計算種類       - parten");
                System.out.println("今までの合計値sumの値:  " + sum);


            } else {
                ;
            } 
        }


    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");

    System.out.println("--------------------------------------------------------------------------");
    System.out.println("--------------------------------------------------------------------------");
    System.out.println("for文から脱出");
    System.out.println("--------------------------------------------------------------------------");
    System.out.println("--------------------------------------------------------------------------");

    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("処理完了後の累計値  :   " + sum);


    }
}





    
    
    

