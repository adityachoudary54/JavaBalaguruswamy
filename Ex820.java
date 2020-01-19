/**
 * Ex820
 */
class staff{
    String code,name;//instance variables
    staff(String code,String name){
        this.code=code;
        this.name=name;
    }
    void displayStaff(){
        System.out.println("Name of staff is:"+name+" and code is:"+code);
    }
}
class teacher extends staff{
    String subject,publication;
    teacher(String code,String name,String subject,String publication){
        super(code, name);
        this.subject=subject;
        this.publication=publication;
    }
    void displayStaff(){
        super.displayStaff();
        System.out.println("I am a teacher");
        System.out.println("My subject is:"+subject+" and publication is:"+publication);
    }
}
class typist extends staff{
    int speed;
    typist(String code,String name,int speed){
        super(code, name);
        this.speed=speed;
    }
    void displayStaff(){
        super.displayStaff();
        System.out.println("I am a typist");
        System.out.println("My speed is:"+speed);
    }
}
class officer extends staff{
    String grade;
    officer(String code,String name,String grade){
        super(code, name);
        this.grade=grade;
    }
    void displayStaff(){
        super.displayStaff();
        System.out.println("I am a officer");
        System.out.println("My grade is:"+grade);
    }
}
public class Ex820 {

    public static void main(String[] args) {
        staff a=new staff("24", "Adi");
        a.displayStaff();
        teacher b=new teacher("67", "p", "eng", "bhatia");
        b.displayStaff();
        typist c = new typist("78","champ",780);
        c.displayStaff();
        officer d = new officer("78","champ","A+");
        d.displayStaff();
    }
}