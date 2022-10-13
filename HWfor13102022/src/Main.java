import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
-----Кучмель Павел Викторович----------------------------------------------------------------------------
         */
        //String15. Дана строка. Подсчитать
        //общее количество содержащихся в ней
        //строчных латинских и русских букв.

        /*String str = in.nextLine();
        System.out.println(qntUpperAndLowerKeyEngAndRus(str));*/

        //String16. Дана строка. Преобразовать
        //в ней все прописные латинские буквы в строчные

        /*String str = in.nextLine();
        System.out.println(changeLetterCase(str));*/

/*--------------------------------------*/

        String str = "Object-oriented programming is a programming language model " +
                "organized around objects rather than \"actions\" and data rather than logic. " +
                "Object-oriented programming blabla. Object-oriented programming bla. Object-oriented programming blabla. Object-oriented programming bla.";
        System.out.println(changeToOOP(str));
    }

    public static String changeToOOP(String str){
        String regex = "Object-oriented programming";
        String target = "OOP";
        StringBuilder buffer = new StringBuilder(str.replace(regex, "*"));
        StringBuilder res = new StringBuilder();
        for (int i = 0, j = 0; i < buffer.length(); i++){
            if (buffer.charAt(i) == '*' && j%2==0){
                res.append(regex);
                j++;
            }
            else {
                if (buffer.charAt(i) == '*' && j%2!=0){
                    res.append(target);
                    j++;
                }
                else res.append(buffer.charAt(i));
            }
        }
        return res.toString();
    }

    public static String changeLetterCase(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if (isLowerEng(str, i)) sb.append(charLowerToUpper(str.charAt(i)));
            else sb.append(charUpperToLower(str.charAt(i)));
        }
        return sb.toString();
    }
    public static char charUpperToLower(char ch){
        int offset = 'a' - 'A';
        return (char)(ch + offset);
    }
    public static char charLowerToUpper(char ch){
        int offset = 'a' - 'A';
        return (char)(ch - offset);
    }
    public static int qntUpperAndLowerKeyEngAndRus(String str){
        return qntLowerKeysEngRus(str)+qntUpperKeysEngRus(str);
    }
    public static int qntUpperKeysEngRus(String str){
        int k = 0;
        for (int i = 0; i < str.length(); i++){
            if (isUpperEng(str, i) || isUpperRus(str, i)){
                k++;
            }
        }
        return k;
    }
    public static int qntLowerKeysEngRus(String str){
        int k = 0;
        for (int i = 0; i < str.length(); i++){
            if (isLowerEng(str, i) || isLowerRus(str, i)){
                k++;
            }
        }
        return k;
    }
    public static boolean isUpperRus(String str, int index){
        return 'А' <= str.charAt(index) && 'Я' >= str.charAt(index);
    }
    public static boolean isUpperEng(String str, int index){
        return 'A' <= str.charAt(index) && 'Z' >= str.charAt(index);
    }
    public static boolean isLowerRus(String str, int index){
        return 'а' <= str.charAt(index) && 'я' >= str.charAt(index);
    }
    public static boolean isLowerEng(String str, int index){
        return 'a' <= str.charAt(index) && 'z' >= str.charAt(index);
    }
}