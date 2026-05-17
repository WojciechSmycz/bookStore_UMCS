package utils;

public class unsignedInt {
    public static void main(String[] args) {
        // Example: unsigned value 4,000,000,000 (greater than signed int max)
        long unsignedValue = 4_000_000_000L;

        // Store in int (wraps around due to overflow)
        int signedInt = (int) unsignedValue;

        // Interpret as unsigned
        long asUnsigned = Integer.toUnsignedLong(signedInt);

        System.out.println("Stored signed int: " + signedInt); // Negative value
        System.out.println("Interpreted unsigned: " + asUnsigned); // Correct unsigned value
    }
}

