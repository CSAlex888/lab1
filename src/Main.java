import java.util.Arrays;
import java.util.Scanner;
class Operations
{
    //a
    public int Sum(int n)
    {
        int summa = 0;
        while (n>0)
        {
            summa += n%10;
            n /=10;
        }
        return summa;
    }
    public void Digits(int i)
    {
        for ( i = 0; i <= 300; i++) {
            if (i % 4 == 0 && i % 6 != 0 && Sum(i) < 10) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    //b
    public String Middle2(String str)
    {
        if (str.length() % 2 == 0)
        {
            return str.substring(str.length()/2-1, str.length()/2+1);
        }
        else
        {
            return "Строка должна иметь четную длину!!!";
        }
    }
    //c
    public int UniqueSims(String str)
    {
        String t = "";
        int count =0;
        for (int i=0; i<str.length();i++)
        {
            if (t.indexOf(str.charAt(i))==-1)
            {
                t+=str.charAt(i);
            }
        }
        return t.length();
    }
    public String Mini(String str)
    {
        String[] words = str.split("\\s+");
        String minWord = words[0];
        int minCount = UniqueSims(words[0]);
        for(int i=1;i<words.length; i++)
        {
            int count = UniqueSims(words[i]);
            {
                if (count < minCount)
                {
                    minWord = words[i];
                    minCount = count;
                }
            }
        }
        return minWord;
    }

    //d
    public int Latina(String str)
    {
        String[] words = str.split("\\s+");
        int count = 0;
        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];
            if (word.matches("[a-zA-Z]+"))
            {
                count++;
            }
        }
        return count;
    }

}

public class Main {
    public static void main(String[] args) {
        Operations oper = new Operations();

        oper.Digits(0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с четным количеством символов:");
        String input = scanner.nextLine();
        System.out.println("Результат: " + oper.Middle2(input));

        // Задание С
        System.out.println("Введите слова:");
        input = scanner.nextLine();
        System.out.println("Результат: " + oper.Mini(input));

        // Задание Д
        System.out.println("Введите предложение:");
        input = scanner.nextLine();
        System.out.println("Результат: " + oper.Latina(input));
    }
}