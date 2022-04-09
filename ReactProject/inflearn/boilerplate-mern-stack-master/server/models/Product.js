const { Schema } = require("mongoose");
const mongoose = require("mongoose");

const ProductSchema = mongoose.Schema(
  {
    writer: {
      type: Schema.Types.ObjectId,
      ref: "User",
    },
    title: {
      type: String,
      maxlength: 50,
    },
    description: {
      type: String,
    },
    price: {
      type: Number,
      default: 0,
    },
    images: {
      type: Array,
      default: [],
    },
    sold: {
      type: Number,
      maxlength: 100,
      default: 0,
    },
    views: {
      type: Number,
      default: 0,
    },
  },
  //   timestamps => 등록시간도 같이 업데이트 할수있게
  { timestamps: true }
);

const Product = mongoose.model("Product", ProductSchema);

module.exports = { Product };
