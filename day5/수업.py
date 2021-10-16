# 메소드 = 내장 함수
# 파이썬 내에 설치되어 있어서 import 없이 사용가능한 함수
# print() , input() , int() ---
#%% (1) eval()
# 식을 입력 받아 바로 계산하고 값 출력
expression = input("식을 입력 : ")
print(eval(expression))
#%% (2) format
# 문자열 내장함수
print(format(1000000,','))

#%% (3) 숫자 내장 함수 
'''
abs() : 절대값
max() : 최대값 
min() : 최소값
round() : 반올림
sum() : 합
'''

print(abs(-300))
print(max(1,2,3,4,5,6))
print(min(1,2,3,4,5,6))
print(round(3.14))
print(round(3.149958 , 2)) #소수 2번재자리까지

List = [1,2,3,4,5]
print(sum(List))

#%% (4) 시퀀스 내장 함수

'''
range() ,sort() , enumerate() 등 순서(배열)을 처리
len()
'''

list = [5,4,3,2,1]

print(sorted(list))
print(sorted(list , reverse=True))

#%% (5) split()
# 하나의 문자열을 여러개의 문자열로 분리해서 리스트로 변환
# 기본적으로는 공백을 기준으로 분리 한다.
# 특정 문자열을 기준으로 분리 할 수도 있다.

add = "부산광역시 해운대구 우동 자이"
print(add.split(' '))

tel = "010-1234-4565"
print(tel.split('-'))
#%% (6) strip()
#s = ' 파이썬' 처럼 앞이나 뒤 등 공백이 있을때 사용
s = '  Python     '
print(s.split())

#rstrip() - 오른쪽 공백 제거
#lstrip() - 왼쪽 공백 제거

#%% (7) replace()
# 문자열 일부 문자를 다른 문자로 바꾼 결과를 반환
str = "I am Ironman"
print(str)
new_str = str.replace("I am","You are")
print(new_str)
#%% (8) isdecimal()
#해당 문자열이 정수형인지 아닌지 구분해 bool형으로 반환

str1 = '1234'

print(str1.isdecimal())

#%% (9) count()
# 문자열 내부에 포함된 틀정 문자열의 개수를 반환
str = "00000000000000000O000000000000000000O0000"
print(str.count("O"))

str =""" 
내가 그린 기린 그림은 잘 그린 기린 그림이고,
니가 그린 기린 그림은 못 그린 기린 그림이다.
"""
print(str.count("기린"))

#%% ★ 함수 ★

'''
def 함수이름(매개변수):
    본문
    return 반환값
'''

# 매개변수 = parameter
# 반환값 = return

# 1. 함수 정의 : 사용자 함수를 만들어라.
# 2. 인수 : 사용자 함수에 전달할 입력을 의미(argment)
# 3. 매개변수 : 인수를 받아서 저장하는 변수 (parameter)
# 4. 반환값 = 사용자 함수의 출력부
# 5. 함수 호출 = 만들어진 함수를 사용할때

def fun(n,m):
    ans = n + m
    return ans

print(fun(1,2))

#파라미터가 없는 경우
def fun2():
    rs = "apple"
    return rs

rs2 = fun2()
print(rs2)

#리턴이 없는 경우
def fun3(i,j):
    print(i+j)
fun3(1,1)

#%% 
# 지역변수 : Local Variable
# 전역변수 : Global Variable


def print_var():
    var = "Hello World~" #지역
    print(var)

var =  "Hello Python" #전역

print_var()
print(var)

#%%
a = 0
def fun():
    a= 10
    print(f"local a : {a}")

fun()
print(f"global a : {a}")

#%% 함수를 이용한 계좌 출금 입금
def account():
    print("계좌 생성")

def deposit(money , balance):
    print(f"{money}원 입금. 잔액 {money+balance}원")
    return money + balance

def withdraw(money,balance):
    if balance >= money:
        print(f"{money}원 출금 , 잔액 {balance - money}")
        return balance - money
    else:
        print(f"잔액 부족 ,잔액 {balance}")
        return balance

def withdraw_night(money,balance):
    if balance >= (money + 100):
        print(f"{money}원 출금 , 잔액 {balance - money - 100} , 수수료{100}원")
        return balance - money - 100
    else:
        print(f"잔액 부족 ,잔액 {balance}")
        return balance

balance = 0
balance = deposit(3000, balance)


balance = withdraw_night(3000,balance)
    

