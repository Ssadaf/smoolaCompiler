.class public ReturnClass
.super java/lang/Object

.field protected child Child;
; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   return
.end method
.method public returnClass()Child;

   .limit locals 500
   .limit stack 100

   aload_0
   new Child
   dup
   invokespecial Child/<init>()V
   putfield ReturnClass/child Child;
   aload_0
   getfield ReturnClass/child Child;
   areturn

.end method
.method public returnNewClass()Child;

   .limit locals 500
   .limit stack 100

   new Child
   dup
   invokespecial Child/<init>()V
   areturn

.end method
.method public returnLocalClass()Child;

   .limit locals 500
   .limit stack 100

   new Child
   dup
   invokespecial Child/<init>()V
   astore 1
   aload 1
   areturn

.end method
