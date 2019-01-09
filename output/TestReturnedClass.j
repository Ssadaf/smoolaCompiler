.class public TestReturnedClass
.super java/lang/Object

.field protected expect LExpect;
.field protected returnedClass LReturnClass;
.field protected child LChild;
; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   return
.end method
.method public test()Z

   .limit locals 500
   .limit stack 100

   iconst_0
   istore 1
   iconst_0
   istore 2
   aload_0
   new Expect
   dup
   invokespecial Expect/<init>()V
   putfield TestReturnedClass/expect LExpect;
   aload_0
   new ReturnClass
   dup
   invokespecial ReturnClass/<init>()V
   putfield TestReturnedClass/returnedClass LReturnClass;
   aload_0
   getfield TestReturnedClass/returnedClass LReturnClass;
   invokevirtual ReturnClass/returnClass()LChild;
   invokevirtual Child/childMethod()I
   istore 1
   aload_0
   getfield TestReturnedClass/expect LExpect;
   iload 1
   bipush 127
   ldc "Returned class (Field) called its method"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   istore 2
   aload_0
   getfield TestReturnedClass/returnedClass LReturnClass;
   invokevirtual ReturnClass/returnClass()LChild;
   invokevirtual Child/parentMethod()I
   istore 1
   iload 2
   ifeq AND_ISZERO_141
   aload_0
   getfield TestReturnedClass/expect LExpect;
   iload 1
   bipush 127
   ldc "Returned class (Field) called parent's method"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_141
   iconst_1
   goto AND_END_142
AND_ISZERO_141:
   iconst_0
AND_END_142:
   istore 2
   aload_0
   getfield TestReturnedClass/returnedClass LReturnClass;
   invokevirtual ReturnClass/returnNewClass()LChild;
   invokevirtual Child/childMethod()I
   istore 1
   iload 2
   ifeq AND_ISZERO_143
   aload_0
   getfield TestReturnedClass/expect LExpect;
   iload 1
   bipush 127
   ldc "Returned class (new class()) called its method"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_143
   iconst_1
   goto AND_END_144
AND_ISZERO_143:
   iconst_0
AND_END_144:
   istore 2
   aload_0
   getfield TestReturnedClass/returnedClass LReturnClass;
   invokevirtual ReturnClass/returnNewClass()LChild;
   invokevirtual Child/parentMethod()I
   istore 1
   iload 2
   ifeq AND_ISZERO_145
   aload_0
   getfield TestReturnedClass/expect LExpect;
   iload 1
   bipush 127
   ldc "Returned class (new class()) called parent's method"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_145
   iconst_1
   goto AND_END_146
AND_ISZERO_145:
   iconst_0
AND_END_146:
   istore 2
   aload_0
   aload_0
   getfield TestReturnedClass/returnedClass LReturnClass;
   invokevirtual ReturnClass/returnLocalClass()LChild;
   putfield TestReturnedClass/child LChild;
   aload_0
   getfield TestReturnedClass/child LChild;
   invokevirtual Child/childMethod()I
   istore 1
   iload 2
   ifeq AND_ISZERO_147
   aload_0
   getfield TestReturnedClass/expect LExpect;
   iload 1
   bipush 127
   ldc "Returned class (Local variable) called its method"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_147
   iconst_1
   goto AND_END_148
AND_ISZERO_147:
   iconst_0
AND_END_148:
   istore 2
   aload_0
   getfield TestReturnedClass/child LChild;
   invokevirtual Child/parentMethod()I
   istore 1
   iload 2
   ifeq AND_ISZERO_149
   aload_0
   getfield TestReturnedClass/expect LExpect;
   iload 1
   bipush 127
   ldc "Returned class (Local variable) called parent's method"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_149
   iconst_1
   goto AND_END_150
AND_ISZERO_149:
   iconst_0
AND_END_150:
   istore 2
   aload_0
   getfield TestReturnedClass/child LChild;
   invokevirtual Child/returnItsField()I
   istore 1
   iload 2
   ifeq AND_ISZERO_151
   aload_0
   getfield TestReturnedClass/expect LExpect;
   iload 1
   bipush 126
   ldc "Returned class (Local variable) returns its field"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_151
   iconst_1
   goto AND_END_152
AND_ISZERO_151:
   iconst_0
AND_END_152:
   istore 2
   aload_0
   getfield TestReturnedClass/child LChild;
   invokevirtual Child/returnParentsField()I
   istore 1
   iload 2
   ifeq AND_ISZERO_153
   aload_0
   getfield TestReturnedClass/expect LExpect;
   iload 1
   bipush 127
   ldc "Returned class (Local variable) returns parent's field"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_153
   iconst_1
   goto AND_END_154
AND_ISZERO_153:
   iconst_0
AND_END_154:
   istore 2
   iload 2
   ireturn

.end method
