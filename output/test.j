.class public test
.super java/lang/Object

.field protected x I
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
   getfield null/x int
   aload 1
   imul
   iconst_1
   ireturn

.end method
