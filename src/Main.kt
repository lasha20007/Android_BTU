fun main() {
    val p1 = Point(-10, 25)
    val p2 = Point(15,35)
    val p3 = Point(12, 50)
    val p4 = Point(18, 40)

    println("1) $p1")
    println("2) $p2")

    print("1 == 2 ? ")
    print(p1.equals(p2))

    print("\n2 == 1 ? ")
    print(p2.equals(p1))

    print("\n1 == 1 ? ")
    print(p1.equals(p1))

    println("\nreverse of $p1 is ${p1.reverse()}")
    println("reverse of $p2 is ${p2.reverse()}")

    val distP1P2 = p1.distance(p2)
    println("distance between p1 p2 is: $distP1P2")

    //abstract factory
    val samk = Samkutxedi(p1, p2, p3)
    println("\nsamkutxedi = A: $p1, B: $p2, C: $p3")
    println("area is " + samk.area())
    println("perimeter is " + samk.perimetri())

    val otxk = Otxkutxedi(p1, p2, p3, p4)
    println("\notxkutxedi = A: $p1, B: $p2, C: $p3, D: $p4")
    println("area is " + otxk.area())
    println("perimeter is " + otxk.perimetri())

}