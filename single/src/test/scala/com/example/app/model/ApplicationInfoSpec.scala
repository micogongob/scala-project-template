import com.example.app.model

import com.example.app.model.ApplicationInfo
import org.scalatest.{FlatSpec, Matchers}
import java.util.UUID

class ApplicationInfoSpec extends FlatSpec with Matchers {
  behavior of "ApplicationInfo"

  it should "set member fields" in {
    val info = ApplicationInfo(
      UUID.randomUUID().toString,
      UUID.randomUUID().toString
    )

    info.name should not be empty
    info.version should not be empty
  }
}