import kotlin.browser.document
import ReactDSL.e

fun main() {
  ReactDOM.render(e(CustomComponent::class.js){}, document.getElementById("root"))
}
