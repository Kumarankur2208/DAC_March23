class Program21{

    public static void main(String[] args){

        long a=11666L;
        Long l= new Long(a);

        System.out.println("Value of Int in instance: "+l);

        byte b=l.byteValue();
        System.out.println("Value of Byte: "+b); //Calling an Instance Method byteValue();

        short sh=l.shortValue();
        System.out.println("Value of Short: "+sh); //Calling an Instance Method shortValue();

        int i=l.intValue();
        System.out.println("Value of Int: "+l); //Calling an Instance Method intValue();

        float f=l;
        System.out.println("Value of Float: "+f);

        double d=l;
        System.out.println("Value of Double: "+d);



    }

}