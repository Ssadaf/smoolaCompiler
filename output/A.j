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
   putfield A/fact I
   return
.end method
.method public calculateFactorial(I)I

   .limit locals 500
   .limit stack 100

   iload 1
   getfield A/i I
   iconst_0
   if_icmpeq NEQ_FALSE_1
   iconst_1
   goto NEQ_END_2
NEQ_FALSE_1:
   iconst_0
NEQ_END_2:
   ifeq WHILE_END_3
WHILE_END_3:
   getfield A/fact I
   ireturn

.end method
