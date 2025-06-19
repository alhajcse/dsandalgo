/*
    Type	Passed as	Modifies original?	Example changes
    Primitive	Value	❌ No	int, float
    Object	Reference (by value)	✅ Yes (if modifying fields)	person.name = "Alhaj"
    Object	Reference (by value)	❌ No (if reassigning the object)	person = new Person()
*/
public class Main {
    public static void main(String[] args) {
        int a = 5;
        change(a);
        System.out.println("Call by Value (Primitive Type): "+a);



        Person person = new Person();
        person.name="Masum";
        change(person);
        System.out.println("Call By Value Object Reference: "+person.name);
    }

    static void change(int x) {
        x = 10;
    }

    static void change(Person person) {
        person.name="Alhaj";

        person=new Person();
        person.name="Hasan";
    }
}



