.class public b
.super java/lang/Object

.method public static main([Ljava/lang/String;)V

   .limit locals 1000
   .limit stack 1000

   getstatic java/lang/System/out Ljava/io/PrintStream;
   bipush 10
   invokevirtual java/io/PrintStream/println(I)V
   return

.end method
