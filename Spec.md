### Overview of Primitive Arrays in Java and Their Downsides

Primitive arrays in Java are simple data structures that allow you to store multiple values of the same type. However, they have limitations:

1. Fixed Size: Once an array is created, you can't change its size.
2. Lack of Utility Methods: Arrays don't come with built-in methods for adding, removing, or searching for elements.
3. Type Restrictions: Only one data type can be stored, either primitive or objects.

### Assignment: Implement a Custom Array Class in Java

To address these issues, the assignment is to create a custom `Array` class in Java.

#### Functions to Implement:

1. `public void add(T element)`: Adds an element to the end of the array.
2. `public void add(int index, T element)`: Adds an element at a specific index.
3. `public T get(int index)`: Retrieves the element at a given index.
4. `public void set(int index, T element)`: Sets the value at a given index.
5. `public int size()`: Returns the number of elements.
6. `public void remove(int index)`: Removes the element at a given index.
7. `public boolean contains(T element)`: Checks if the array contains a certain element.
8. `public void clear()`: Removes all elements from the array.

#### Example Main Function:

```java
public static void main(String[] args) {
    MyArray<Integer> myArray = new MyArray<>();

    myArray.add(1);
    myArray.add(2);
    myArray.add(3);

    System.out.println(myArray.get(0));  // Output: 1
    System.out.println(myArray.size());  // Output: 3

    myArray.remove(0);

    System.out.println(myArray.get(0));  // Output: 2
    System.out.println(myArray.size());  // Output: 2

    System.out.println(myArray.contains(3));  // Output: true
    myArray.clear();
    System.out.println(myArray.size());  // Output: 0
}
```


#### Class Implementation

Note: You might need to dynamically resize the internal array for methods like `add()`.

Now you can assign this to your student. Good luck!
