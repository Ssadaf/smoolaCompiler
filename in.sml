##Created By Farzad
class MainClass
{
    def main() : int
    {

        writeln("Hello This is a test");
        writeln("Factorial of 6 is :");
        writeln(new A().calculateFactorial(6));
        new B().binaryExprCheck();
        new FakeMain().fakeMain();
        return 0;
    }
}
class FakeMain
{
    def fakeMain() : int
    {
        var arr : int[];
        arr = new int[10];
        writeln("Sorted : ");
        writeln(arr);
        return 0;
    }
}
class A
{
    var fact : int;
    def calculateFactorial(input : int) : int
    {
        var i : int;
        var n : int;
        i = input;
        fact = 1;
        while(i <> 0)
        {
            fact = fact * i;
            i = i - 1;
        }

        return fact;
    }

}
class B extends A
{
    def binaryExprCheck() : int
    {
        var x : int;
        var y : int;
        var b : boolean;

        x = fact + 12 * 123 + x / 12;
        if( (y == fact) && b ) then
        {
            writeln("It's ok");
        }
        else
        {
            writeln("It's not ok");
        }

        return 0;
    }
}
