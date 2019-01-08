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
   if_icmpne EQ_FALSE_4
   iconst_1
   goto EQ_END_5
EQ_FALSE_4:
   iconst_0
EQ_END_5:
   ifeq AND_ISZERO_6
   getfield B/b Z
   ifeq AND_ISZERO_6
   iconst_1
   goto AND_END_7
AND_ISZERO_6:
   iconst_0
AND_END_7:
   ifeq COND_ELSE_8
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "It's ok"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   goto COND_END_9
COND_ELSE_8:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "It's not ok"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
COND_END_9:
   iconst_0
   ireturn

.end method
