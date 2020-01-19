import ReactDSL.e

class CustomComponentState(val count: Int) {}

class CustomComponent(props: Any): React.Component<Any, CustomComponentState>(props) {
  init {
    state = CustomComponentState(0)
  }

  fun handleClick() {
    setState { state, _ -> CustomComponentState(state.count + 1) }
  }

  override fun render(): dynamic {
    return e("button", "onClick" to this::handleClick) {
      text("CLICK ME (", state.count, ")")
    }
  }
}
