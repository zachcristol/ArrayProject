public class Main {
    public static void main(String[] args) {
        MyArrayClass<Integer> myArray = new MyArrayClass<>(Integer.class);

        myArray.add(1);
        myArray.add(2);
        myArray.add(3);

        System.out.println(myArray.get(0));  // Should output 1 once implemented
        System.out.println(myArray.size());  // Should output 3 once implemented

        myArray.remove(0);

        System.out.println(myArray.get(0));  // Should output 2 once implemented
        System.out.println(myArray.size());  // Should output 2 once implemented

        System.out.println(myArray.contains(3));  // Should output true once implemented
        myArray.clear();
        System.out.println(myArray.size());  // Should output 0 once implemented
    }
}
