.class public test
.super java/lang/Object

.field protected x [I
.field protected sth test;
; default constructor
.method public <init>()V
   aload_0
   invokespecial java/lang/Object/<init>()V
   return
.end method
.method public testmeth(I)I

   .limit locals 500
   .limit stack 100

   iload 1
   bipush 50
   iconst_3
   aload 1
    ineg
   imul
   bipush 10
   newarray int
   getstatic java/lang/System/out Ljava/io/PrintStream;
   getfield null/x int[]
   arraylength
   invokevirtual java/io/PrintStream/println(I)V
   new test
   dup
   invokespecial test/<init>()V
   iconst_1
   ireturn

.end method
