.class public A
.super java/lang/Object

.field protected fact I
; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   aload 0
   iconst_0
   putfield A/fact I
   return
.end method
.method public calculateFactorial(I)I

   .limit locals 500
   .limit stack 100

   iconst_0
   istore 2
   iload 1
   istore 2
   aload_0
   iconst_1
   putfield A/fact I
   iload 2
   iconst_0
   if_icmpeq NEQ_FALSE_1
   iconst_1
   goto NEQ_END_2
NEQ_FALSE_1:
   iconst_0
NEQ_END_2:
   ifeq WHILE_END_3
   aload_0
   iload 2
   getfield A/fact I
   imul
   putfield A/fact I
   iconst_1
   iload 2
   isub
   astore 2
WHILE_END_3:
   getfield A/fact I
   ireturn

.end method
