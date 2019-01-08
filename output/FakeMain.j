.class public FakeMain
.super java/lang/Object

; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   return
.end method
.method public fakeMain()I

   .limit locals 500
   .limit stack 100

   bipush 10
   newarray int
   astore 1
   getstatic java/lang/System/out Ljava/io/PrintStream;
   aload 1
   invokestatic java/util/Arrays/toString([I)Ljava/lang/String;
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   iconst_0
   ireturn

.end method
