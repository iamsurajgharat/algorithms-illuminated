import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._
import io.github.iamsurajgharat.algorithmsilluminated.KaratsubaMultiplication

class KaratsubaMultiplicationSpec extends AnyFlatSpec with Matchers {
    "KaratsubaMultiplication" should "return 25 for 5 * 5" in {
        val result = KaratsubaMultiplication("5", "5")
        result shouldBe("25")
    }

    it should "return 225 for 15 * 15" in {
        val result = KaratsubaMultiplication("15", "15")
        result shouldBe("225")
    }

    it should "return 19065 for 155 * 123" in {
        val result = KaratsubaMultiplication("155", "123")
        result shouldBe("19065")
    }

    it should "return 7006652 for 1234 * 5678" in {
        val result = KaratsubaMultiplication("1234", "5678")
        result shouldBe "7006652"
    }

    it should "return 2468 for 1234 * 2" in {
        val result = KaratsubaMultiplication("1234", "2")
        result shouldBe "2468"
    }
}