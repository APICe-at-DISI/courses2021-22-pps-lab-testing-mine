package testLecture.code.e4bdd.steps

import io.cucumber.scala.{EN, ScalaDsl}
import org.junit.jupiter.api.Assertions

class MyFeatureSteps extends ScalaDsl with EN:
  var (a, b, prod) = (0, 0, 0)

  Given("""^one operand (\d+)$"""){ a = (_:Int) }
  Given("""^another operand (\d+)$"""){ b = (_:Int) }
  When("""^I multiply them together$"""){ prod = a*b  }
  Then("""^I should obtain result (\d+)$"""){ (expectedProduct: Int) =>
    Assertions.assertEquals(expectedProduct, prod)
  }
