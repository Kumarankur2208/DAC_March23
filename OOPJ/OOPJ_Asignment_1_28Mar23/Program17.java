class Program17{

    public static void main(String[] args){

        int a=1165846;
        Integer i= new Integer(a);

        System.out.println("Value of Int in instance: "+i);

        byte b=i.byteValue();
        System.out.println("Value of Byte: "+b); //Calling an Instance Method byteValue();

        short sh=i.shortValue();
        System.out.println("Value of Short: "+sh); //Calling an Instance Method shortValue();

        long l=i;
        System.out.println("Value of Long: "+l);

        float f=i;
        System.out.println("Value of Float: "+f);

        double d=i;
        System.out.println("Value of Double: "+d);



    }

}