Here's a comprehensive guide to common bit manipulation operations in C, including corrections for the issues in your provided code.

### Bit Manipulation Operations in C

1. **Setting a Bit**

   To set (make `1`) the bit at position `pos`:
   ```c
   int setIthBit(int n, int pos) {
       int mask = (1 << pos);
       n = n | mask;
       return n;
   }
   ```

2. **Getting a Bit**

   To get the value of the bit at position `pos`:
   ```c
   int getIthBit(int n, int pos) {
       int mask = (1 << pos);
       int bitval = n & mask;
       return (bitval >> pos) & 1; // Extract the bit value and shift it to the least significant position
   }
   ```

3. **Clearing a Bit**

   To clear (make `0`) the bit at position `pos`:
   ```c
   int clearIthBit(int n, int pos) {
       int mask = ~(1 << pos);
       n = n & mask;
       return n;
   }
   ```

4. **Clearing Last `i` Bits**

   To clear the last `i` bits:
   ```c
   int clearLastIBits(int n, int pos) {
       int mask = ~((1 << pos) - 1);
       n = n & mask;
       return n;
   }
   ```

5. **Updating a Bit**

   To update the bit at position `pos` to a specific value (`0` or `1`):
   ```c
   int updateIthBit(int n, int pos, int val) {
       n = clearIthBit(n, pos); // Clear the bit at position
       int mask = (val << pos); // Create a mask with the desired bit value
       n = n | mask; // Set the bit to the new value
       return n;
   }
   ```

6. **Toggling a Bit**

   To toggle (flip) the bit at position `pos`:
   ```c
   int toggleIthBit(int n, int pos) {
       int mask = (1 << pos);
       n = n ^ mask;
       return n;
   }
   ```

7. **Checking if a Bit is Set**

   To check if the bit at position `pos` is set to `1`:
   ```c
   int isBitSet(int n, int pos) {
       int mask = (1 << pos);
       return (n & mask) != 0;
   }
   ```

8. **Count Number of Set Bits (Hamming Weight)**

   To count the number of `1`s in the binary representation:
   ```c
   int countSetBits(int n) {
       int count = 0;
       while (n) {
           count += n & 1; // Add least significant bit to count
           n >>= 1; // Right shift to process the next bit
       }
       return count;
   }
   ```

9. **Finding the Position of the Rightmost Set Bit**

   To find the position of the rightmost set bit (starting from `0`):
   ```c
   int rightmostSetBit(int n) {
       return n & -n; // Isolate the rightmost set bit
   }
   ```

10. **Checking Power of Two**

    To check if a number is a power of two:
    ```c
    int isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
    ```

### Corrections for Your Code

Here's the corrected version of your functions based on common issues and improvements:

```c
#include <stdio.h>

int setIthBit(int n, int pos) {
    int mask = (1 << pos);
    n = n | mask;
    return n;
}

int getIthBit(int n, int pos) {
    int mask = (1 << pos);
    int bitval = n & mask;
    return (bitval >> pos) & 1; // Extract and return the bit value
}

int clearIthBit(int n, int pos) {
    int mask = ~(1 << pos);
    n = n & mask;
    return n;
}

int clearLastIBits(int n, int pos) {
    int mask = ~((1 << pos) - 1);
    n = n & mask;
    return n;
}

int updateIthBit(int n, int pos, int val) {
    n = clearIthBit(n, pos); // Clear the bit
    int mask = (val << pos); // Set the new bit value
    n = n | mask;
    return n;
}

int toggleIthBit(int n, int pos) {
    int mask = (1 << pos);
    n = n ^ mask;
    return n;
}

int main() {
    int n = 31;

    // Example usage
    printf("Original: %d\n", n);
    printf("Set 2nd bit: %d\n", setIthBit(n, 2));
    printf("Get 1st bit: %d\n", getIthBit(n, 1));
    printf("Clear 0th bit: %d\n", clearIthBit(n, 0));
    printf("Clear last 3 bits: %d\n", clearLastIBits(n, 3));
    printf("Update 2nd bit to 0: %d\n", updateIthBit(n, 2, 0));
    printf("Toggle 2nd bit: %d\n", toggleIthBit(n, 2));

    return 0;
}
```

This corrected code ensures that each function performs its intended operation correctly.


# Fast Expo:
Here is a simple logarithm table for base 2, 10, and the natural logarithm (base \(e\)) for values from 1 to 10:

### Logarithm Table

