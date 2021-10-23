#%% 
# 금액과 세금을 입력받으면
# 해당 금액에서 세금 액을 반환하는 메소드
# 세금을 입력 하지 않는다면 1% 로 계산

def TaxCal(pay,tax = 1):
     rs = pay * (tax/100)
     return print(f"{pay}원에 대한 세금은 {rs}원입니다.")

TaxCal(10000,2)
TaxCal(10000)



#%% 커피 주문 문제

qMsg = "주문 하실 커피를 입력하세요\n1. 아메리카노\n2. 카페라떼\n3. 카푸치노\n"
menu = {
    "아메리카노" : 1000,
    "카페라떼" : 1500,
    "카푸치노" : 2000
}

def Coffee(money , name):
    print(f"{money}원에 {name}을 선택 하셨습니다.")

    if name in menu:
        if menu[name] > money:
            return print("잔액 부족")
        else:
            return print(f"잔돈 : {money - menu[name]}")
    else:
        return print(f"없는 메뉴입니다. {money}")
        
order = input(qMsg)
pay = int(input("돈 입력 : "))

Coffee(pay,order)

#%%
#가변 매개변수로 정수 혹은 실수를 입력하면
# 입력받은 매개변수의 총 합을 반환하는 함수

def m_sum(*args):
    sum = 0
    for i in args:
        sum += i
    return sum

#m_sum(10,20,10.1)
m_sum(10,2.0,3.14,50)

#%%
#가변 매개변수로 정수 혹은 실수를 입력하면
# 입력받은 매개변수의 총 합과 평균을 반환하는 함수
# 소수점 3번째까지

def m_cal(*args):
    sum = 0
    for i in args:
        sum += i
    avg = sum / len(args)
    return print(f"총합 : {round(sum,3)} \n평균 : {round(avg,3)}")

m_cal(10,2.0,3.14,9)

#%% 리스트를 입력 받으면 총합,평균 최대값, 최소값을 반환하는 함수 작성
def cal(arg):
    return max(arg),min(arg),sum(arg),sum(arg)/len(arg)
print(cal([1,2,3,4,5]))

#%% 리스트와 데이터를 입력 받아 리스트에 저장하는 함수를 작성
# 단, 리스트 길이가 5 이상이면 '리스트 길이 초과'출력
# 리스트에 데이터를 추가하지 않고 함수를 종료

def my_append(li,data):
    if len(li) >= 5:
        print("리스트 길이 초과")
        return
    else:
        li.append(data)
       

li = []
for i in range(10):
    my_append(li,i)
print(li)

#%%
#'매수종목1.txt' 파일을 생성 한 수
# 다음과 같이 종목 코드를 파일에 써보세요
'''
005930 삼성전자
005380 현대차
035420 NAVER
'''

file = open("매수종목1.txt",'w',encoding='utf-8')
file.write("005930 삼성전자\n")
file.write("005380 현대차\n")
file.write("035420 NAVER\n")
file.close()

#%%
# 나라별 수도를 순차적으로 반복시켜
# nation 리스트에 저장해 두었다.
# 내용을 이용하여 다음과 같은 nation.txt파일을 만들어 보세요

nation = ['그리스' ,'아테네' ,'독일' ,'베를린' ,'러시아' ,'모스크바' ,'미국' ,'워싱턴']

# nation.txt 내부
#그리스-아테네
#---
#미국-워싱턴




file = open("nation.txt",'w',encoding="utf-8")
for i in range(0,len(nation),2):
    file.write(f"{nation[i]}-{nation[i+1]}\n")
file.close()