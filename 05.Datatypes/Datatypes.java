class Datatypes {
    public static void main(String[] args) {
        // Primitive data types
        byte byteVariable = 127;
        short shortVariable = 32000;
        int intVariable = 1234567890;
        long longVariable = 123456789012345L; // Note the 'L' suffix for long literals 
        float floatVariable = 3.14f; // Note the 'f' suffix for float literals
        double doubleVariable = 3.14159265359;
        char charVariable = 'A';
        boolean booleanVariable = true;

        // Outputting primitive data types
        System.out.println("byteVariable: " + byteVariable);
        System.out.println("shortVariable: " + shortVariable);
        System.out.println("intVariable: " + intVariable);
        System.out.println("longVariable: " + longVariable);
        System.out.println("floatVariable: " + floatVariable);
        System.out.println("doubleVariable: " + doubleVariable);
        System.out.println("charVariable: " + charVariable);
        System.out.println("booleanVariable: " + booleanVariable);

        // Reference data types
        String stringVariable = "Hello, world!";
        int[] arrayVariable = {1, 2, 3, 4, 5};
        
        // Outputting reference data types
        System.out.println("stringVariable: " + stringVariable);
        System.out.print("arrayVariable: ");
        for (int i : arrayVariable) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
