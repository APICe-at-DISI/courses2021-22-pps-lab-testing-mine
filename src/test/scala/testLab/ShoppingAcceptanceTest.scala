package testLab

import io.cucumber.scala.{EN, ScalaDsl}
import org.junit.jupiter.api.Assertions

class ShoppingAcceptanceTest extends ScalaDsl with EN:
  var warehouse: Warehouse = null
  var cart: Cart = null
  var shopping: Shopping = null
  val fakeCatalog: Catalog = new BasicCatalog(Map.empty)
  val stubbedLogger: Logger = new Logger:
    override def log(msg: String): Unit = { }

  Given("""a warehouse""") { () =>
    warehouse = new BasicWarehouse()
  }

  Given("""my initially empty cart""") { () =>
    cart = new BasicCart()
  }

  When("""I add one item""") { () =>
    shopping = new Shopping(warehouse, catalog = fakeCatalog, cart = cart, logger = stubbedLogger)
  }

  When("""the item is present in the warehouse""") { () =>
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.scala.PendingException()
  }

  Then("""I should have a cart with one item""") { () =>
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.scala.PendingException()
  }

