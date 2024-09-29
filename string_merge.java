import java.util.Scanner;
public class StringMerger 
{
    public static String mergeStrings(String s1, String s2) 
    {
        StringBuilder mergedString = new StringBuilder();
        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) 
        {
            mergedString.append(s1.charAt(i)).append(s2.charAt(j));
            i++;
            j++;
        }

        if (i < s1.length()) 
        {
            mergedString.append(s1.substring(i));
        }

        if (j < s2.length()) 
        {
            mergedString.append(s2.substring(j));
        }

        return mergedString.toString();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1:");
        String s1 = sc.next();
        System.out.println("Enter string2:");
        String s2 = sc.next();
        String mergedString = mergeStrings(s1, s2);
        System.out.println(mergedString); 
    }
}

***OUTPUT***

Enter string1:
abc
Enter string2:
defghi
adbecfghi
