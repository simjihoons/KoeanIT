#%% (1) if 

a = int(input("정수 하나 입력 "))
if a > 0:
    print("양수")
elif a < 0:
    print("음수")
else:
    print("0임")

#%% (2) while 문

n = 1
while n < 100:
    print(n)
    n += 1

#%% (3) for 문
list = ["B1","1층","2층","3층"]

for i in list:
    print(f"현재 {i} 입니다")

#%% (4) in 조건문
print('y' in "python")

#%% (5) enumerate()
a = [34,256,12,167,1]

for i,j in enumerate(a):
    print(i,j)

#%% (6) for
for i in range(100):
    print(i)

#%% (7) for dict

score = {"국어":100,"수학":50,"영어":80}

for i in score:
    print(i)

for i,j in score.items():
    print(i,j)

#%%
import random 

select_number = random.randrange(1,101)

tries = 0

while True:
    tries +=1 
    user_number = int(input("숫자 :"))

    if user_number > select_number:
        print("Down!")
        continue
    elif user_number < select_number:
        print("Up!")
        continue
    else:
        print(f"정답 {tries}번만에")
        break