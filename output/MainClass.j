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

   new Test
   dup
   invokespecial Test/<init>()V
   invokevirtual Test/main()I
   return

.end method
