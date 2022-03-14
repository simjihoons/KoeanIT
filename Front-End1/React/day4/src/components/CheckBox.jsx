import React, { Children } from "react";
import { MdCheckBox, MdCheckBoxOutlineBlank } from "react-icons/md";
import styles from "./checkbox.module.css";

// react-icons
// https://react-icons.github.io/react-icons/#/
//yarn add react-icons

function CheckBox({ children, checked, ...rest }) {
  return (
    <>
      <div className={styles.checkbox}>
        {/* <MdCheckBox />
        <MdCheckBoxOutlineBlank /> */}
        <label>
          <input type="checkbox" checked={checked} {...rest} />
          <div className={styles.icon}>
            {checked ? (
              <MdCheckBox className={styles.checked} />
            ) : (
              <MdCheckBoxOutlineBlank />
            )}
          </div>
        </label>
        <span>{children}</span>
      </div>
    </>
  );
}

export default CheckBox;
