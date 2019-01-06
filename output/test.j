.class public test
.super java/lang/Object

.field protected xI
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
   aload 1
   ireturn

.end method
