class b {
    def main() : int {
       # writeln(10 + 2 * 3 + 4);
        return 1;
    }
}

class test {
     var x : int[];
     var sth : test;
     def testmeth( a : int) : int {
       if(false) then
           a = 5;
       else
           a = 3;
       while(a > 0)
           a = a -1;
       a = (-a) * 3;
       x = new int[10];
       writeln(x.length);
       sth = new test();
       return 1;
     }
}
