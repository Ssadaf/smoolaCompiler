.class public B
.super A

; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/A/<init>()V

   return
.end method
.method public binaryExprCheck()I

   .limit locals 500
   .limit stack 100

   iconst_0
   istore 1
   iconst_0
   istore 2
   iconst_0
   istore 3
   bipush 12
   iload 1
   idiv
   bipush 123
   bipush 12
   imul
   getfield B/fact I
   iadd
   iadd
   astore 1
   iload 2
   getfield B/fact I
   if_icmpne EQ_FALSE_5
   iconst_1
   goto EQ_END_6
EQ_FALSE_5:
   iconst_0
EQ_END_6:
   ifeq AND_ISZERO_7
   iload 3
   ifeq AND_ISZERO_7
   iconst_1
   goto AND_END_8
AND_ISZERO_7:
   iconst_0
AND_END_8:
   ifeq COND_ELSE_9
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "It's ok"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   goto COND_END_10
COND_ELSE_9:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "It's not ok"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
COND_END_10:
   iconst_0
   ireturn

.end method
