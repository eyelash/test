@file:JsModule("react")
@file:JsNonModule
package React

external open class Component<P, S>(props: P) {
  open fun render(): dynamic
  val props: P
  var state: S
  fun setState(state: (S, P) -> S)
  fun setState(state: S)
}

external fun <P> createElement(type: dynamic, props: P?, vararg children: dynamic): dynamic
