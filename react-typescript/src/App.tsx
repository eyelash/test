import * as React from "react";

interface CustomComponentState {
  count: number;
}

class CustomComponent extends React.Component<{}, CustomComponentState> {
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

export class App extends React.Component {
  render() {
    return <CustomComponent/>;
  }
}
