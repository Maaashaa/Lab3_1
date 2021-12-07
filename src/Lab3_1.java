
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Lab3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату: ");
        String date = in.nextLine();
        //StringBuffer strBuffer = new StringBuffer(date);
        //Второй вариант: просто расскомментировать StringBuffer, оставив всё, что ниже и выше(кроме других коммантариев(и StringBuilder))
        //StringBuilder strBuilder = new StringBuilder(date);
        //Третий вариант: просто расскомментировать StringBuilder, оставив всё, что ниже и выше(кроме других коммантариев(и StringBuffer))
        String pattern = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((1[9]|2[0-9]|3[0-9]|4[0-9]|5[0-9]|6[0-9]|7[0-9]|8[0-9]|9[0-9])\\d\\d)$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(date);
        if (m.find()) {
                System.out.println("Это дата!");
            }
        else {
                System.out.println("Некорректный формат даты!");
                }

            in.close();
    }
    }


