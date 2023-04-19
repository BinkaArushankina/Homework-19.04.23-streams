package Homework;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        //Задача1 Person Address
        //Используя стримы, написать метод, принимающий список персонов и возвращающий список адресов тех,кто старше 17 лет.
        Person ann = new Person("Ann",25,new Address("street",1));
        Person dan = new Person("Dan",16,new Address("street",2));
        Person pit = new Person("Pit",20,new Address("street",3));
        List<Person> person= List.of(ann,dan,pit);
        System.out.println(main.getAddresses(person)); //street,1   street,3

        //Задача2
        //Используя стримы написать метод, принимающий строку, состоящую из слов, разделенных пробелом и букву и
        //возвращающий количество слов, начинающихся с этой буквы.
        String string="aaa ffff aa bbbb a bb aaa gggggggggggggg";
        System.out.println(main.countWords(string,"a"));   //4
    }
    //1)
    public List<Address> getAddresses(List<Person> input){
        return input.stream().filter(p -> p.getAge() > 17).map(Person::getAddress).collect(Collectors.toList());
    }
    //2)
    public long countWords(String input, String letter){
        return Stream.of(input.split(" ")).filter(w-> w.startsWith(letter)).count();
    }







}