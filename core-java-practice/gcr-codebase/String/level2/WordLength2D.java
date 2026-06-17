import java.util.Scanner;

public class WordLength2D {

    public static String[] splitWords(String text){

        int count = text.split(" ").length;
        String[] words = new String[count];

        String word="";
        int index=0;

        for(int i=0;i<text.length();i++){

            if(text.charAt(i)==' '){
                words[index++] = word;
                word="";
            }
            else{
                word += text.charAt(i);
            }
        }

        words[index]=word;

        return words;
    }

    public static int findLength(String str){

        int count=0;

        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }
        catch(Exception e){}

        return count;
    }

    public static String[][] create2D(String[] words){

        String[][] data = new String[words.length][2];

        for(int i=0;i<words.length;i++){

            data[i][0]=words[i];
            data[i][1]=String.valueOf(findLength(words[i]));
        }

        return data;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] result = create2D(words);

        System.out.println("Word\tLength");

        for(String[] row : result){

            System.out.println(row[0]+"\t"+Integer.parseInt(row[1]));
        }
    }
}