| \(n\) | \( \log_2(n) \) | \( \log_{10}(n) \) | \( \ln(n) \)  |
|-------|-----------------|--------------------|---------------|
| 1     | 0               | 0                  | 0             |
| 2     | 1               | 0.3010             | 0.6931        |
| 3     | 1.5850          | 0.4771             | 1.0986        |
| 4     | 2               | 0.6021             | 1.3863        |
| 5     | 2.3219          | 0.6989             | 1.6094        |
| 6     | 2.5850          | 0.7782             | 1.7918        |
| 7     | 2.8074          | 0.8451             | 1.9459        |
| 8     | 3               | 0.9031             | 2.0794        |
| 9     | 3.1699          | 0.9542             | 2.1972        |
| 10    | 3.3219          | 1                  | 2.3026        |

### How to Read the Table

- **\( \log_2(n) \)**: This is the binary logarithm, which is commonly used in computer science.
  - Example: \( \log_2(8) = 3 \) because \( 2^3 = 8 \).

- **\( \log_{10}(n) \)**: This is the common logarithm (base 10).
  - Example: \( \log_{10}(100) = 2 \) because \( 10^2 = 100 \).

- **\( \ln(n) \)**: This is the natural logarithm, which has a base \( e \approx 2.718 \).
  - Example: \( \ln(e) = 1 \) because \( e^1 = e \).

### Note

- The values in the table are rounded to 4 decimal places for simplicity.
- For most algorithmic purposes, the binary logarithm (\( \log_2 \)) is the most relevant, especially in analyzing the time complexity of algorithms like binary search or certain divide-and-conquer strategies.

If you need a more extensive logarithm table or logarithms for other bases, calculators and software tools like Python or Excel can compute them for any number.


---------------------------------------------------------------------------------------------------------------------------

In programming, determining whether a number is even or odd can be done using both the modulus (`%`) operator and the bitwise AND (`&`) operator. Here’s how each approach works, along with their differences:

### Using the Modulus Operator (`%`)

**Method**:  
- The modulus operator returns the remainder of the division of two numbers.
- To check if a number `n` is even or odd, you would use the expression `n % 2`.

**Logic**:
- If `n % 2 == 0`, then `n` is even.
- If `n % 2 == 1`, then `n` is odd.

**Example**:
```c
int n = 5;
if (n % 2 == 0) {
    printf("Even\n");
} else {
    printf("Odd\n");
}
```
- For `n = 5`, the result of `5 % 2` is `1`, so the number is odd.

### Using the Bitwise AND Operator (`&`)

**Method**:  
- The bitwise AND operator compares each bit of two numbers.
- To check if a number `n` is even or odd, you would use the expression `n & 1`.

**Logic**:
- If `n & 1 == 0`, then `n` is even.
- If `n & 1 == 1`, then `n` is odd.

**Why It Works**:
- The binary representation of even numbers always ends in `0` (e.g., `...10`, `...00`).
- The binary representation of odd numbers always ends in `1` (e.g., `...01`, `...11`).
- By performing `n & 1`, you're checking the least significant bit (LSB). If it’s `1`, the number is odd; if it’s `0`, the number is even.

**Example**:
```c
int n = 5;
if (n & 1) {
    printf("Odd\n");
} else {
    printf("Even\n");
}
```
- For `n = 5`, the result of `5 & 1` is `1`, so the number is odd.

### Differences Between `%` and `&` for Even/Odd Checking

1. **Performance**:
   - **Bitwise AND (`&`)** is generally faster than the modulus operator because it directly checks the least significant bit. It’s a single CPU instruction.
   - **Modulus (`%`)** is slightly slower because it involves a division operation, which is more computationally expensive than a bitwise operation.

2. **Simplicity**:
   - **Modulus (`%`)** is more intuitive and easier to understand for most people. It directly checks if there's a remainder when dividing by 2.
   - **Bitwise AND (`&`)** might be less intuitive at first, but it’s a common trick used in low-level programming due to its efficiency.

3. **Use Case**:
   - **Modulus (`%`)** is commonly used in high-level code where readability is prioritized.
   - **Bitwise AND (`&`)** is often used in performance-critical code, embedded systems, or when working directly with binary data.

### Summary

- Both methods achieve the same result, but using `& 1` is typically faster and more efficient because it operates directly at the bit level.
- `% 2` is more straightforward and easier to understand, making it more common in everyday programming unless performance is a critical concern.