.class public SecondClass
.super FirstClass

; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial FirstClass/<init>()V

   return
.end method
