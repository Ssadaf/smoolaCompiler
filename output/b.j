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

   getfield B/y I
   getfield B/fact I
   if_icmpne EQ_FALSE_1
   iconst_1
   goto EQ_END_2
EQ_FALSE_1:
   iconst_0
EQ_END_2:
   ifeq AND_ISZERO_3
   getfield B/b Z
   ifeq AND_ISZERO_3
   iconst_1
   goto AND_END_4
AND_ISZERO_3:
   iconst_0
AND_END_4:
   ifeq COND_ELSE_5
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "It's ok"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   goto COND_END_6
COND_ELSE_5:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "It's not ok"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
COND_END_6:
   iconst_0
   ireturn

.end method
