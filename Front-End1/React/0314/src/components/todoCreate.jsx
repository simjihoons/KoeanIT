import React,{useState} from 'react';
import styled, {css} from 'styled-components';
import { MdAdd } from 'react-icons/md';
//yarn add react-icons


function TodoCreate({id, done, text}){


    return(
        <InsertFormPositioner>
            <InsertForm onSubmit={}>
              <Input placeholder='할 일을 입력 후, Enter를 누르세요' onChange={} value={} />
            </InsertForm>
        </InsertFormPositioner>    
    )
}


export default TodoCreate;