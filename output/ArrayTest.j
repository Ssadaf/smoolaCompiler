.class public ArrayTest
.super java/lang/Object

.field protected classArray [I
.field protected expect LExpect;
.field protected result Z
; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   aload 0
   iconst_0
   putfield ArrayTest/result Z
   return
.end method
.method public test()Z

   .limit locals 500
   .limit stack 100

   new BinaryOperatorTest
   dup
   invokespecial BinaryOperatorTest/<init>()V
   astore 2
   iconst_2
   newarray int
   astore 1
   aload_0
   iconst_3
   newarray int
   putfield ArrayTest/classArray [I
   aload_0
   new Expect
   dup
   invokespecial Expect/<init>()V
   putfield ArrayTest/expect LExpect;
   aload_0
   getfield ArrayTest/classArray [I
   iconst_0
   bipush 13
   iastore
   aload_0
   getfield ArrayTest/classArray [I
   iconst_1
   bipush 26
   iastore
   aload_0
   getfield ArrayTest/classArray [I
   iconst_2
   bipush 39
   iastore
   aload 1
   iconst_0
   bipush 26
    ineg
   iastore
   aload 1
   iconst_1
   bipush 13
    ineg
   iastore
   aload_0
   getfield ArrayTest/classArray [I
   iconst_0
   aload 1
   iconst_1
   iaload
   iastore
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "Array Test:"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   aload_0
   aload 2
   aload 1
   iconst_1
   iaload
    ineg
   iconst_1
   invokevirtual BinaryOperatorTest/test(IZ)Z
   putfield ArrayTest/result Z
   aload_0
   aload_0
   getfield ArrayTest/expect LExpect;
   aload_0
   getfield ArrayTest/result Z
   iconst_1
   ldc "Array element in binary operators :"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   putfield ArrayTest/result Z
   aload_0
   aload_0
   getfield ArrayTest/result Z
   ifeq AND_ISZERO_123
   aload_0
   getfield ArrayTest/expect LExpect;
   iconst_5
   aload 1
   arraylength
   aload_0
   getfield ArrayTest/classArray [I
   arraylength
   iadd
   ldc "Array length :"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_123
   iconst_1
   goto AND_END_124
AND_ISZERO_123:
   iconst_0
AND_END_124:
   putfield ArrayTest/result Z
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "Array elements:"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   aload 1
   iconst_0
   iaload
   invokevirtual java/io/PrintStream/println(I)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   aload 1
   iconst_1
   iaload
   invokevirtual java/io/PrintStream/println(I)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "Printed array:"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   aload 1
   invokestatic java/util/Arrays/toString([I)Ljava/lang/String;
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   aload_0
   getfield ArrayTest/result Z
   ireturn

.end method
