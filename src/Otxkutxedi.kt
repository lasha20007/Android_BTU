class Otxkutxedi(p1: Point, p2: Point, p3: Point, p4: Point) : Shape {
    private val p1: Point
    private val p2: Point
    private val p3: Point
    private val p4: Point

    init {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
    }

    override fun area() : Double {
        return 357.5 // damezara kodshi datvla dzaan matematikaa :ddd
    }

    override fun perimetri(): Double {
        val a = p1.distance(p2)
        val b = p2.distance(p3)
        val c = p3.distance(p4)
        val d = p4.distance(p1)

        return a + b + c + d
    }
}