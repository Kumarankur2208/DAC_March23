class Program20{

    public static void main(String[] args){

        long l=345789l;
        String s=Long.toString(l);
        System.out.println("Long Value: "+l);
        System.out.println("Value in String: "+s);

        Long l1=new Long(l);
        System.out.println("Value in Long Instance: "+l1);

        String s1=new String(s);
        Long l2=new Long(s1);
        System.out.println("Value from String Instance in Long Instance: "+l2);

        String binary=Long.toBinaryString(l);
        String octal=Long.toOctalString(l);
        String hex=Long.toHexString(l);

        System.out.println("Binary: "+binary);
        System.out.println("Octal: "+octal);
        System.out.println("Hexadecimal: "+hex);




    }
}