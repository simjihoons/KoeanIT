import React, { useState } from "react";
import { Collapse, Radio } from "antd";
const { Panel } = Collapse;
function RadioBox(props) {
  const [Value, setValue] = useState(0);

  const renderRadioBox = () =>
    props.list &&
    props.list.map((value) => (
      <Radio key={value._id} value={value._id}>
        {value.name}
      </Radio>
    ));

  //라디오 버튼 하나만 클릭할수 있게
  const handleChange = (e) => {
    setValue(e.target.value);
    props.handleFilters(e.target.value);
  };
  return (
    <>
      <Collapse defaultActiveKey={["1"]}>
        <Panel header="Price" key="1">
          <Radio.Group onChange={handleChange} value={Value}>
            {renderRadioBox()}
          </Radio.Group>
        </Panel>
      </Collapse>
    </>
  );
}

export default RadioBox;
