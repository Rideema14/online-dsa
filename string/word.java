import java.util.Scanner;
class word {
    static String replace(String str, String oword, String nword) {
        String[] word = str.split(" ");
        String newStr = "";

        for (String w : word) {
            if (w.equals(oword)) {
                newStr = newStr + " " + nword;
            } else {
                newStr = newStr + " " + w;
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter the old word");
        String oword = sc.nextLine();
        System.out.println("Enter the new word");
        String nword = sc.nextLine();
        System.out.println(replace(str, oword, nword));
    }
}

