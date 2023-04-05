class Program25{

    public static void main(String[] args){

        float a=11668.45000F;
        Float f= new Float(a);

        System.out.println("Value of Float in instance: "+f);

        byte b=f.byteValue();
        System.out.println("Value of Byte: "+b); //Calling an Instance Method byteValue();

        short sh=f.shortValue();
        System.out.println("Value of Short: "+sh); //Calling an Instance Method shortValue();

        int i=f.intValue();
        System.out.println("Value of Int: "+i); //Calling an Instance Method intValue();

        long l=f.longValue();
        System.out.println("Value of Long: "+l);

        double d=l;
        System.out.println("Value of Double: "+d);



    }

}