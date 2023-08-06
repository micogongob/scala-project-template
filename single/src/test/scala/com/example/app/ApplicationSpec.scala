import com.example.app

import com.example.app.utils.ScalaProjectHelper
import com.example.app.model.ApplicationInfo
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.BeforeAndAfter

class ApplicationSpec extends FlatSpec with Matchers with BeforeAndAfter {
  behavior of "Application"

  private var mockedHelper: ScalaProjectHelper = _

  before {
    
  }

  it should "fetch details from helper" in {

  }
}