class Program8{

        public static void main(String[] args)
        {
            byte b=10;
            String s=Byte.toString(b);

            System.out.println("Value in Byte: "+b);
            System.out.println("Value in String: "+s);  //Q.8.a

            Byte b1=new Byte(b);
            System.out.println("Value in Byte Instance: "+b1);  //Q.8.b

            byte b2=Byte.parseByte(s);
            System.out.println("Value in String to Byte: "+b2); //Q.8.c

        }
}