class Program13{

    public static void main(String[] args){

        short sh=50;

        String s=Short.toString(sh);
        System.out.println("Short in String: "+s);

        Short sh1=new Short(sh);
        System.out.println("Short in Instance: "+sh1);

        String s1=new String("60");

        Short sh2=new Short(s1);

        System.out.println("String Instacnce: "+s1+" To Short Instance: "+sh2);








    }



}