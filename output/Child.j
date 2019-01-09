.class public Child
.super Parent

.field protected childField I
; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial Parent/<init>()V

   aload 0
   iconst_0
   putfield Child/childField I
   return
.end method
.method public childMethod()I

   .limit locals 500
   .limit stack 100

   aload_0
   ireturn

.end method
.method public returnItsField()I

   .limit locals 500
   .limit stack 100

   aload_0
   bipush 126
   putfield Child/childField I
   aload_0
   getfield Child/childField I
   ireturn

.end method
.method public returnParentsField()I

   .limit locals 500
   .limit stack 100

   aload_0
   getfield Child/parentField I
   ireturn

.end method
