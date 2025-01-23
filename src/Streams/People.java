package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class People {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public static void main(String[] args) {
        List<People> list = new ArrayList<>();
        list.add(new People("Amit",25));
        list.add(new People("Alex",35));
        list.add(new People("Tom",67));
        list.add(new People("Roger",75));
        list.add(new People("Def",12));

        List<People> newList = list.stream().filter(people -> people.age <=25).collect(Collectors.toList());

        newList.forEach(people -> System.out.println(people.name));
    }
}
