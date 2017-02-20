/**
  * Created by igalshilman on 20/02/2017.
  */
class MySpec extends org.specs2.mutable.Specification {
  "this is my specification" in {
    "where example 1 must be true" in {
      1 must_== 1
    }
    "where example 2 must be true" in {
      2 must_== 2
    }
  }
}
