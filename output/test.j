.class public test
.super java/lang/Object

; default constructor
.method public <init>()V
   aload_0
   invokespecial java/lang/Object/<init>()V

   aload 0
   putfield test/x [I
   aload 0
   putfield test/sth test;
   return
.end method
.method public testmeth(I)I

   .limit locals 500
   .limit stack 100

   iload 1
   iconst_0
   ifeq COND_ELSE_1
   iconst_5
   goto COND_END_2
COND_ELSE_1:
   iconst_3
COND_END_2:
   aload 1
   iconst_0
   if_icmple GT_FALSE_3
   iconst_1
   goto GT_END_4
GT_FALSE_3:
   iconst_0
GT_END_4:
   ifeq WHILE_END_5
   iconst_1
   aload 1
   isub
WHILE_END_5:
   iconst_3
   aload 1
    ineg
   imul
   bipush 10
   newarray int
   getstatic java/lang/System/out Ljava/io/PrintStream;
   getfield test/x [I
   arraylength
   invokevirtual java/io/PrintStream/println(I)V
   new test
   dup
   invokespecial test/<init>()V
   iconst_1
   ireturn

.end method
