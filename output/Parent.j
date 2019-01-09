.class public Parent
.super java/lang/Object

.field protected expect Expect;
.field protected parentField I
; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   aload 0
   iconst_0
   putfield Parent/parentField I
   return
.end method
.method public parentMethod()I

   .limit locals 500
   .limit stack 100

   aload_0
   bipush 127
   putfield Parent/parentField I
   aload_0
   getfield Parent/parentField I
   ireturn

.end method
