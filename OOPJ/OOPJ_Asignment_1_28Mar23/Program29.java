class Program29{

    public static void main(String[] args){

        double a=11668.450005744;
        Double d= new Double(a);

        System.out.println("Value of Double in instance: "+d);

        byte b=d.byteValue();
        System.out.println("Value of Byte: "+b); //Calling an Instance Method byteValue();

        short sh=d.shortValue();
        System.out.println("Value of Short: "+sh); //Calling an Instance Method shortValue();

        int i=d.intValue();
        System.out.println("Value of Int: "+i); //Calling an Instance Method intValue();

        long l=d.longValue();
        System.out.println("Value of Long: "+l);

        float f=d.floatValue();
        System.out.println("Value of Float: "+f);



    }

}