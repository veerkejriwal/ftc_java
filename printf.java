public class printf{
    public static void main(String[]args){
        String name1 = "john";
        String name2 = "maya";
        int age1 = 14;
        int age2 = 13;
        char grade1 = 'A';
        char grade2 = 'B';
        System.out.printf("name\tage\tgrade\n%s\t%d\t%c\n%s\t%d\t%c", name1, age1, grade1, name2, age2, grade2);
    }
}
