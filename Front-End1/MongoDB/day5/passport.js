const express = require("express");
const bodyParser = require("body-parser");
const logger = require("morgan");
const cookieParser = require("cookie-parser");
const expressSession = require("express-session");
const static = require("serve-static"); //페이지에 직접 접근 해주는 모듈
const path = require("path"); //url 접근을 해야 하므로 패스 모듈 설치
