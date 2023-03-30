class Program16{

    public static void main(String[] args){

        int i=345;
        String s=Integer.toString(i);
        System.out.println("Integer Value: "+i);
        System.out.println("Value in String: "+s);

        Integer i1=new Integer(i);
        System.out.println("Value in Integer Instance: "+i1);

        String s1=new String("456");
        Integer i2=new Integer(s1);
        System.out.println("Value from String Instance in Integer Instance: "+i2);

        String binary=Integer.toBinaryString(i);
        String octal=Integer.toOctalString(i);
        String hex=Integer.toHexString(i);

        System.out.println("Binary: "+binary);
        System.out.println("Octal: "+octal);
        System.out.println("Hexadecimal: "+hex);


    }
}