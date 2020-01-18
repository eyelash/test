import kotlin.browser.document
import React.createElement

fun main() {
	ReactDOM.render(createElement(CustomComponent::class.js, null), document.getElementById("root"))
}
