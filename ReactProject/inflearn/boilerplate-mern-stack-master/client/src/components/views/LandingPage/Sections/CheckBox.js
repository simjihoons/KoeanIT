import React, { useState } from "react";
import { Collapse, Checkbox } from "antd";
const { Panel } = Collapse;

function CheckBox(props) {
  const [Checked, setChecked] = useState([]);

  const handleToggle = (value) => {
    //누른 것의 index를 구하고
    const currentIndex = Checked.indexOf(value);
    //전체 checked된 state에서 현재 누른 checkbox가 이미 있다면
    const newChecked = [...Checked];

    if (currentIndex === -1) {
      //없다면 state에 넣어준다.
      newChecked.push(value);
      // 뺴주고
    } else {
      newChecked.splice(currentIndex, 1);
    }
    setChecked(newChecked);
    props.handleFilters(newChecked);
  };

  const renderCheckboxLists = () =>
    props.list &&
    props.list.map((value, index) => (
      <React.Fragment key={index}>
        <Checkbox
          onChange={() => {
            handleToggle(value._id);
          }}
          checked={Checked.indexOf(value._id) === -1 ? false : true}
        />
        <span>{value.name}</span>
      </React.Fragment>
    ));

  return (
    <>
      <Collapse defaultActiveKey={["1"]}>
        <Panel header="This is panel header 1" key="1">
          {renderCheckboxLists()}
        </Panel>
      </Collapse>
    </>
  );
}

export default CheckBox;
