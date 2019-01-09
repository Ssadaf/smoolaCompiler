.class public LoopTest
.super java/lang/Object

.field protected sortedArray [I
.field protected a I
.field protected b I
; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   aload 0
   iconst_0
   putfield LoopTest/a I
   aload 0
   iconst_0
   putfield LoopTest/b I
   return
.end method
.method public initArr([I)[I

   .limit locals 500
   .limit stack 100

   iconst_0
   istore 2
WHILE_START_11:
   iload 2
   bipush 10
   if_icmpge LT_FALSE_12
   iconst_1
   goto LT_END_13
LT_FALSE_12:
   iconst_0
LT_END_13:
   ifeq WHILE_END_14
   aload 1
   iload 2
   iload 2
   iastore
   iload 2
   iconst_1
   iadd
   istore 2
   goto WHILE_START_11
WHILE_END_14:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "Unsorted array :"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   aload 1
   invokestatic java/util/Arrays/toString([I)Ljava/lang/String;
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   aload 1
   areturn

.end method
.method public bubbleSort([I)[I

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
   istore 6
   iconst_0
   istore 5
   iconst_0
   istore 2
   iconst_0
   istore 3
   aload 1
   arraylength
   istore 4
WHILE_START_15:
   iload 2
   iload 4
   iconst_1
   isub
   if_icmpge LT_FALSE_16
   iconst_1
   goto LT_END_17
LT_FALSE_16:
   iconst_0
LT_END_17:
   ifeq WHILE_END_18
   iconst_0
   istore 5
   iconst_0
   istore 3
WHILE_START_19:
   iload 3
   iload 4
   iload 2
   isub
   iconst_1
   isub
   if_icmpge LT_FALSE_20
   iconst_1
   goto LT_END_21
LT_FALSE_20:
   iconst_0
LT_END_21:
   ifeq WHILE_END_22
   aload 1
   iload 3
   iaload
   aload 1
   iload 3
   iconst_1
   iadd
   iaload
   if_icmpge LT_FALSE_23
   iconst_1
   goto LT_END_24
LT_FALSE_23:
   iconst_0
LT_END_24:
   ifeq COND_ELSE_25
   aload_0
   aload 1
   iload 3
   iaload
   putfield LoopTest/a I
   aload_0
   aload 1
   iload 3
   iconst_1
   iadd
   iaload
   putfield LoopTest/b I
   aload_0
   invokevirtual LoopTest/swapAB()I
   istore 6
   aload 1
   iload 3
   aload_0
   getfield LoopTest/a I
   iastore
   aload 1
   iload 3
   iconst_1
   iadd
   aload_0
   getfield LoopTest/b I
   iastore
   iconst_1
   istore 5
   goto COND_END_26
COND_ELSE_25:
COND_END_26:
   iload 3
   iconst_1
   iadd
   istore 3
   goto WHILE_START_19
WHILE_END_22:
   iload 2
   iconst_1
   iadd
   istore 2
   goto WHILE_START_15
WHILE_END_18:
   aload_0
   aload 1
   putfield LoopTest/sortedArray [I
   aload 1
   areturn

.end method
.method public swapAB()I

   .limit locals 500
   .limit stack 100

   iconst_0
   istore 1
   aload_0
   getfield LoopTest/a I
   istore 1
   aload_0
   aload_0
   getfield LoopTest/b I
   putfield LoopTest/a I
   aload_0
   iload 1
   putfield LoopTest/b I
   iconst_0
   ireturn

.end method
