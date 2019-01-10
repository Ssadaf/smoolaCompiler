.class public TestInheritedClasses
.super java/lang/Object

.field protected secondClass LSecondClass;
.field protected firstClass LFirstClass;
.field protected expect LExpect;
; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   return
.end method
.method public test()Z

   .limit locals 500
   .limit stack 100

   iconst_0
   istore 1
   iconst_0
   istore 2
   iconst_0
   istore 3
   ldc "" 
   astore 4
   iconst_0
   istore 5
   aload_0
   new Expect
   dup
   invokespecial Expect/<init>()V
   putfield TestInheritedClasses/expect LExpect;
   aload_0
   new SecondClass
   dup
   invokespecial SecondClass/<init>()V
   putfield TestInheritedClasses/firstClass LFirstClass;
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "Inherited Classes:"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   aload_0
   getfield TestInheritedClasses/firstClass LFirstClass;
   bipush 13
   invokevirtual FirstClass/setFirstInt(I)Z
   istore 2
   aload_0
   getfield TestInheritedClasses/expect LExpect;
   aload_0
   getfield TestInheritedClasses/firstClass LFirstClass;
   invokevirtual FirstClass/getFirstInt()I
   bipush 13
   ldc "\tint field:"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   istore 1
   aload_0
   getfield TestInheritedClasses/firstClass LFirstClass;
   iconst_1
   invokevirtual FirstClass/setFirstBoolean(Z)Z
   istore 2
   aload_0
   getfield TestInheritedClasses/expect LExpect;
   aload_0
   getfield TestInheritedClasses/firstClass LFirstClass;
   invokevirtual FirstClass/getFirstBoolean()Z
   iconst_1
   ldc "\tboolean field:"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   istore 1
   iload 1
   ireturn

.end method
