class Program9{

    public static void main(String[] args){

        byte a=10;
        Byte b= new Byte(a);

        System.out.println("Value of byte in instance: "+b);    

        short sh=b;
        System.out.println("Value of Short: "+sh);      

        int i=b;
        System.out.println("Value of Int: "+i);

        long l=b;
        System.out.println("Value of Long: "+l);

        float f=b;
        System.out.println("Value of Float: "+f);

        double d=b;
        System.out.println("Value of Double: "+d);



    }

}