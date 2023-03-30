class Program22{

    public static void main(String[] args){

        //int a=2020;
       // int b=1947;
       Long a=new Long(20202);
       Long b=new Long(19471);

        long max= (a>b)?a:b;
        long min= (a<b)?a:b;
        System.out.println("Max Value: "+max+"| Min Value: "+min);

        Long sum=new Long(a+b);
        System.out.println("Sum using instance is: "+sum);



    }


}