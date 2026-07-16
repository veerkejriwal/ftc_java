class student {
    String name;
    static int studentcount = 0;

    student(String n){
        name = n;
        studentcount++;
    }
}
public class staticvariabledemo {
    public static void main(String[]args){
        student s1 = new student("arya");
        student s2 = new student("rahul");
        student s3 = new student("veer");
        System.out.println(student.studentcount);
        
    }
}