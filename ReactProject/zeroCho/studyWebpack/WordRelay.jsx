const React = require("react");
const { Component } = React;

class WordRelay extends Component {
  state = {
    word: "제로초",
    value: "",
    result: "",
  };

  render() {
    return <h1>{this.state.text}</h1>;
  }
}

module.exports = WordRelay;
