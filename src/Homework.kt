import java.util.Collections.max
import kotlin.math.max

import kotlin.math.max

//fun main(){
//    val r1 = Point(3F,5F)
//    val r2  = Point(3F,5F)
//
//    println(r1)
//    println(r1 == r2)
//    println(r1.axis())
//
//}
//class Point(x:Float,y:Float){
//    var x:Float = x
//    val y:Float = y
//
//    override fun toString(): String {
//        return "($x; $y)"
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (other is Point){
//            if ((x == other.x) and  (y == other.y)){
//                return true
//            }
//        }
//        return false
//    }
//    fun axis () {
//        x = -x
//        return println ("სიმეტრია Y ღერძის მიმართ იქნება ($x,$y)")
//
//
//    }
//
//
//
//}


fun main(){
    var f1 = Fraction(2F,4F)
    var f2 = Fraction(4F,6F)

    println(f1)
    println(f1 == f2)
    println(f1.addition(f2))
    println(f1.multiplication(f2))
    println(f1.Reduction())

}
class Fraction(n:Float,d:Float){
   private var numerator:Float = n
   private var denominator:Float = d


    override fun equals(other: Any?): Boolean {
        if (other is Fraction){
            if (numerator * other.denominator/ denominator == other.numerator)
                return true
        }
        return false
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }
    fun Reduction() {
        fun maxusg (): Float {
            val max1 = max(numerator, denominator)
            var maxusg = 1
            for (i in max1.toInt() downTo 0) {
                if (numerator.toInt() % i == 0 && denominator.toInt() % i == 0){
                    maxusg = i
                    break
                }

            }
            return maxusg.toFloat()
        }
        val numerator1  = numerator / maxusg()
        val denominator1 = denominator / maxusg()
        return println ("$numerator1/$denominator1")
    }




    fun addition(other: Fraction) {
      val a =  other.denominator * denominator
        var numerator1 = numerator * other.denominator
        var numerator2 = other.numerator * denominator
        var b = numerator1 + numerator2
        return println("$b/$a")

    }
    fun multiplication(other: Fraction){
        val x = numerator * other.numerator
        val y = denominator * other.denominator
        return println("$x/$y")
    }


    }

