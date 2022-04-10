import React, { useState } from "react";
import { Input } from "antd";
const { Search } = Input;

function SearchFeature(props) {
  const [SearchTerm, setSearchTerm] = useState("");

  const searchHandler = (e) => {
    setSearchTerm(e.currentTarget.value);

    // 타이핑한 값을 부모컨포넌트에 업데이트
    //랜딩페이지 updateSearchTerm함수에서 newSearchTerm
    props.refreshFunction(e.currentTarget.value);
  };

  return (
    <div
      style={{
        display: "flex",
        justifyContent: "flex-end",
        margin: "1rem auto",
      }}
    >
      <Search
        placeholder="input search text"
        onChange={searchHandler}
        style={{ width: 200 }}
        value={SearchTerm}
      />
    </div>
  );
}

export default SearchFeature;
