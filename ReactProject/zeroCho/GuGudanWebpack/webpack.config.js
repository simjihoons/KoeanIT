const path = require("path");

module.exports = {
  mode: "development",
  devtool: "eval", // production 일때는 hidden-source-map
  resolve: {
    extensions: [".jsx", ".js"],
  },
  entry: {
    name: "./client",
  },
  module: {
    rules: [
      {
        test: /\.jsx?$/,
        loader: "babel-loader",
        options: {
          presets: [
            [
              "@babel/preset-env",
              {
                target: {
                  browsers: [">5% in KR", "last 2 chrome versions"], //한국에서 점유율이 5%이상인 브라우저에게만 적용 (browserslist)
                },
              },
            ],
            "@babel/preset-react",
          ],
          //plugins: ["@babel/plugin-proposal-class-properties"],
        },
      },
    ],
  },
  output: {
    filename: "app.js",
    path: path.join(__dirname, "dist"),
  },
};
