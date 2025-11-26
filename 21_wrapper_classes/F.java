class F {
    public static void main(String[] args) {
        Byte a = (byte)230;       // result: -26
        Short b = (short)45000;   // result: -20536
        Character c = (char)-1;   // result: 65535

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }    
}
