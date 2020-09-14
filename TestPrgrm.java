public class TestPrgrm
{
   static class C
    {
       public B b=new B();
    }
   static class B
    {
      public C c=new C();
      public A a=new A();
    }
   static class A extends C
    {
      
    }
  public static void main(String[] args)
    {
        A a=new A();
        C c=new C();
        a.b.c=c.b.a;
        
    }
}
