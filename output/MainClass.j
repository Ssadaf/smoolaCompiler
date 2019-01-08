.class public MainClass
.super java/lang/Object

; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   return
.end method
.method public static main([Ljava/lang/String;)V

   .limit locals 500
   .limit stack 100

   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "Hello This is a test"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "Factorial of 6 is :"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   new A
   dup
   invokespecial A/<init>()V
   bipush 6
   invokevirtual java/io/PrintStream/println(I)V
   new B
   dup
   invokespecial B/<init>()V
   new FakeMain
   dup
   invokespecial FakeMain/<init>()V
   return

.end method
