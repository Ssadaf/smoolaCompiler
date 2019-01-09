.class public Test
.super java/lang/Object

; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   return
.end method
.method public main()I

   .limit locals 500
   .limit stack 100

   iconst_0
   istore 2
   iconst_0
   istore 3
   iconst_0
   istore 5
   new Expect
   dup
   invokespecial Expect/<init>()V
   astore 1
   new BabyTest
   dup
   invokespecial BabyTest/<init>()V
   astore 4
   aload 4
   invokevirtual BabyTest/test()I
   istore 5
   aload 1
   iload 5
   iconst_0
   ldc "BabyTest (variable):"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   istore 2
   iload 2
   aload 1
   new BabyTest
   dup
   invokespecial BabyTest/<init>()V
   invokevirtual BabyTest/test()I
   iconst_0
   ldc "BabyTest (new class):"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_1
   aload 1
   new BabyTest
   dup
   invokespecial BabyTest/<init>()V
   invokevirtual BabyTest/test()I
   iconst_0
   ldc "BabyTest (new class):"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_1
   iconst_1
   goto AND_END_2
AND_ISZERO_1:
   iconst_0
AND_END_2:
   istore 2
   new UnaryOperatorTest
   dup
   invokespecial UnaryOperatorTest/<init>()V
   astore 6
   aload 6
   invokevirtual UnaryOperatorTest/test()Z
   istore 3
   iload 3
   aload 1
   iload 3
   iconst_1
   ldc "Unary Opeartors Test :"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_3
   aload 1
   iload 3
   iconst_1
   ldc "Unary Opeartors Test :"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_3
   iconst_1
   goto AND_END_4
AND_ISZERO_3:
   iconst_0
AND_END_4:
   istore 3
   iload 3
   iload 2
   ifeq AND_ISZERO_5
   iload 2
   ifeq AND_ISZERO_5
   iconst_1
   goto AND_END_6
AND_ISZERO_5:
   iconst_0
AND_END_6:
   istore 2
   new BinaryOperatorTest
   dup
   invokespecial BinaryOperatorTest/<init>()V
   astore 7
   aload 7
   bipush 13
   iconst_1
   invokevirtual BinaryOperatorTest/test(IZ)Z
   istore 3
   iload 3
   aload 1
   iload 3
   iconst_1
   ldc "Binary Opeartors Test :"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_7
   aload 1
   iload 3
   iconst_1
   ldc "Binary Opeartors Test :"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_7
   iconst_1
   goto AND_END_8
AND_ISZERO_7:
   iconst_0
AND_END_8:
   istore 3
   iload 3
   iload 2
   ifeq AND_ISZERO_9
   iload 2
   ifeq AND_ISZERO_9
   iconst_1
   goto AND_END_10
AND_ISZERO_9:
   iconst_0
AND_END_10:
   istore 2
   new ArrayTest
   dup
   invokespecial ArrayTest/<init>()V
   astore 8
   aload 8
   invokevirtual ArrayTest/test()Z
   istore 3
   iload 3
   aload 1
   iload 3
   iconst_1
   ldc "Array Test :"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_11
   aload 1
   iload 3
   iconst_1
   ldc "Array Test :"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_11
   iconst_1
   goto AND_END_12
AND_ISZERO_11:
   iconst_0
AND_END_12:
   istore 3
   iload 3
   iload 2
   ifeq AND_ISZERO_13
   iload 2
   ifeq AND_ISZERO_13
   iconst_1
   goto AND_END_14
AND_ISZERO_13:
   iconst_0
AND_END_14:
   istore 2
   new TestReturnedClass
   dup
   invokespecial TestReturnedClass/<init>()V
   astore 9
   aload 9
   invokevirtual TestReturnedClass/test()Z
   istore 3
   iload 3
   aload 1
   iload 3
   iconst_1
   ldc "Class returning Test :"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_15
   aload 1
   iload 3
   iconst_1
   ldc "Class returning Test :"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_15
   iconst_1
   goto AND_END_16
AND_ISZERO_15:
   iconst_0
AND_END_16:
   istore 3
   iload 3
   iload 2
   ifeq AND_ISZERO_17
   iload 2
   ifeq AND_ISZERO_17
   iconst_1
   goto AND_END_18
AND_ISZERO_17:
   iconst_0
AND_END_18:
   istore 2
   new TestInheritedClasses
   dup
   invokespecial TestInheritedClasses/<init>()V
   astore 10
   aload 10
   invokevirtual TestInheritedClasses/test()Z
   istore 3
   iload 3
   aload 1
   iload 3
   iconst_1
   ldc "Inherited Classes Test :"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_19
   aload 1
   iload 3
   iconst_1
   ldc "Inherited Classes Test :"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_19
   iconst_1
   goto AND_END_20
AND_ISZERO_19:
   iconst_0
AND_END_20:
   istore 3
   iload 3
   iload 2
   ifeq AND_ISZERO_21
   iload 2
   ifeq AND_ISZERO_21
   iconst_1
   goto AND_END_22
AND_ISZERO_21:
   iconst_0
AND_END_22:
   istore 2
   new Fibo
   dup
   invokespecial Fibo/<init>()V
   astore 11
   iload 2
   aload 1
   aload 11
   bipush 6
   invokevirtual Fibo/normalFibo(I)I
   bipush 8
   ldc "Normal Fibo Test:"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_23
   aload 1
   aload 11
   bipush 6
   invokevirtual Fibo/normalFibo(I)I
   bipush 8
   ldc "Normal Fibo Test:"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_23
   iconst_1
   goto AND_END_24
AND_ISZERO_23:
   iconst_0
AND_END_24:
   istore 2
   iload 2
   aload 1
   aload 11
   bipush 6
   invokevirtual Fibo/recursiveFibo(I)I
   bipush 8
   ldc "Recursive Fibo Test:"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_25
   aload 1
   aload 11
   bipush 6
   invokevirtual Fibo/recursiveFibo(I)I
   bipush 8
   ldc "Recursive Fibo Test:"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_25
   iconst_1
   goto AND_END_26
AND_ISZERO_25:
   iconst_0
AND_END_26:
   istore 2
   aload 1
   iload 2
   iconst_1
   ldc "Test :"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   istore 2
   iconst_0
   ireturn

.end method
