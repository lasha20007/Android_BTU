class Samkutxedi(p1: Point, p2: Point, p3: Point) : Shape {
    private val p1: Point
    private val p2: Point
    private val p3: Point

    init {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
    }

    override fun area() : Double {
        return 0.5 * (p1.x*(p2.y - p3.y) + p2.x*(p3.y - p1.y) + p3.x*(p1.y - p2.y))
    }

    override fun perimetri(): Double {
        val a = p1.distance(p2)
        val b = p2.distance(p3)
        val c = p3.distance(p1)

        return a + b + c
    }
}