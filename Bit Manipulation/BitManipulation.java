public class BitManipulation {

    // Function to set the ith bit of n to 1
    // Time Complexity: O(1)
    public static int setIthBit(int n, int pos) {
        int mask = (1 << pos);  
        n = n | mask; 
        return n; 
    }

    // Function to get the value of the ith bit of n
    // Time Complexity: O(1)
    public static int getIthBit(int n, int pos) {
        int mask = (1 << pos);  
        int bitval = n & mask;  
        if (bitval != 0) {  
            return 1;  
        }
        return 0;  
    }

    // Function to clear the ith bit of n (set it to 0)
    // Time Complexity: O(1)
    public static int clearIthBit(int n, int pos) {
        int mask = ~(1 << pos);  
        n = n & mask;  
        return n; 
    }

    // Function to clear all bits from the 0th to the (pos-1)th position
    // Time Complexity: O(1)
    public static int clearLastIBits(int n, int pos) {
        int mask = (-1 << pos);  
        n = n & mask;  
        return n;  
    }

    // Function to update the ith bit of n to val (0 or 1)
    // Time Complexity: O(1)
    public static int updateIthBit(int n, int pos, int val) {
        n = clearIthBit(n, pos);  
        int mask = (val << pos);  
        n = n | mask;  
        return n; 
    }

    // Function to clear all bits from position i to j
    // Time Complexity: O(1)
    public static int clearBItInRange(int n, int i, int j) {
        int a = (~0) << (j + 1);  
        int b = (1 << i) - 1; 
        int mask = a | b; 
        n = n & mask; 
        return n;  
    }

    // Function to count the number of 1s in the binary representation of n
    // Time Complexity: O(K) where K is the number of 1s in n
    public static int countOne(int n) {
        int count = 0; 
        while (n != 0) {  
            n = n & (n - 1);  
            count++;  
        }
        return count;  
    }

    // Function to convert a decimal number n to its binary equivalent
    // Time Complexity: O(logN)
    public static int convertToBinary(int n) {
        int ans = 0;  
        int temp = 1;  
        while (n > 0) {  
            int last = n & 1;  
            ans = ans + (temp * last);  
            temp = temp * 10;  
            n = n >> 1;  
        }
        return ans; 
    }

    // Function to compute base raised to the power of power using brute-force
    // Time Complexity: O(power)
    public static int power(int base, int power) {
        int box = 1;  
        while (power > 0) {  
            box = base * box; 
            power--;  
        }
        return box;  
    }

    // Function to compute base raised to the power of power using fast exponentiation
    // Time Complexity: O(logN)
    public static int fastExpo(int base, int power) {
        int ans = 1;  
        while (power > 0) {  
            int lastbit = power & 1; 
            if (lastbit == 1) {  
                ans = ans * base;  
            }
            base = base * base;  
            power = power >> 1;  
        }
        return ans; 
    }

    // Function to check if a number is even or odd using the modulus operator
    // Time Complexity: O(1)
    public static void findEvenOdd(int n) {
        if (n % 2 == 0) {  
            System.out.println("The number is even");
        } else {  
            System.out.println("The number is odd");
        }
    }

    // Function to check if a number is even or odd using bitwise operations
    // Time Complexity: O(1)
    public static void findOddEven(int n) {
        if ((n & 1) == 1) {  
            System.out.println("The number is odd");
        } else {  
            System.out.println("The number is even");
        }
    }

    // Function to check if a number is a power of two using a loop
    // Time Complexity: O(logN)
    public static boolean isPowerOfTwoLoop(int x) {
        if (x == 0) return false;  
        while (x % 2 == 0)  
            x /= 2;  
        return (x == 1);  
    }

    // Function to check if a number is a power of two using bitwise operations
    // Time Complexity: O(1)
    public static boolean isPowerOfTwo(int x) {
      
        return (x != 0) && ((x & (x - 1)) == 0);  
    }

    public static void main(String[] args) {
        int n = 13;

        // System.out.println(setIthBit(n, 1));
        // System.out.println(getIthBit(n, 1));
        // System.out.println(clearIthBit(n, 0));
        // System.out.println(clearLastIBits(n, 3));
        // System.out.println(clearBItInRange(n, 0, 2));
        // System.out.println(updateIthBit(n, 2, 1));
        // System.out.println(countOne(n));
        // System.out.println(convertToBinary(5));
        // System.out.println(power(2, 5));
        // System.out.println(fastExpo(2, 5));
        // findEvenOdd(4);
        // findOddEven(3);

        // if (isPowerOfTwoLoop(4)) {
        //     System.out.println("It is a power of Two");
        // } else {
        //     System.out.println("It is not a power of Two");
        // }

        // if (isPowerOfTwo(4)) {
        //     System.out.println("It is a power of Two");
        // } else {
        //     System.out.println("It is not a power of Two");
        // }
    }
}
