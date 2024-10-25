class Person
{
    public int age;
    public String name;
  //mathod for display age and name of a persone
    public void display(int age, String name)
    {
        System.out.println("Name of a person is :"+name);
        System.out.println("age of a person :"+age);
    }

}
public class Week2_first_qus {
    public static void main(String[] args) {
        Person p = new Person();
        p.display(24,"Raj Nihale");
    }

}
