.class public Fibo
.super java/lang/Object

.field protected expect Expect;
; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   return
.end method
.method public normalFibo(I)I

   .limit locals 500
   .limit stack 100

   iconst_0
   istore 2
   iconst_0
   istore 3
   iconst_0
   istore 4
   iconst_0
   istore 5
   iconst_0
   istore 4
   iconst_0
   istore 2
   iconst_1
   istore 3
WHILE_START_125:
   iload 4
   iload 1
   if_icmpge LT_FALSE_126
   iconst_1
   goto LT_END_127
LT_FALSE_126:
   iconst_0
LT_END_127:
   ifeq WHILE_END_128
   iload 3
   istore 5
   iload 2
   iload 3
   iadd
   istore 3
   iload 5
   istore 2
   iload 4
   iconst_1
   iadd
   istore 4
   goto WHILE_START_125
WHILE_END_128:
   iload 2
   ireturn

.end method
.method public recursiveFibo(I)I

   .limit locals 500
   .limit stack 100

   iconst_0
   istore 2
   iconst_0
   istore 2
   iload 1
   iconst_0
   if_icmpge LT_FALSE_129
   iconst_1
   goto LT_END_130
LT_FALSE_129:
   iconst_0
LT_END_130:
   ifeq COND_ELSE_131
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "n < 0 occured in the fibo function!"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   iconst_1
    ineg
   istore 2
   goto COND_END_132
COND_ELSE_131:
   iload 1
   iconst_0
   if_icmpne EQ_FALSE_133
   iconst_1
   goto EQ_END_134
EQ_FALSE_133:
   iconst_0
EQ_END_134:
   ifeq COND_ELSE_135
   iconst_0
   istore 2
   goto COND_END_136
COND_ELSE_135:
   iload 1
   iconst_1
   if_icmpne EQ_FALSE_137
   iconst_1
   goto EQ_END_138
EQ_FALSE_137:
   iconst_0
EQ_END_138:
   ifeq COND_ELSE_139
   iconst_1
   istore 2
   goto COND_END_140
COND_ELSE_139:
   aload_0
   iload 1
   iconst_1
   isub
   invokevirtual SecondClass/recursiveFibo(I)I
   aload_0
   iload 1
   iconst_2
   isub
   invokevirtual SecondClass/recursiveFibo(I)I
   iadd
   istore 2
COND_END_140:
COND_END_136:
COND_END_132:
   iload 2
   ireturn

.end method
