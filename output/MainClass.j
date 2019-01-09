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

   new Three
   dup
   invokespecial Three/<init>()V
   iconst_1
   iconst_2
   invokevirtual Three/threeMethod(II)LTwo;
   invokevirtual Two/twoMethod()I
   return

.end method
