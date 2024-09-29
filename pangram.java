public class PangramCheck 
{
    public static void main(String[] args) 
    {
        String sentence = "The quick brown fox jumps over the lazy Dog";
        System.out.println(isPangram(sentence) ? 1 : -1);
    }

    public static boolean isPangram(String sentence) 
    {
        sentence = sentence.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) 
        {
            if (!sentence.contains(String.valueOf(c))) 
            {
                return false;  
            }
        }
        return true;  
    }
}

***OUTPUT***

1