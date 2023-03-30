class Program30{

    public static void main(String[] args){

        
       Double a=new Double(20202.2020202020);
       Double b=new Double(19471.94719471947);

        Double max= (a>b)?a:b;
        Double min= (a<b)?a:b;
        System.out.println("Max Value: "+max+"| Min Value: "+min);

        Double sum=new Double(a+b);
        System.out.println("Sum using instance is: "+sum);



    }


}