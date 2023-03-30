class Program26{

    public static void main(String[] args){

        
       Float a=new Float(20202.202);
       Float b=new Float(19471.947);

        Float max= (a>b)?a:b;
        Float min= (a<b)?a:b;
        System.out.println("Max Value: "+max+"| Min Value: "+min);

        Float sum=new Float(a+b);
        System.out.println("Sum using instance is: "+sum);



    }


}