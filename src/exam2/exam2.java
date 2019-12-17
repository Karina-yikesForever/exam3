package exam2;

import java.util.ArrayList;
import java.util.LinkedList;

 class Main {

    public static void main(String[] args) {

    ArrayList<Person> personArrayList=new ArrayList<>();
        Person p=new Person("Karina","Kokosova","Daniyarovna");
        Person p1=new Person("Erica","Ryskulova","Kylanbekovna");
        Person p2=null;
        personArrayList.add(p1);
        personArrayList.add(p);
        System.out.println(personArrayList);

        }


        }


class Person{
    private String firstName;
    private String secondName;
    private String Otchestvo;

    public Person(String firstName, String secondName, String otchestvo) {
        this.firstName = firstName;
        this.secondName = secondName;
        Otchestvo = otchestvo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getOtchestvo() {
        return Otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        Otchestvo = otchestvo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", Otchestvo='" + Otchestvo + '\'' +
                '}';
    }
}

