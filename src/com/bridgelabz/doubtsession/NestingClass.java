package com.bridgelabz.doubtsession;

public class NestingClass
{
    String nest = "Main";
    void nested()
    {
        System.out.println(nest);
    }


    public class NewClass
    {
        int ext = 10;
        void newMethod()
        {
            System.out.println(ext);
            System.out.println("Nested class");
        }
        public class inClass
        {
            int in = 143;

            public int getIn() {
                return in;
            }

            public void setIn(int in) {
                this.in = in;
            }
        }
    }
    public static void main(String[] args)
    {
        NestingClass nestedOut = new NestingClass();
        nestedOut.nested();
        NestingClass.NewClass inner = nestedOut.new NewClass(); // Nested object created
        inner.newMethod();
        NewClass.inClass in = inner.new inClass();
        in.setIn(11); // Setter method
        System.out.println(in.getIn()); // Getter method
    }
}
