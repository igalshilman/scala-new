import org.specs2.mutable.Specification

/**
  * Created by igalshilman on 20/02/2017.
  */
class MySpec extends Specification {
  "in this specification" should {
    "example 1 must be true" in {
      1 must_== 1
    }
    "where example 2 must be true" in {
      1 must_!=  2
    }
    "and the lists should be equal" in {
      List(1,2,3) must_== List(1,2,3)
    }
   }
}
