//parameterized constructor in java//
class student{
    String name;
    student(String nm){
        name=nm;
        
    }
    void display(){
        System.out.println(name);
    }
}

public class p6 {

    public static void main(String[] args) {
        student obj = new student("sachin");
        obj.display();
    }
}