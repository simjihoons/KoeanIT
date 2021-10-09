#%% if 문
#조건문

a = 1

if a>0:
    print("양수")
elif a<0:
    print("음수")
else:
    print("0과 같음")
print("들여쓰기 아님")

#%%
if True:
    print("1" , end = ' ')
    print("2", end = ' ')
else:
    print("3", end = ' ')
print("4", end = ' ')

# 결과값 = 1,2,4

#%% 이중 조건문

if True:
    if False:
        print(1)
        print(2)
    else:
        print(3)
else:
    print(4)
print(5)

#=> 3 5

#%% 홀짝 구분
num = int(input("숫자 입력 :"))

if num % 2 == 0:
    print("짝수")
else:
    print("홀수")

#%% 
#홀짝 구분하기
num = int(input("숫자를 입력하세요 : "))

if num<0:
     print("양의 정수만 입력해주세요")
elif (num % 2 == 0):
    print("짝수입니다.")
elif (num % 2 == 1 ):
    print("홀수입니다.")

#%%
#사용자로부터 입력 받은 시간이 정각인지 판별하라
#실행 예)
#현재 시간을 입력하세요 : 3:15
#정각이아닙니다.

#현재 시간을 입력하세요 : 3:00
#정각이아닙니다.

time = input("시간 입력 : ")
if time[2:] == "00":
    print("정각입니다.")
else:
    print("정각이 아닙니다.")
#%%
#if-elif문
'''
if 조건식1:
    실행문
elif 조건식2:
    실행문
else:
    실행문
'''
#score를 입력받아 학점 출력
# 100~81 A
# 80~61 B
# 60~41 C
# 40~21 D
# 20~0 E
score = int(input("점수 입력 : "))

if score>80:
    print('A')
elif score>60:
    print('B')
elif score>40:
    print('C')
elif score>20:
    print('D')
else:
    print('E')
