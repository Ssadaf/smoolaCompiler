.class public Three
.super Two

; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial Two/<init>()V

   return
.end method
.method public threeMethod(II)Two;

   .limit locals 500
   .limit stack 100

   new Two
   dup
   invokespecial Two/<init>()V
   astore 3
   aload 3
   areturn

.end method
