.class public BinaryOperatorTest
.super java/lang/Object

.field protected expect LExpect;
.field protected resultBool Z
.field protected resultInt I
; default constructor
.method public <init>()V
   .limit locals 500
   .limit stack 100

   aload_0
   invokespecial java/lang/Object/<init>()V

   aload 0
   iconst_0
   putfield BinaryOperatorTest/resultBool Z
   aload 0
   iconst_0
   putfield BinaryOperatorTest/resultInt I
   return
.end method
.method public test(IZ)Z

   .limit locals 500
   .limit stack 100

   iconst_0
   istore 3
   aload_0
   new Expect
   dup
   invokespecial Expect/<init>()V
   putfield BinaryOperatorTest/expect LExpect;
   bipush 13
   istore 1
   iconst_1
   istore 2
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "Binary Operator Test :\n"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   aload_0
   aload_0
   iconst_1
    ineg
   iconst_1
   invokevirtual SecondClass/addTest(II)I
   putfield BinaryOperatorTest/resultInt I
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultInt I
   iconst_0
   ldc "\tAddTest :"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   istore 3
   aload_0
   aload_0
   iload 1
   iload 1
   invokevirtual SecondClass/addTest(II)I
   putfield BinaryOperatorTest/resultInt I
   iload 3
   ifeq AND_ISZERO_45
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultInt I
   bipush 26
   ldc "\tAddTest : Variable"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_45
   iconst_1
   goto AND_END_46
AND_ISZERO_45:
   iconst_0
AND_END_46:
   istore 3
   aload_0
   aload_0
   iload 1
   bipush 23
   invokevirtual SecondClass/addTest(II)I
   putfield BinaryOperatorTest/resultInt I
   iload 3
   ifeq AND_ISZERO_47
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultInt I
   bipush 36
   ldc "\tAddTest : var + const"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_47
   iconst_1
   goto AND_END_48
AND_ISZERO_47:
   iconst_0
AND_END_48:
   istore 3
   aload_0
   aload_0
   iconst_3
   iconst_0
   invokevirtual SecondClass/subTest(II)I
   putfield BinaryOperatorTest/resultInt I
   iload 3
   ifeq AND_ISZERO_49
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultInt I
   iconst_3
   ldc "\tSubTest : Constant"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_49
   iconst_1
   goto AND_END_50
AND_ISZERO_49:
   iconst_0
AND_END_50:
   istore 3
   aload_0
   aload_0
   iload 1
   iload 1
   invokevirtual SecondClass/subTest(II)I
   putfield BinaryOperatorTest/resultInt I
   iload 3
   ifeq AND_ISZERO_51
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultInt I
   iconst_0
   ldc "\tSubTest : Variable"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_51
   iconst_1
   goto AND_END_52
AND_ISZERO_51:
   iconst_0
AND_END_52:
   istore 3
   aload_0
   aload_0
   iload 1
   bipush 23
   invokevirtual SecondClass/subTest(II)I
   putfield BinaryOperatorTest/resultInt I
   iload 3
   ifeq AND_ISZERO_53
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultInt I
   bipush 10
    ineg
   ldc "\tSubTest : var + const"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_53
   iconst_1
   goto AND_END_54
AND_ISZERO_53:
   iconst_0
AND_END_54:
   istore 3
   aload_0
   aload_0
   iconst_3
   iconst_0
   invokevirtual SecondClass/multTest(II)I
   putfield BinaryOperatorTest/resultInt I
   iload 3
   ifeq AND_ISZERO_55
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultInt I
   iconst_0
   ldc "\tmultTest : Constant"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_55
   iconst_1
   goto AND_END_56
AND_ISZERO_55:
   iconst_0
AND_END_56:
   istore 3
   iconst_2
   istore 1
   aload_0
   aload_0
   iload 1
   iload 1
   invokevirtual SecondClass/multTest(II)I
   putfield BinaryOperatorTest/resultInt I
   iload 3
   ifeq AND_ISZERO_57
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultInt I
   iconst_4
   ldc "\tmultTest : Variable"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_57
   iconst_1
   goto AND_END_58
AND_ISZERO_57:
   iconst_0
AND_END_58:
   istore 3
   aload_0
   aload_0
   iload 1
   iconst_2
    ineg
   invokevirtual SecondClass/multTest(II)I
   putfield BinaryOperatorTest/resultInt I
   iload 3
   ifeq AND_ISZERO_59
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultInt I
   iconst_4
    ineg
   ldc "\tmultTest : var + const"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_59
   iconst_1
   goto AND_END_60
AND_ISZERO_59:
   iconst_0
AND_END_60:
   istore 3
   aload_0
   aload_0
   iconst_3
   iconst_1
   invokevirtual SecondClass/divTest(II)I
   putfield BinaryOperatorTest/resultInt I
   iload 3
   ifeq AND_ISZERO_61
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultInt I
   iconst_3
   ldc "\tdivTest : Constant"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_61
   iconst_1
   goto AND_END_62
AND_ISZERO_61:
   iconst_0
