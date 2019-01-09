class MainClass {
    def main() :int {
        new Three().threeMethod(1,2).twoMethod();
        return 0;
    }
}

class Two{
    var a : int;
    def twoMethod() : int{
        writeln("good boy");
        return 0;
    }
}

class Three extends Two{

    def threeMethod(x:int,y:int):Two{
        var t : Two;
                  t = new Two();
        return t;
    }
}