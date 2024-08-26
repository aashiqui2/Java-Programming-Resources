public class BitManipulation {

    // Function to set the ith bit of n to 1
    // Time Complexity: O(1)
    public static int setIthBit(int n, int pos) {
        int mask = (1 << pos);  // Create a mask by shifting 1 left by pos positions
        n = n | mask;  // Set the ith bit by ORing n with the mask
        return n;  // Return the updated value of n
    }

    // Function to get the value of the ith bit of n
    // Time Complexity: O(1)
    public static int getIthBit(int n, int pos) {
        int mask = (1 << pos);  // Create a mask by shifting 1 left by pos positions
        int bitval = n & mask;  // Extract the ith bit by ANDing n with the mask
        if (bitval != 0) {  // If the extracted bit is non-zero
            return 1;  // Return 1
        }
        return 0;  // Otherwise, return 0
    }

    // Function to clear the ith bit of n (set it to 0)
    // Time Complexity: O(1)
    public static int clearIthBit(int n, int pos) {
        int mask = ~(1 << pos);  // Create a mask by shifting 1 left by pos positions and then inverting the bits
        n = n & mask;  // Clear the ith bit by ANDing n with the mask
        return n;  // Return the updated value of n
    }

    // Function to clear all bits from the 0th to the (pos-1)th position
    // Time Complexity: O(1)
    public static int clearLastIBits(int n, int pos) {
        int mask = (-1 << pos);  // Create a mask by shifting -1 left by pos positions
        n = n & mask;  // Clear the last pos bits by ANDing n with the mask
        return n;  // Return the updated value of n
    }

    // Function to update the ith bit of n to val (0 or 1)
    // Time Complexity: O(1)
    public static int updateIthBit(int n, int pos, int val) {
        n = clearIthBit(n, pos);  // First clear the ith bit
        int mask = (val << pos);  // Create a mask by shifting val left by pos positions
        n = n | mask;  // Set the ith bit to val by ORing n with the mask
        return n;  // Return the updated value of n
    }

    // Function to clear all bits from position i to j
    // Time Complexity: O(1)
    public static int clearBItInRange(int n, int i, int j) {
        int a = (~0) << (j + 1);  // Create a mask with all 1s above the (j+1)th bit
        int b = (1 << i) - 1;  // Create a mask with all 1s below the ith bit
        int mask = a | b;  // Combine both masks using OR
        n = n & mask;  // Clear the bits in the range by ANDing n with the mask
        return n;  // Return the updated value of n
    }

    // Function to count the number of 1s in the binary representation of n
    // Time Complexity: O(K) where K is the number of 1s in n
    public static int countOne(int n) {
        int count = 0;  // Initialize the count to 0
        while (n != 0) {  // While there are bits set to 1 in n
            n = n & (n - 1);  // Clear the lowest set bit
            count++;  // Increment the count
        }
        return count;  // Return the number of 1s
    }

    // Function to convert a decimal number n to its binary equivalent
    // Time Complexity: O(logN)
    public static int convertToBinary(int n) {
        int ans = 0;  // Initialize the binary representation to 0
        int temp = 1;  // Initialize the positional multiplier to 1
        while (n > 0) {  // While n is greater than 0
            int last = n & 1;  // Extract the last bit of n
            ans = ans + (temp * last);  // Build the binary representation
            temp = temp * 10;  // Update the positional multiplier
            n = n >> 1;  // Shift n right by 1 to move to the next bit
        }
        return ans;  // Return the binary representation
    }

    // Function to compute base raised to the power of power using brute-force
    // Time Complexity: O(power)
    public static int power(int base, int power) {
        int box = 1;  // Initialize the result to 1
        while (power > 0) {  // While power is greater than 0
            box = base * box;  // Multiply the base with the result
            power--;  // Decrease the power by 1
        }
        return box;  // Return the computed power
    }

    // Function to compute base raised to the power of power using fast exponentiation
    // Time Complexity: O(logN)
    public static int fastExpo(int base, int power) {
        int ans = 1;  // Initialize the result to 1
        while (power > 0) {  // While power is greater than 0
            int lastbit = power & 1;  // Extract the last bit of power
            if (lastbit == 1) {  // If the last bit is 1
                ans = ans * base;  // Multiply the base with the result
            }
            base = base * base;  // Square the base
            power = power >> 1;  // Shift power right by 1 to move to the next bit
        }
        return ans;  // Return the computed power
    }

    // Function to check if a number is even or odd using the modulus operator
    // Time Complexity: O(1)
    public static void findEvenOdd(int n) {
        if (n % 2 == 0) {  // If n is divisible by 2
            System.out.println("The number is even");
        } else {  // Otherwise
            System.out.println("The number is odd");
        }
    }

    // Function to check if a number is even or odd using bitwise operations
    // Time Complexity: O(1)
    public static void findOddEven(int n) {
        if ((n & 1) == 1) {  // If the last bit of n is 1
            System.out.println("The number is odd");
        } else {  // Otherwise
            System.out.println("The number is even");
        }
    }

    // Function to check if a number is a power of two using a loop
    // Time Complexity: O(logN)
    public static boolean isPowerOfTwoLoop(int x) {
        if (x == 0) return false;  // If x is 0, return false
        while (x % 2 == 0)  // While x is divisible by 2
            x /= 2;  // Divide x by 2
        return (x == 1);  // If x becomes 1, return true; otherwise, return false
    }

    // Function to check if a number is a power of two using bitwise operations
    // Time Complexity: O(1)
    public static boolean isPowerOfTwo(int x) {
        // Check if x is not zero and if x is a power of 2
        return (x != 0) && ((x & (x - 1)) == 0);  // Return true if x is a power of 2; otherwise, return false
    }

    public static void main(String[] args) {
        int n = 13;

        System.out.println(setIthBit(n, 1));
        System.out.println(getIthBit(n, 1));
        System.out.println(clearIthBit(n, 0));
        System.out.println(clearLastIBits(n, 3));
        System.out.println(clearBItInRange(n, 0, 2));
        System.out.println(updateIthBit(n, 2, 1));
        System.out.println(countOne(n));
        System.out.println(convertToBinary(5));
        System.out.println(power(2, 5));
        System.out.println(fastExpo(2, 5));
        findEvenOdd(4);
        findOddEven(3);

        if (isPowerOfTwoLoop(4)) {
            System.out.println("It is a power of Two");
        } else {
            System.out.println("It is not a power of Two");
        }

        if (isPowerOfTwo(4)) {
            System.out.println("It is a power of Two");
        } else {
            System.out.println("It is not a power of Two");
        }
    }
}
