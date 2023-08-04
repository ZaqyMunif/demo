package com;

public class TipeData {
    public static void main(String[] args) {

        byte iniByte = 12;
        short iniShort_Konversi = iniByte;

        short iniShort = 32_767;
        int iniInt = 2_147_483_647;
        long iniLong = 923_337_203L;

        float iniFloat = 10.12F;
        long iniLong2 = (long) iniFloat;

        double iniDouble = 12.2424;

        int decimalInt = 25;
        int hexInt = 0xABCDEF;
        int binInt = 0b1010101010101;

        char e = 'E';
        char k = 'K';
        char o = 'O';

        System.out.print(e);
        System.out.print(k);
        System.out.print(o);

        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);

        String firstName = "Eko Kurniawan";
        String lastName = " Khannedy";
        String fullName = firstName + "" + lastName;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(fullName);

        // String name;
        final String name;
        name = "Muhamat Zaqy Munif";

        // int age = 20;
        var age = 20;
        // String address = "Indonesia";
        var address = "Indonesia";

        // name = "Paijo"; //sudah dikunci variable name nya

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        // Membuat array
        String[] arrayStrings;
        arrayStrings = new String[3];
        arrayStrings[0] = "Eko";
        arrayStrings[1] = "Kurniawan";
        arrayStrings[2] = "Khannedy";

        int[] arrayInt = new int[] {
                10, 90, 80, 67, 29
        };

        long[] arrayLong = {
                10, 90, 80, 67, 29
        };

        arrayLong[0] = 100;

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

        String[][] members = {
                { "Eko", "Kurniawan", "Khannedy" },
                { "Budi", "Nugraha" },
                { "Joko", "Morro" },
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][0]);
        System.out.println(members[2][0]);

        System.out.println("Tipe Data di Java");
    }
}
