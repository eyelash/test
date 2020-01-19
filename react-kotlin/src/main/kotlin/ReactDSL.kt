package ReactDSL

import React.createElement

class ReactDSL {
  val children = mutableListOf<dynamic>()
  fun text(vararg values: Any) {
    for (value in values) {
      children.add(value)
    }
  }
  fun e(tag: Any, vararg attributes: Pair<String, Any>, block: ReactDSL.() -> Unit) {
    children.add(element(tag = tag, attributes = *attributes, block = block))
  }
}

fun e(tag: Any, vararg attributes: Pair<String, Any>, block: ReactDSL.() -> Unit): dynamic {
  return element(tag = tag, attributes = *attributes, block = block)
}

private fun element(tag: Any, vararg attributes: Pair<String, Any>, block: ReactDSL.() -> Unit): dynamic {
  val reactDSL = ReactDSL()
  reactDSL.block()
  return createElement(tag, attributes.toJsObject(), *reactDSL.children.toTypedArray())
}

fun Array<out Pair<Any, Any>>.toJsObject(): dynamic {
  val jsObject: dynamic = object {}
  for ((key, value) in this) {
    jsObject[key] = value
  }
  return jsObject
}
