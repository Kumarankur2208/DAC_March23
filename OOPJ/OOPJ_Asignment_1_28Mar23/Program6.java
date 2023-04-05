class Program6{

    public static void main(String[] args)
    {
        //Q.6.a
        boolean b=false;
        String s=Boolean.toString(b);

        System.out.println("Boolean : "+b); 
        System.out.println("String : "+s);

        System.out.println();

        //Q.6.b
        Boolean b1=new Boolean(b);          
        System.out.println("Boolean Instance : "+b1);

        System.out.println();

        //Q.6.c
        boolean b2=Boolean.parseBoolean(s); //OR boolean b2=Boolean.valueOf(s);
        System.out.println("String to Boolean : "+b2);
        
        System.out.println();

        //Q.6.d
        Boolean b3 = new Boolean(b2);
        System.out.println("String to Boolean Instance : "+b3);

        


    


    }

}