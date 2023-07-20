package com.cydeo.java9;


public class CompactStringDemo {//With java 9 they change the String system and start to use Latin-1 which allocate 1 byte for one char. And they start to use byte instead of char, added coder which is checking if the String data can be used with Latin-1 or UTF-16.

    public static void main(String[] args) {


        String abc = "cydeo";

        /*
         * The value is used for character storage.
         *
         * @implNote This field is trusted by the VM, and is a subject to
         * constant folding if String instance is constant. Overwriting this
         * field after construction will cause problems.
         *
         * Additionally, it is marked with {@link Stable} to trust the contents
         * of the array. No other facility in JDK provides this functionality (yet).
         * {@link Stable} is safe here, because value is never null.

        @Stable
        private final byte[] value;


         * The identifier of the encoding used to encode the bytes in
         * {@code value}. The supported values in this implementation are
         *
         * LATIN1
         * UTF16
         *
         * @implNote This field is trusted by the VM, and is a subject to
         * constant folding if String instance is constant. Overwriting this
         * field after construction will cause problems.

        private final byte coder;
        */

    }
}
