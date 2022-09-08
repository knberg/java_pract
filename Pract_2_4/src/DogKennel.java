public class DogKennel {

    public static void main(String[] args) {

        Dog d1 = new Dog("Jake", 7);
        Dog d2 = new Dog("Sam", 2);
        Dog d3 = new Dog("Charlie", 4);

        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());

        System.out.println(d2.getAge());
        d2.setAge(3);
        System.out.println(d2.getAge());

        System.out.println(d2.getName() + "'s age in human years is " + d2.ageToHuman());

    }
}
