package javaarrays;

public class JavaArrays {
    public static void main(String[] args) {
        
        // 1️⃣ Single-Dimensional Array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("🔹 Single-Dimensional Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Access and Update Element
        numbers[2] = 99;
        System.out.println("\nUpdated element at index 2: " + numbers[2]);

        // 2️⃣ Using new keyword
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";

        System.out.println("\n🔹 Fruits Array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 3️⃣ Multi-Dimensional Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\n🔹 Multi-Dimensional Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }

        // Access specific element
        System.out.println("\nElement at [1][2]: " + matrix[1][2]); // Output: 6

        // 4️⃣ Array of Strings
        String[] languages = {"Java", "Python", "C++", "JavaScript"};
        System.out.println("\n🔹 Array of Strings:");
        for (int i = 0; i < languages.length; i++) {
            System.out.println("Language " + (i + 1) + ": " + languages[i]);
        }

        // 5️⃣ Array length example
        System.out.println("\nTotal number of languages: " + languages.length);

        // 6️⃣ For-each Loop Example
        System.out.println("\n🔹 Using For-each Loop:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // 7️⃣ 3D Array Example
        int[][][] threeD = {
            { {1, 2}, {3, 4} },
            { {5, 6}, {7, 8} }
        };

        System.out.println("\n\n🔹 3D Array Example:");
        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++) {
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}


/**
Java Arrays
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value. To declare an array, define the variable type with square brackets [ ] :
String[] cars;
We have now declared a variable that holds an array of strings. To insert values to it, you can place the values in a comma-separated list, inside curly braces { }:
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

int[] myNum = {10, 20, 30, 40};
Access the Elements of an Array
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);

Change an Array Element
cars[0] = "Opel";

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
Now outputs Opel instead of Volvo


**/
