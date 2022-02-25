const path = require("path");

module.exports = {
  name: "word-relay-setting",
  mode: "development", // 실서비스에서는 production
  devtool: "eval", //빠르게 하겠다는 뜻
  resolve: {
    extensions: [".jsx", ".js"],
  },

  entry: {
    //입력
    //app: ["./client.jsx", "./WordRelay.jsx"],  client.jsx에서 wordrelay를 불러오고 있기 때문에 생략이 가능
    app: ["./client"],
  },

  module: {
    rules: [
      {
        //여러개의 규칙을 적용할 수 있기 때문에 배열
        test: /\.jsx?/, //정규 표현식 js와 jsx에 룰을 적용하겠다.
        loader: "babel-loader",
        options: {
          //babel의 옵션
          presets: ["@babel/preset-env", "@babel/preset-react"],
          plugins: ["@babel/plugin-proposal-class-properties"],
        },
      },
    ],
  },

  output: {
    //출력
    path: path.join(__dirname, "dist"), // node.js 기술
    filename: "app.js",
  },
};
