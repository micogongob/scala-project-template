import com.example.template.commons.model

import com.example.template.commons.model.ApplicationInfo
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import java.util.UUID

class ApplicationInfoSpec extends AnyFlatSpec with Matchers {
  behavior of "ApplicationInfo"

  it should "set member fields" in {
    // given
    val info = ApplicationInfo(
      UUID.randomUUID().toString,
      UUID.randomUUID().toString
    )

    // expect
    info.name should not be empty
    info.version should not be empty
  }
}