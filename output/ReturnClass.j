.class public ReturnClass
.super java/lang/Object

.field protected child LChild;
; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   return
.end method
.method public returnClass()LChild;

   .limit locals 500
   .limit stack 100

   aload_0
   new Child
   dup
   invokespecial Child/<init>()V
   putfield ReturnClass/child LChild;
   aload_0
   getfield ReturnClass/child LChild;
   areturn

.end method
.method public returnNewClass()LChild;

   .limit locals 500
   .limit stack 100

   new Child
   dup
   invokespecial Child/<init>()V
   areturn

.end method
.method public returnLocalClass()LChild;

   .limit locals 500
   .limit stack 100

   new Child
   dup
   invokespecial Child/<init>()V
   astore 1
   aload 1
   areturn

.end method
