.class public Expect
.super java/lang/Object

; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   return
.end method
.method public equalInt(IILjava/lang/String;)Z

   .limit locals 500
   .limit stack 100

   iconst_0
   istore 4
   getstatic java/lang/System/out Ljava/io/PrintStream;
   aload 3
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   iload 2
   iload 1
   if_icmpne EQ_FALSE_27
   iconst_1
   goto EQ_END_28
EQ_FALSE_27:
   iconst_0
EQ_END_28:
   ifeq COND_ELSE_29
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "\t###### Passed ######"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   iconst_1
   istore 4
   goto COND_END_30
COND_ELSE_29:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "\t$$$$$$ Failed $$$$$$"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "\n\tOutput:"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 1
   invokevirtual java/io/PrintStream/println(I)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "\n\tExpceted:"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 2
   invokevirtual java/io/PrintStream/println(I)V
   iconst_0
   istore 4
COND_END_30:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc ""
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   iload 4
   ireturn

.end method
.method public equalBool(ZZLjava/lang/String;)Z

   .limit locals 500
   .limit stack 100

   iconst_0
   istore 4
   getstatic java/lang/System/out Ljava/io/PrintStream;
   aload 3
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   iload 1
   iload 2
   if_icmpne EQ_FALSE_31
   iconst_1
   goto EQ_END_32
EQ_FALSE_31:
   iconst_0
EQ_END_32:
   ifeq COND_ELSE_33
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "\t###### Passed ######"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   iconst_1
   istore 4
   goto COND_END_34
COND_ELSE_33:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "\t$$$$$$ Failed $$$$$$"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "\n\tOutput:"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 2
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "\n\tExpceted:"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 1
   iconst_0
   istore 4
COND_END_34:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc ""
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   iload 4
   ireturn

.end method
