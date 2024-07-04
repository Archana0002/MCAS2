class cpu
{
    float price;
    cpu(float price)
    {
        this.price=price;
    }
    void print()
    {
        System.out.println("price is: " + price);
    }
    class processor
    {
        int no_cores;
        String manf;
        processor(int no_cores,String manf)
        {
            this.no_cores=no_cores;
            this.manf=manf;
        }
        void printp()
        {
            System.out.println("no: of core is: "+no_cores);
            System.out.println("manufacturer is: "+manf);
        }
        
    }
    static class ram
    {
        int memory;
        String manu;
        ram(int memory,String manu)
        {
            this.memory=memory;
            this.manu=manu;
        }
        void printr(){
            System.out.println("memory is: "+memory);
            System.out.println("manufacturer is: "+manu);
        }
    }
}

class Main{
    public static void main(String args[])
    {
        cpu ob = new cpu(2000);
        ob.print();
        cpu.processor ob1 = ob.new processor(4,"intel");
        ob1.printp();
        cpu.ram ob2 = new cpu.ram(32,"ram manufacturer");
        ob2.printr();
    }
}
