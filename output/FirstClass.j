.class public FirstClass
.super java/lang/Object

.field protected intField I
.field protected stringField Ljava/lang/String;
.field protected boolField Z
.field protected arrayField [I
.field protected dummyField Dummy;
; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   aload 0
   iconst_0
   putfield FirstClass/intField I
   aload 0
   ldc 
   putfield FirstClass/stringField Ljava/lang/String;
   aload 0
   iconst_0
   putfield FirstClass/boolField Z
   return
.end method
.method public setFirstInt(I)Z

   .limit locals 500
   .limit stack 100

   aload_0
   iload 1
   putfield FirstClass/intField I
   iconst_1
   ireturn

.end method
.method public setFirstBoolean(Z)Z

   .limit locals 500
   .limit stack 100

   aload_0
   iload 1
   putfield FirstClass/boolField Z
   iconst_1
   ireturn

.end method
.method public setFirstString(Ljava/lang/String;)Z

   .limit locals 500
   .limit stack 100

   aload_0
   aload 1
   putfield FirstClass/stringField Ljava/lang/String;
   iconst_1
   ireturn

.end method
.method public setFirstArray([I)Z

   .limit locals 500
   .limit stack 100

   iconst_1
   ireturn

.end method
.method public setFirstDummy(Dummy;)Z

   .limit locals 500
   .limit stack 100

   aload_0
   aload 1
   putfield FirstClass/dummyField Dummy;
   iconst_1
   ireturn

.end method
.method public getFirstInt()I

   .limit locals 500
   .limit stack 100

   aload_0
   getfield FirstClass/intField I
   ireturn

.end method
.method public getFirstBoolean()Z

   .limit locals 500
   .limit stack 100

   aload_0
   getfield FirstClass/boolField Z
   ireturn

.end method
.method public getFirstString()Ljava/lang/String;

   .limit locals 500
   .limit stack 100

   aload_0
   getfield FirstClass/stringField Ljava/lang/String;
   areturn

.end method
.method public getFirstArray()[I

   .limit locals 500
   .limit stack 100

   aload_0
   getfield FirstClass/arrayField [I
   areturn

.end method
.method public getFirstDummy()Dummy;

   .limit locals 500
   .limit stack 100

   aload_0
   getfield FirstClass/dummyField Dummy;
   areturn

.end method
