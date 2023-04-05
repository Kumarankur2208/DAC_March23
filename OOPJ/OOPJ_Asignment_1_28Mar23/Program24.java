class Program24{

    public static void main(String[] args){

        float f=345789.54110f;
        String s=Float.toString(f);
        System.out.println("Float Value: "+f);
        System.out.println("Value in String: "+s);

        Float f1=new Float(f);
        System.out.println("Value in Float Instance: "+f1);

        String s1=new String(s);
        Float f2=new Float(s1);
        System.out.println("Value from String Instance in Float Instance: "+f2);

       
        String hex=Float.toHexString(f);

        
        System.out.println("Hexadecimal: "+hex);

        
        

    }
}