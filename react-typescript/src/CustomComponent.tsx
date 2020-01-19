import * as React from "react";

interface CustomComponentState {
  count: number;
}

export class CustomComponent extends React.Component<{}, CustomComponentState> {
  constructor(props: {}) {
    super(props);
    this.state = {count: 0};
  }
  render() {
    return <button onClick={this.handleClick.bind(this)}>
      CLICK ME ({this.state.count})
    </button>;
  }
  handleClick() {
    this.setState(state => ({
      count: state.count + 1
    }));
  }
}
