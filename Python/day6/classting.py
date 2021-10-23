#%% 디폴트 파라미터
# 기본 매개변수
# 반드시 뒤쪽에 작성 되어야 한다.
def function(writer,msg = "하이"):
    print(f"작성자 : {writer} , 메세지 : {msg}")

function("가나다")


function(msg = "gd",writer="me")
#%% 가변 매개 변수

def func(*args):
    #print(args)
    for item in args:
        print(f"{item} 입니다.")

func("홍길동","김철수","영희")


# %%

def profile(name,age,lang1,lang2,lang3):
    print(f"이름 : {name}, 나이 : {age}, 언어1 : {lang1}, 언어2 : {lang2}, 언어3 : {lang3}")

profile("유재석",50,"파이썬","자바","html")

# %%
def profile(name,age,*langs):
    print(name,age , end = ' ')
    for lang in langs:
        print(lang,end = ' ')
 
profile("유재석",50,"파이썬","자바","html")

#%% 다중 반환
def add_sub(a,b):
    return a+b , a-b

# 튜플로 반환
x,y = add_sub(3,4)
print(x,y)

#%% 함수 종료를 위한 return
def func(arg):
    arg = str(arg)
    if not arg.isdecimal():
        print("숫자 형태가 아닙니다.")
        return

    print(f"입력된 인자는 {arg} 입니다.")

func('a')

#%% 파일 입출력
#open('경로가 포함된 파일명' , 'w' or 'r' or 'a', encoding ='utf-8')
file = open('test.txt' , 'w',encoding='utf-8') #encoding 생략가능
for i in range(10):
    file.write('Hello world~\n')
file.close()
print("파일 쓰기 완료")
#%% 파일 읽기
file = open('test.txt' , 'r',encoding='utf-8')
contents = file.read()
file.close()
print(contents)

#%% 파일 내용 추가
file = open('test.txt','a',encoding='utf-8')
file.write('!!!!!!!')
file.close()
#%% 모듈
# 파이썬으로 작성된 파일
# 언제든지 쓸수있게 저장해놓은 변수나 함수나 클래스

#표준모듈
#내장모듈 과 외장 모듈

import random
# print(random.randrange(1,10,2))

seasons = ['spring','summer','fall','winter']
print(random.sample(seasons,2))

#%%
#로또 번호 뽑기

import random

list = []
for i in range(1,46):
    list.append(i)

print(random.sample(list,6))
#%% shuffle() 함수
# shuffle() 함수는 반환값이 없다.
# 리스트만 무작위로 섞어줌
seasons = ['spring','summer','fall','winter']

random.shuffle(seasons)
print(seasons)

#%%
import math
pi = math.pi

print(math.ceil(pi)) #올림
print(math.sqrt(25)) #제곱근
print(math.floor(pi)) #버림
print(math.pow(3,2)) #거듭제곱

#%% 
# 1970년 1월1일 0시0분0초를 기준으로 1초씩 카운트
import time
print(time.time())

time_sec = time.time()
print(time.ctime(time_sec))

#원하는 데로 출력
print(time.strftime("%Y-%m-%d %p %H:%M:%S"))

print("1"*20)
time.sleep(3) # 잠시 멈춤
print("2"*20)

#%%
import calendar
print(calendar.calendar(2021))

print(calendar.prmonth(2021,10))

#%%
import MySecure
print(MySecure.secure_name("홍길동"))
print(MySecure.secure_id("123456-1234567"))
print(MySecure.secure_tel("010-1234-4567"))

#필요한 것만 가져오기
from MySecure import secure_name
print(MySecure.secure_name("홍길동"))
print(MySecure.secure_id("123456-1234567"))
print(MySecure.secure_tel("010-1234-4567"))

#%%
# %% 외부 모듈
#pip install 모듈이름
