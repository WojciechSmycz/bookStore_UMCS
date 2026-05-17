package utils;

public class unsignedInt {
    public static void main(String[] args) {
        long unsignedValue = 4_000_000_000L;

        int signedInt = (int) unsignedValue;

        long asUnsigned = Integer.toUnsignedLong(signedInt);

        System.out.println("Stored signed int: " + signedInt);
        System.out.println("Interpreted unsigned: " + asUnsigned);
    }
}

