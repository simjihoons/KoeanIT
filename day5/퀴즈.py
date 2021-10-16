#%%
#5개의 정수를 입력받아 리스트에 저장하고
#최대값 , 최소값 , 총 합계 , 평균을 출력

list = []

for i in range(5):
    list.append(int(input("숫자 입력 : ")))
print(list)

print(f"최대값 : {max(list)}")
print(f"최소값 : {min(list)}")
print(f"총합계 : {sum(list)}")
print(f"평균 : {sum(list) / len(list)}")

#%% 
# 0을 입력받을때 까지 정수를 입력 받고
# 입력 받은 정수를 리스트에 저장한 후
# 최대,최소,총합 평균을 구하고
# 총합과 평균은 절대값으로
# 평균은 소숫점 둘째자리까지만 표현하여 출력

list = []

while True:
    num = int(input("숫자 입력 : "))
    if num == 0:
        break
    list.append(num)

print(list)
print(f"최대값 : {max(list)}")
print(f"최소값 : {min(list)}")
print(f"총합계 : {abs(sum(list))}")
print(f"평균 : {abs(round(sum(list) / len(list),2))}")    

#%% 전화번호 입력 받아서 뒷번호만 출력
#tel[-4:] 금지

tel = input("번호 :")
print(tel.split('-'))
print(tel.split('-')[2])

#%% 전화번호 입력 받아서 -를 제외하고 출력
tel = input("번호 : ")
print(tel.replace('-',''))

#%% end를 입력할때까지 데이터를 입력받고
# 입력한 데이터가 정수 형태의 값만 더하고 출력
sum = 0
while True:
    str = input("입력 :")
    if str == "end":
        break

    if str.isdecimal:
        sum += int(str)

print(sum)

#%%
# 학교 성적 관리 프로그램은
# 다음과 같이 쉼표로 구분된 문자열 형식이다.
# 이 데이터를 name과 score 변수에 저장하는 프로그램 구현

student = '"김철수",85'

name = student.split(',')[0].strip('"')
score = student.split(',')[1]

print(f"이름은 {name}이고, 점수는 {score}점")

#%%
# 리스트를 입력 받으면 평균을 구하고 소숫점 세번째 자리에서 
# 반올림 한 값을 반환하는 함수

def avgFunc(li):
    avg = sum(li) / len(li)
    return round(avg,2)

print(avgFunc([1,2,3,4,5]))

#%%
#음료수 = 0개 , 잔돈 = 3000원
#음료수 = 1개 , 잔돈 = 3000원 - 700
#음료수 = 2개 , 잔돈 = 3000원 - 700 - 700
#음료수 = 3개 , 잔돈 = 3000원 - 700 - 700 - 700

def vending_machine(money):
    cnt = money // 700
    # cnt = 0
    # while True: 
    #     if money >= 700:
    #         print(f"음료수 = {cnt} , 잔돈 = {money}")
    #         money -= 700
    #         cnt += 1

    for drink in range(cnt+1):
        change =  money - (700 * drink) 
        print(f"음료수 = {drink} , 잔돈 = {change}")

vending_machine(3000)

#%%
# 평균 체중 구하기

def standard_weight(height,gender):
    mi = height / 100
    if gender == 'M' :
        print(f"키 {height}의 표준 체중은 {round((mi * mi * 22),2)}입니다.")
    else:
        print(f"키 {height}의 표준 체중은 {round((mi * mi * 21),2)}입니다.")

standard_weight(int(input("키를 입력 :")),input("성별 입력 :"))     


    