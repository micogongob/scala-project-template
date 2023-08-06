import com.example.app

import com.example.app.utils.ScalaProjectHelper
import com.example.app.model.ApplicationInfo
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.BeforeAndAfter
import org.scalamock.scalatest.MockFactory

class ApplicationSpec extends AnyFlatSpec
  with Matchers
  with BeforeAndAfter
  with MockFactory {
  behavior of "Application"

  private var mockedHelper: ScalaProjectHelper = _

  before {
    // TODO add mock and tests
  }

  it should "fetch details from helper" in {

  }
}