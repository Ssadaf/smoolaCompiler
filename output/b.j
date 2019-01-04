.class public b
.super java/lang/Object

; default constructor
.method public <init>()V
   aload_0
   invokespecial java/lang/Object/<init>()V
   return
.end method

.method public static main([Ljava/lang/String;)V

   .limit locals 1000
   .limit stack 1000

   getstatic java/lang/System/out Ljava/io/PrintStream;
   iconst_4
   iconst_3
   iconst_2
   imult
   bipush 10
   iadd
   iadd
   invokevirtual java/io/PrintStream/println(I)V
   return

.end method
