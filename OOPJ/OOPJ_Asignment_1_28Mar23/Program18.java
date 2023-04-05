class Program18{

    public static void main(String[] args){

        //int a=2020;
       // int b=1947;
       Integer a=new Integer(2020);
       Integer b=new Integer(1947);

        int max= (a>b)?a:b;
        int min= (a<b)?a:b;
        System.out.println("Max Value: "+max+" Min Value: "+min);

        Integer sum=new Integer(a+b);
        System.out.println("Sum using instance is: "+sum);



    }


}