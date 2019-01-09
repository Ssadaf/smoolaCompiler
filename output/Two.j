.class public Two
.super java/lang/Object

.field protected a I
; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   aload 0
   iconst_0
   putfield Two/a I
   return
.end method
.method public twoMethod()I

   .limit locals 500
   .limit stack 100

   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "good boy"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   iconst_0
   ireturn

.end method
