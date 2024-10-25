class Persone_details
{
    public String name;
    public int age;
    public String address;

   //default constructor
    public Persone_details()
    {
        this.name="raj nihale";
        this.age=24;
        this.address="khargone";
    }

    //this is parameterised constructor to initialize values
    public Persone_details(String name, int age , String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
    //method with 2 parameters
    public void display(String name,int age)
    {
        System.out.println("My name is "+name+" and age:"+age);
    }
   //Method with more then 2 parameters
    public void display(String name, int age, String address)
    {
        System.out.println("My Name is "+name+ " and my Age "+age+" and Address "+address);
    }

}
public class Week2_third_qus {
    public static void main(String[] args) {
       Persone_details p = new Persone_details();
       p.display("raj nihale",24);
       p.display("Raj nihale",24,"khargone");
    }
}
