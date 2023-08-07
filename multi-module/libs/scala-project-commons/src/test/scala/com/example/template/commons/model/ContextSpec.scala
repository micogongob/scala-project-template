import com.example.template.commons.model

import com.example.template.commons.model.Context
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import java.util.UUID

class ContextSpec extends AnyFlatSpec with Matchers {
  behavior of "Context"

  it should "set member fields" in {
    // given
    val info = Context(
      UUID.randomUUID().toString,
      UUID.randomUUID().toString
    )

    // expect
    info.name should not be empty
    info.version should not be empty
  }
}