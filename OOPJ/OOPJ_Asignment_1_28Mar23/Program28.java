class Program28{

    public static void main(String[] args){

        double d=345789.541101795;
        String s=Double.toString(d);
        System.out.println("Double Value: "+d);
        System.out.println("Value in String: "+s);

        Double d1=new Double(d);
        System.out.println("Value in Double Instance: "+d1);

        String s1=new String(s);
        Double d2=new Double(s1);
        System.out.println("Value from String Instance in Double Instance: "+d2);

        

        

        long l=Double.doubleToLongBits(d);
        String binary=Long.toBinaryString(l);
        String octal=Long.toOctalString(l);
        String hex=Long.toHexString(l);

        System.out.println("Binary: "+binary);
        System.out.println("Octal: "+octal);
        System.out.println("Hexadecimal: "+hex);




    }
}