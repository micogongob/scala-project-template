import com.example.template.model

import com.example.template.model.Context
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import java.util.UUID

class Context extends AnyFlatSpec with Matchers {
  behavior of "Context"

  it should "set member fields" in {
    // given
    val info = Context(
      UUID.randomUUID().toString,
      UUID.randomUUID().toString
    )

    // expect
    info.greeting should not be empty
    info.target should not be empty
  }
}