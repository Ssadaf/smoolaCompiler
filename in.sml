class b {
    def main() : int {
        return arr[i];
    }
}


class Test1{
    var i: int;
    def method(): string{
        var j: string;
        j = "hello world!";
        return j;

    }
}

class Test2 extends Test1{
    var i:string;

}

class Test3 extends Test2{


}

class Test4 extends Test3{
}

class Test5 extends Test4{
        def method(): string{
                return j;
        }
}
