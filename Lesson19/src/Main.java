import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        Random rdm = new Random();

	    //String1. Дан символ C. Вывести его код (то есть номер в кодовой таблице).

        /*char c;
        c = in.nextLine().charAt(0);
        System.out.println(c);*/

        //String2. Дано целое число N (32 ≤ N ≤ 126). Вывести символ с кодом, равным N.

        /*int num = rdm.nextInt(126)+32;
        System.out.println((char)num);*/

        //String4. Дано целое число N (1 ≤ N ≤ 26). Вывести N первых прописных (то
        //есть заглавных) букв латинского алфавита.

        /*for (int i = 'A'; i <= 'Z'; i++ ){
            System.out.print((char)i+" ");
        }
        System.out.println();
        for (int i = 'A' + 32; i <= 'Z' + 32; i++ ){        //Таким образом
            System.out.print((char)i+" ");                  //можно перевести заглавные буквы
        }*/                                                   //в прописные и наоброт

        //в цикле можно использвать char потому, что у символов есть код и он приравнивается к int
        /*for (char c = 'A'; c <= 'Z'; c++ ){
            System.out.print(c+" ");
        }*/

        /*String str = in.nextLine();
        int offset = 'a' - 'A';
        StringBuilder buf = new StringBuilder(str);
        for (int i = 0; i < buf.length(); i++){
            int c = buf.charAt(i) + offset;
            buf.setCharAt(i, (char)c);
        }
        System.out.println(buf);*/

        //Вводится предложение без знаков препинания на английском языке.
        //Слова в предложении разделяются ровно одним пробелом.
        //Написать статический метод, который сделает первые буквы слов большими

        /*String str = in.nextLine();
        System.out.println(task1(str));
        System.out.println(task2(str));*/

        //String14. Дана строка.
        //Подсчитать количество содержащихся в ней прописных
        //латинских букв.

        /*String str = in.nextLine();
        System.out.println(qntLowerKeys(str));*/

        //String15. Дана строка. Подсчитать
        //общее количество содержащихся в ней
        //строчных латинских и русских букв.

        /*String str = in.nextLine();
        System.out.println(qntLowerKeysRus(str));*/

        //String16. Дана строка. Преобразовать
        //в ней все прописные латинские буквы в
        //строчные

        String str = in.nextLine();


    }
    public static String (String str){
        StringBuilder buf = new StringBuilder(str);
        for (int i = 0; i < buf.length(); i++){

        }
    }
    public static int qntLowerKeysRus(String str){
        int k = 0;
        for (int i = 0; i < str.length(); i++){
            if (isLower(str, i) || isLowerRus(str, i)){
                k++;
            }
        }
        return k;
    }
    public static int qntLowerKeys(String str){
        int k = 0;
        for (int i = 0; i < str.length(); i++){
            if (isLower(str, i)/*'a' <= str.charAt(i) && str.charAt(i) <= 'z'*/){
                k++;
            }
        }
        return k;
    }
    public static boolean isLowerRus(String str, int index){
        return 'а' <= str.charAt(index) && 'А' <= str.charAt(index);
    }
    public static boolean isLower(String str, int index){
        return 'a' <= str.charAt(index) && 'A' <= str.charAt(index);
    }
    public static void charLowerToUpper(StringBuilder buf, int i){
        int offset = 'a' - 'A';
        int c = buf.charAt(i) - offset;
        buf.setCharAt(i, (char)c);
    }
    public static String task1(String str){
        StringBuilder buf = new StringBuilder(str);
        for(int i = 0; i < buf.length(); i++){
            if (buf.charAt(i) == ' '){
                charLowerToUpper(buf, i+1);
            }
        }
        if('a' <= buf.charAt(0) && buf.charAt(0) <= 'z'){
            charLowerToUpper(buf, 0);
        }
        return buf.toString();
    }
    public static String task2(String str){
        StringBuilder buf = new StringBuilder(str);
        for(int i = 1; i < buf.length(); i++){
            if (buf.charAt(i) != ' ' && buf.charAt(i-1) == ' '){
                //isLetter(buf,i) && isLowerCase(buf,i) && isSpace(buf,i-1)
                charLowerToUpper(buf, i);
            }
        }
        if('a' <= buf.charAt(0) && buf.charAt(0) <= 'z'){
            charLowerToUpper(buf, 0);
        }
        return buf.toString();
    }
}
