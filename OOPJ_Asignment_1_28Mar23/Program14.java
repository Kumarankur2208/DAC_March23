class Program14{

    public static void main(String[] args){

        short a=100;
        Short s= new Short(a);

        System.out.println("Value of Short in instance: "+s);

        byte b=s.byteValue();
        System.out.println("Value of Byte: "+b); //Calling an Instance Method byteValue();

        int i=s;
        System.out.println("Value of Int: "+i);

        long l=s;
        System.out.println("Value of Long: "+l);

        float f=s;
        System.out.println("Value of Float: "+f);

        double d=s;
        System.out.println("Value of Double: "+d);



    }

}