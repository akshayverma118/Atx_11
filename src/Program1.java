public class Program1 {

    public static void main (String [] args)
    {
        String rev = "Akshay";
        String rev1 = " ";
        char chr;


        for(int i =0; i < rev.length(); i++)
        {
            chr = rev.charAt(i);
            rev1 = chr + rev1;
        }

        System.out.println("Reverse String is " + rev1);
        System.out.println("Reverse String is " + rev1);

    }
}
