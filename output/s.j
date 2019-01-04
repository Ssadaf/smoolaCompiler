.class public s
.super java/lang/Object

.method public someFunc()I

   .limit locals 1000
   .limit stack 1000

   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "Hello"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   ireturn

.end method
