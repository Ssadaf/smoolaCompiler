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
   iconst_0
   istore 3
   iconst_0
   istore 4
   iload 1
   istore 2
WHILE_START_1:
   iload 2
   iconst_0
   if_icmpeq NEQ_FALSE_2
   iconst_1
   goto NEQ_END_3
NEQ_FALSE_2:
   iconst_0
NEQ_END_3:
   ifeq WHILE_END_4
   iload 4
   ifeq AND_ISZERO_4
   iconst_1
   ifeq AND_ISZERO_4
   iconst_1
   goto AND_END_5
AND_ISZERO_4:
   iconst_0
AND_END_5:
   istore 3
   aload_0
   iload 2
   aload_0
   getfield A/fact I
   imul
   putfield A/fact I
   iconst_1
   iload 2
   isub
   istore 2
   goto WHILE_START_5:
WHILE_END_6:
   aload_0
   getfield A/fact I
   ireturn

.end method
