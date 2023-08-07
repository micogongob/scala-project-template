import com.example.template.core

import com.example.template.core.ConsoleApplication
import com.example.template.commons.utils.ScalaProjectHelper
import com.example.template.commons.model.Context
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.BeforeAndAfter
import org.scalamock.scalatest.MockFactory

class ConsoleApplicationSpec extends AnyFlatSpec
  with Matchers
  with BeforeAndAfter
  with MockFactory {
  behavior of "ConsoleApplication"

  private val mockedHelper = mock[ScalaProjectHelper]

  before {
    ConsoleApplication.setHelper(mockedHelper)
  }

  it should "fetch details from helper" in {
    // given
    (mockedHelper.getContext _).expects().returning(Context("test", "0.0.1"))

    // expect
    noException should be thrownBy ConsoleApplication.main(Array())
  }
}