.class public UnaryOperatorTest
.super java/lang/Object

.field protected expect LExpect;
.field protected tempBool Z
.field protected tempInt I
; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   aload 0
   iconst_0
   putfield UnaryOperatorTest/tempBool Z
   aload 0
   iconst_0
   putfield UnaryOperatorTest/tempInt I
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
   aload_0
   iconst_0
   putfield UnaryOperatorTest/tempBool Z
   aload_0
   iconst_1
   putfield UnaryOperatorTest/tempInt I
   aload_0
   new Expect
   dup
   invokespecial Expect/<init>()V
   putfield UnaryOperatorTest/expect LExpect;
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "Unary Operator Test :\n"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   aload_0
   iconst_1
   invokevirtual UnaryOperatorTest/notTest(Z)Z
   istore 2
   aload_0
   getfield UnaryOperatorTest/expect LExpect;
   iload 2
   iconst_0
   ldc "\tNotTest : True"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   istore 1
   aload_0
   iconst_0
   invokevirtual UnaryOperatorTest/notTest(Z)Z
   istore 2
   iload 1
   ifeq AND_ISZERO_35
   aload_0
   getfield UnaryOperatorTest/expect LExpect;
   iload 2
   iconst_1
   ldc "\tNotTest : False"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_35
   iconst_1
   goto AND_END_36
AND_ISZERO_35:
   iconst_0
AND_END_36:
   istore 1
   aload_0
   aload_0
   getfield UnaryOperatorTest/tempBool Z
   invokevirtual UnaryOperatorTest/notTest(Z)Z
   istore 2
   aload_0
   getfield UnaryOperatorTest/expect LExpect;
   iload 2
   iconst_1
   ldc "\tNotTest : variable"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   istore 1
   aload_0
   iconst_1
   invokevirtual UnaryOperatorTest/minusTest(I)I
   istore 3
   iload 1
   ifeq AND_ISZERO_37
   aload_0
   getfield UnaryOperatorTest/expect LExpect;
   iload 3
   iconst_1
    ineg
   ldc "\tMinusTest : True"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_37
   iconst_1
   goto AND_END_38
AND_ISZERO_37:
   iconst_0
AND_END_38:
   istore 1
   aload_0
   iconst_0
   invokevirtual UnaryOperatorTest/minusTest(I)I
   istore 3
   iload 1
   ifeq AND_ISZERO_39
   aload_0
   getfield UnaryOperatorTest/expect LExpect;
   iload 3
   iconst_0
   ldc "\tMinusTest : False"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_39
   iconst_1
   goto AND_END_40
AND_ISZERO_39:
   iconst_0
AND_END_40:
   istore 1
   aload_0
   aload_0
   getfield UnaryOperatorTest/tempInt I
   invokevirtual UnaryOperatorTest/minusTest(I)I
   istore 3
   iload 1
   ifeq AND_ISZERO_41
   aload_0
   getfield UnaryOperatorTest/expect LExpect;
   iload 3
   iconst_1
    ineg
   ldc "\tMinusTest : variable"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_41
   iconst_1
   goto AND_END_42
AND_ISZERO_41:
   iconst_0
AND_END_42:
   istore 1
   iload 1
   ireturn

.end method
.method public minusTest(I)I

   .limit locals 500
   .limit stack 100

   iload 1
    ineg
   ireturn

.end method
.method public notTest(Z)Z

   .limit locals 500
   .limit stack 100

   iload 1
    ifne NOT_NOTZERO_43
    iconst_1
    goto NOT_END_44
NOT_NOTZERO_43:
    iconst_0
NOT_END_44:
   ireturn

.end method
