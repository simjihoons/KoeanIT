# 내장함수
# 사용자 함수

#%% (1) eval()
print(eval("3+3"))

calc = input("계산기 :")
print(eval(calc))

#%% (2) format
print(format(10000,'_'))

#%% (3) 숫자 내장함수
# abs() , max() , min() , round() , sum()
pi = 3.14152

print(round(pi,2))

#%% 시퀀스 내장 함수
# sorted() , enumerate() , range() , len()


# %% 문자열 내장 함수
text = "i am Ironman"
print(text.replace("i am", "you are"))

# split()
tel = "010-1234-5678"

tel.split('-')

# strip()
text = "[a]"
text.strip("[")

#%% 사용자 지정 함수
'''
def 함수명(매개변수):
    본문
    return 반환값
'''
def function1(n,m):
    rs = n + m
    return rs

function1(3,5)
# print(rs2)