AND_END_62:
   istore 3
   aload_0
   aload_0
   iload 1
   iload 1
   invokevirtual SecondClass/divTest(II)I
   putfield BinaryOperatorTest/resultInt I
   iload 3
   ifeq AND_ISZERO_63
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultInt I
   iconst_1
   ldc "\tdivTest : Variable"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_63
   iconst_1
   goto AND_END_64
AND_ISZERO_63:
   iconst_0
AND_END_64:
   istore 3
   aload_0
   aload_0
   iconst_0
   iload 1
   invokevirtual SecondClass/divTest(II)I
   putfield BinaryOperatorTest/resultInt I
   iload 3
   ifeq AND_ISZERO_65
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultInt I
   iconst_0
   ldc "\tdivTest : var + const"
   invokevirtual Expect/equalInt(IILjava/lang/String;)Z
   ifeq AND_ISZERO_65
   iconst_1
   goto AND_END_66
AND_ISZERO_65:
   iconst_0
AND_END_66:
   istore 3
   aload_0
   aload_0
   iconst_1
   iconst_1
   invokevirtual SecondClass/andTest(ZZ)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_67
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_1
   ldc "\tandTest : Constant"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_67
   iconst_1
   goto AND_END_68
AND_ISZERO_67:
   iconst_0
AND_END_68:
   istore 3
   aload_0
   aload_0
   iload 2
   iload 2
   invokevirtual SecondClass/andTest(ZZ)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_69
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_1
   ldc "\tandTest : Variable"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_69
   iconst_1
   goto AND_END_70
AND_ISZERO_69:
   iconst_0
AND_END_70:
   istore 3
   aload_0
   aload_0
   iconst_0
   iload 2
   invokevirtual SecondClass/andTest(ZZ)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_71
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_0
   ldc "\tandTest : var + const"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_71
   iconst_1
   goto AND_END_72
AND_ISZERO_71:
   iconst_0
AND_END_72:
   istore 3
   aload_0
   aload_0
   iload 2
   iconst_0
   invokevirtual SecondClass/orTest(ZZ)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_73
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_1
   ldc "\torTest : Constant"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_73
   iconst_1
   goto AND_END_74
AND_ISZERO_73:
   iconst_0
AND_END_74:
   istore 3
   aload_0
   aload_0
   iload 2
   iload 2
    ifne NOT_NOTZERO_75
    iconst_1
    goto NOT_END_76
NOT_NOTZERO_75:
    iconst_0
NOT_END_76:
   invokevirtual SecondClass/orTest(ZZ)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_77
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_1
   ldc "\torTest : Variable"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_77
   iconst_1
   goto AND_END_78
AND_ISZERO_77:
   iconst_0
AND_END_78:
   istore 3
   aload_0
   aload_0
   iconst_0
   iload 2
    ifne NOT_NOTZERO_79
    iconst_1
    goto NOT_END_80
NOT_NOTZERO_79:
    iconst_0
NOT_END_80:
   invokevirtual SecondClass/orTest(ZZ)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_81
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_0
   ldc "\torTest : var + const"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_81
   iconst_1
   goto AND_END_82
AND_ISZERO_81:
   iconst_0
AND_END_82:
   istore 3
   aload_0
   aload_0
   iload 2
   iconst_1
   invokevirtual SecondClass/eqTest(ZZ)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_83
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_1
   ldc "\teqTest : Constant"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_83
   iconst_1
   goto AND_END_84
AND_ISZERO_83:
   iconst_0
AND_END_84:
   istore 3
   aload_0
   aload_0
   iload 2
   iload 2
    ifne NOT_NOTZERO_85
    iconst_1
    goto NOT_END_86
NOT_NOTZERO_85:
    iconst_0
NOT_END_86:
   invokevirtual SecondClass/eqTest(ZZ)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_87
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_0
   ldc "\teqTest : Variable"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_87
   iconst_1
   goto AND_END_88
AND_ISZERO_87:
   iconst_0
AND_END_88:
   istore 3
   aload_0
   aload_0
   iconst_0
   iload 2
   invokevirtual SecondClass/eqTest(ZZ)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_89
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_0
   ldc "\teqTest : var + const"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_89
   iconst_1
   goto AND_END_90
AND_ISZERO_89:
   iconst_0
AND_END_90:
   istore 3
   aload_0
   aload_0
   iload 2
   iconst_1
   invokevirtual SecondClass/neqTest(ZZ)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_91
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_0
   ldc "\tneqTest : Constant"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_91
   iconst_1
   goto AND_END_92
AND_ISZERO_91:
   iconst_0
AND_END_92:
   istore 3
   aload_0
   aload_0
   iload 2
   iload 2
    ifne NOT_NOTZERO_93
    iconst_1
    goto NOT_END_94
NOT_NOTZERO_93:
    iconst_0
NOT_END_94:
   invokevirtual SecondClass/neqTest(ZZ)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_95
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_1
   ldc "\tneqTest : Variable"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_95
   iconst_1
   goto AND_END_96
AND_ISZERO_95:
   iconst_0
