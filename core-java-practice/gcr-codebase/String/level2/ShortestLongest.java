import java.util.Scanner;

public class ShortestLongest {

    public static String[] splitWords(String text){
        return text.split(" ");
    }

    public static String[][] create2D(String[] words){

        String[][] data = new String[words.length][2];

        for(int i=0;i<words.length;i++){

            data[i][0]=words[i];
            data[i][1]=String.valueOf(words[i].length());
        }

        return data;
    }

    public static int[] shortestLongest(String[][] arr){

        int min=0;
        int max=0;

        for(int i=1;i<arr.length;i++){

            int len=Integer.parseInt(arr[i][1]);

            if(len < Integer.parseInt(arr[min][1]))
                min=i;

            if(len > Integer.parseInt(arr[max][1]))
                max=i;
        }

        return new int[]{min,max};
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text=sc.nextLine();

        String[] words=splitWords(text);

        String[][] arr=create2D(words);

        int[] result=shortestLongest(arr);

        System.out.println("Shortest = "+arr[result[0]][0]);
        System.out.println("Longest = "+arr[result[1]][0]);
    }
}