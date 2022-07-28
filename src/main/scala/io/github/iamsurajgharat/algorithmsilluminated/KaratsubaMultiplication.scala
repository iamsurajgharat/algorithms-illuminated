package io.github.iamsurajgharat
package algorithmsilluminated

object KaratsubaMultiplication {
    def apply(num1:String, num2:String):String = {
        val l1 = num1.size
        val l2 = num2.size
        if(l1 == 0 || l2 == 0)
            ""
        else if(num1.size == 1 && num2.size == 1)
            (toInt(num1.charAt(0)) * toInt(num2.charAt(0))).toString()
        else {
            val maxLen = getImmediateTwoRaise(max(l1, l2), 1)
            val x = pad(num1, '0', maxLen)
            val y = pad(num2, '0', maxLen)

            val a = x.substring(0, maxLen / 2)
            val b = x.substring(maxLen / 2)

            val c = y.substring(0, maxLen / 2)
            val d = y.substring(maxLen / 2)

            val f1 = padRight(apply(a,c), '0', maxLen).toInt
            val f2 = padRight((apply(a,d).toInt + apply(b,c).toInt).toString(), '0', maxLen / 2).toInt
            val f3 = apply(b,d).toInt
            (f1 + f2 + f3).toString()
        }
    }

    private def toInt(ch:Char):Int = ch - 48
    private def max(x:Int, y:Int) = if(x > y) x else y
    private def getImmediateTwoRaise(min:Int, curr:Int):Int = {
        if(curr >= min)
            curr
        else
            getImmediateTwoRaise(min, curr << 1)
    }

    private def pad(data:String, padChar:Char, maxLen:Int):String = {
        val padLen = maxLen - data.size
        if(padLen <= 0) data else buildRepeatString(padLen, padChar) + data
    }

    private def padRight(data:String, padChar:Char, padLen:Int):String = data + buildRepeatString(padLen, padChar)

    private def buildRepeatString(len:Int, padChar:Char):String = if(len == 0) "" else padChar + buildRepeatString(len-1, padChar)
}