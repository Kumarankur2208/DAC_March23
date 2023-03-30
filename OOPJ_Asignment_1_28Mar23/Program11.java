class Program11{


    public static void main(String[] args){

        String str=args[0];
        char ch=str.charAt(0);

        System.out.println(ch);

        boolean id=Character.isDigit(ch);

        if(id==true){
            int codePoint=(int) ch;
            System.out.println("It is Digit: "+ch+" And it's codepoint: "+codePoint);            
        }
        else{
            System.out.println("It is Not a Digit");


            if(Character.isLowerCase(ch)==true)
            {
                char chu=Character.toUpperCase(ch);
                int cpu= (int)chu;
                System.out.println("In UpperCase: "+chu+" And it's codepoint: "+cpu);
            }
            else if(Character.isUpperCase(ch)==true)
            {
                char chl=Character.toLowerCase(ch);
                int cpl= (int)chl;
                System.out.println("In LowerCase: "+chl+" And it's codepoint: "+cpl);
            }



        }


         
        

    }
}