import kotlin.math.pow
import kotlin.math.sqrt

class Point(x: Int, y: Int) {
    val x: Int
    var y: Int

    init {
        this.x = x
        this.y = y
    }

    override fun equals(other: Any?): Boolean {
        return other is Point && other.x == x && other.y == y
    }

    override fun toString(): String {
        return "(X:Y) ($x:$y)"
    }

    fun reverse() : Point {

        val x = this.x * -1
        val y = this.y * -1

        return Point(x, y)
    }

    fun distance(point: Point): Double {

        return sqrt((point.x - x).toDouble().pow(2) + (point.y - y).toDouble().pow(2))
    }
}