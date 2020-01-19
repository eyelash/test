import React.createElement

class CustomComponentState(val count: Int) {}

class CustomComponent(props: Any): React.Component<Any, CustomComponentState>(props) {
  init {
    state = CustomComponentState(0)
  }

  fun handleClick() {
    setState { state, _ -> CustomComponentState(state.count + 1) }
  }

  override fun render(): dynamic {
    return createElement(
      "button",
      object {
        @JsName("onClick")
        val onClick = this@CustomComponent::handleClick
      },
      "CLICK ME (", state.count, ")")
  }
}
