Java is statically types programming language.

| Data Type | Meaning             | Memory Size | Range                                       | Default Value |
|-----------|---------------------|-------------|---------------------------------------------|---------------|
| byte      | Whole numbers       | 1 byte      | -128 to +127                                | 0             |
| short     | Whole numbers       | 2 bytes     | -32768 to +32767                            | 0             |
| int       | Whole numbers       | 4 bytes     | -2,147,483,648 to +2,147,483,647            | 0             |
| long      | Whole numbers       | 8 bytes     | -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807 | 0L            |
| float     | Fractional numbers  | 4 bytes     | -                                           | 0.0f          |
| double    | Fractional numbers  | 8 bytes     | -                                           | 0.0d          |
| char      | Single character    | 2 bytes     | 0 to 65535                                  | \u0000        |
| boolean   | Unsigned char       | 1 bit       | 0 or 1                                      | 0 (false)     |


Number:

Byte- 1 byte -8bit -binary digit:0,1

   [2^8--2*2*2*2*2*2*2*2]
        
           256 /2

  [-128]----------[-1]---[0]---[+1]-----------[127]


short-2 bytes
    
     (2^8)^2  [256*256]  65536/2

 [-32768]----------[-1]---[0]---[+1]-----------[32767]

int- 4 bytes
    
    ((2^8)^4) [256*256*256*256]  [429967296/2]


 [-2147483648]----------[-1]---[0]---[+1]-----------[2147483647]


Long - 4 bytes in 32-bit size and 8 bytes in 64-bit size

((2^8)^8)   [256*256*256*256*256*256*256*256]  [1.84467440737E19]  

 [-9.223372036854775808]----------[-1]---[0]---[+1]-----------[9223372036854775807]

     
float- 4 bytes

double -8 bytes

char -1 byte

Boolean -1 bit