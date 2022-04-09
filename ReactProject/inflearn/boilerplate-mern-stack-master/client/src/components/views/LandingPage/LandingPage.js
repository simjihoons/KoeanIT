import React, { useEffect } from "react";
import { FaCode } from "react-icons/fa";

// 백엔드에 요청을 보내기위해
import axios from "axios";

function LandingPage() {
  useEffect(() => {
    axios.post("/api/product/products").then((response) => {
      if (response.data.success) {
        console.log(response.data);
      } else {
        alert("상품들을 가져오는데 실패");
      }
    });
  }, []);

  return (
    <>
      <div>LandingPage</div>
    </>
  );
}

export default LandingPage;
