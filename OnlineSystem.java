package Task04;

abstract class User{
    abstract void login();
}

class Student extends User{
    @Override
    void login() {
        System.out.println("Student is logged in.");
    }
}

class Instructor extends User{
    @Override
    void login() {
        System.out.println("Instructor is logged in. ");
    }
    void uploadCourse(){
        System.out.println("Instructor uploaded the course.");
    }
}
public class OnlineSystem {
    public static void main(String[] args) {
        User s = new Student();
        User i = new Instructor();

        s.login();
        i.login();
        ((Instructor) i).uploadCourse();
    }
}
