package javaprogrammesweek8;

/*25. Example of Constructor Overloading
//Java program to overload constructors
class javaprogrammesweek8.Student5{
int id;
String name;
int age;
//creating two arg constructor
javaprogrammesweek8.Student5(int i,String n){
id = i;
name = n;
}
//creating three arg constructor
javaprogrammesweek8.Student5(int i,String n,int a){
id = i;
name = n;
age=a;
}
public void display(){System.out.println(id+" "+name+" "+age);}
public static void main(String args[]){
javaprogrammesweek8.Student5 s1 = new javaprogrammesweek8.Student5(111,"Karan");
javaprogrammesweek8.Student5 s2 = new javaprogrammesweek8.Student5(222,"Aryan",25);
s1.display();
s2.display();
}
}
Output:
111 Karan 0
222 Aryan 25*/
//Java program to overload constructors
class Student5 {
    int id;
    String name;
    int age;

    //creating a two arg constructor
    Student5(int i,String n){
        id = i;
        name = n;
    }
    //creating a three arg constructor
    Student5(int i,String n, int a){
        id = i;
        name = n;
        age = a;
    }
    public void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        Student5 s1 = new Student5(111,"Karan");
        Student5 s2 = new Student5(222,"Aryan",25);
        s1.display();
        s2.display();
    }

}