AND_END_96:
   istore 3
   aload_0
   aload_0
   iconst_0
   iload 2
   invokevirtual SecondClass/neqTest(ZZ)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_97
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_1
   ldc "\tneqTest : var + const"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_97
   iconst_1
   goto AND_END_98
AND_ISZERO_97:
   iconst_0
AND_END_98:
   istore 3
   aload_0
   aload_0
   iconst_1
    ineg
   iconst_1
   invokevirtual SecondClass/ltTest(II)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_99
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_1
   ldc "\tltTest : Constant"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_99
   iconst_1
   goto AND_END_100
AND_ISZERO_99:
   iconst_0
AND_END_100:
   istore 3
   aload_0
   aload_0
   iload 1
   iconst_1
   isub
   iload 1
   invokevirtual SecondClass/ltTest(II)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_101
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_1
   ldc "\tltTest : Variable"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_101
   iconst_1
   goto AND_END_102
AND_ISZERO_101:
   iconst_0
AND_END_102:
   istore 3
   aload_0
   aload_0
   bipush 20
   iload 1
   invokevirtual SecondClass/ltTest(II)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_103
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_0
   ldc "\tltTest : var + const"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_103
   iconst_1
   goto AND_END_104
AND_ISZERO_103:
   iconst_0
AND_END_104:
   istore 3
   aload_0
   aload_0
   iconst_1
    ineg
   iconst_1
   invokevirtual SecondClass/gtTest(II)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_105
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_0
   ldc "\tgtTest : Constant"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_105
   iconst_1
   goto AND_END_106
AND_ISZERO_105:
   iconst_0
AND_END_106:
   istore 3
   aload_0
   aload_0
   iload 1
   iconst_1
   isub
   iload 1
   invokevirtual SecondClass/gtTest(II)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_107
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_0
   ldc "\tgtTest : Variable"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_107
   iconst_1
   goto AND_END_108
AND_ISZERO_107:
   iconst_0
AND_END_108:
   istore 3
   aload_0
   aload_0
   bipush 20
   iload 1
   invokevirtual SecondClass/gtTest(II)Z
   putfield BinaryOperatorTest/resultBool Z
   iload 3
   ifeq AND_ISZERO_109
   aload_0
   getfield BinaryOperatorTest/expect LExpect;
   aload_0
   getfield BinaryOperatorTest/resultBool Z
   iconst_1
   ldc "\tgtTest : var + const"
   invokevirtual Expect/equalBool(ZZLjava/lang/String;)Z
   ifeq AND_ISZERO_109
   iconst_1
   goto AND_END_110
AND_ISZERO_109:
   iconst_0
AND_END_110:
   istore 3
   iload 3
   ireturn

.end method
.method public addTest(II)I

   .limit locals 500
   .limit stack 100

   iload 1
   iload 2
   iadd
   ireturn

.end method
.method public subTest(II)I

   .limit locals 500
   .limit stack 100

   iload 1
   iload 2
   isub
   ireturn

.end method
.method public multTest(II)I

   .limit locals 500
   .limit stack 100

   iload 1
   iload 2
   imul
   ireturn

.end method
.method public divTest(II)I

   .limit locals 500
   .limit stack 100

   iload 1
   iload 2
   idiv
   ireturn

.end method
.method public andTest(ZZ)Z

   .limit locals 500
   .limit stack 100

   iload 1
   ifeq AND_ISZERO_111
   iload 2
   ifeq AND_ISZERO_111
   iconst_1
   goto AND_END_112
AND_ISZERO_111:
   iconst_0
AND_END_112:
   ireturn

.end method
.method public orTest(ZZ)Z

   .limit locals 500
   .limit stack 100

   iload 1
   ifne OR_ISONE_113
   iload 2
   ifne OR_ISONE_113
   iconst_0
   goto OR_END_114
OR_ISONE_113:
   iconst_1
OR_END_114:
   ireturn

.end method
.method public eqTest(ZZ)Z

   .limit locals 500
   .limit stack 100

   iload 1
   iload 2
   if_icmpne EQ_FALSE_115
   iconst_1
   goto EQ_END_116
EQ_FALSE_115:
   iconst_0
EQ_END_116:
   ireturn

.end method
.method public neqTest(ZZ)Z

   .limit locals 500
   .limit stack 100

   iload 1
   iload 2
   if_icmpeq NEQ_FALSE_117
   iconst_1
   goto NEQ_END_118
NEQ_FALSE_117:
   iconst_0
NEQ_END_118:
   ireturn

.end method
.method public ltTest(II)Z

   .limit locals 500
   .limit stack 100

   iload 1
   iload 2
   if_icmpge LT_FALSE_119
   iconst_1
   goto LT_END_120
LT_FALSE_119:
   iconst_0
LT_END_120:
   ireturn

.end method
.method public gtTest(II)Z

   .limit locals 500
   .limit stack 100

   iload 1
   iload 2
   if_icmple GT_FALSE_121
   iconst_1
   goto GT_END_122
GT_FALSE_121:
   iconst_0
GT_END_122:
   ireturn

.end method
