import com.example.app

import com.example.app.Application
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

  private val mockedHelper = mock[ScalaProjectHelper]

  before {
    Application.setHelper(mockedHelper)
  }

  it should "fetch details from helper" in {
    // given
    (mockedHelper.getAppInfo _).expects().returning(ApplicationInfo("test", "0.0.1"))

    // expect
    noException should be thrownBy Application.main(Array())
  }
}